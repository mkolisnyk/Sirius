call mvn assembly:single -Dpackage.version=%1
git add -f target/Sirius-%1-release.zip
git commit -m "Publishing %1 release"
git push