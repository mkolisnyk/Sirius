echo "Creating folder structure"

echo "Building Java client modules"

cd ..
call mvn -f sirius.utils.retriever/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
echo java -jar sirius.utils.retriever/target/issueget-maven-plugin-%1.jar -r Sirius -u %GH_USER% -p %GH_PASS% -t trace
java -jar sirius.utils.retriever/target/issueget-maven-plugin-%1.jar -r Sirius -u %GH_USER% -p %GH_PASS% -t trace > ../wiki/Traceability-Matrix.md

cd ../wiki/
git pull
git commit -a -m "Traceability matrix update. Version: %1"
git push

cd ../sirius/

cd .\Publish
