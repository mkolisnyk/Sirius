package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GetContentsTest {
	
	protected String[] contents = {
			"Line1",
			"Line2",
			"Line3",
			"Line4",
			"Line5"
	};
	protected String sourcePath = ".\\Test.txt";
	protected File source = null;
	protected String nonExSourcePath = ".\\TestNonEx.txt";
	protected File nonExSource = null;
	protected FileOperations fileOps = new FileOperations();

	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		nonExSource = new File(sourcePath);
		if(nonExSource.exists()){
			nonExSource.delete();
		}
		
		source = new File(sourcePath);
		if(source.exists()){
			source.delete();
		}
		source.createNewFile();
		FileWriter writer = new FileWriter(source.getAbsoluteFile());
		for(String line:contents){
			writer.append(line);
		}
		writer.close();
	}
	
	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void getContentsTest() {
		String result[] = fileOps.GetContents(source.getAbsolutePath());
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		for(int i=0;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
	}
	
	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void getContentsNonExistingFileTest() {
		String result[] = fileOps.GetContents(nonExSource.getAbsolutePath());
		Assert.assertNull(result, "Non-existing file returned non-empty content");
	}
	
	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void getContentsIndexTest() {
		String result[] = fileOps.GetContents(source.getAbsolutePath(),2);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		for(int i=2;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
		
		result = fileOps.GetContents(source.getAbsolutePath(),2,2);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 2,"The number of returned lines is incorrect" );
		for(int i=2;i<4;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
		
		result = fileOps.Head(source.getAbsolutePath(),2);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 2,"The number of returned lines is incorrect for Head method" );
		for(int i=0;i<2;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}

		result = fileOps.Tail(source.getAbsolutePath(),2);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 2,"The number of returned lines is incorrect for Tail method" );
		for(int i=contents.length-2;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
	}
	
	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void outOfTheBoundariesTest(){
		String result[] = fileOps.GetContents(source.getAbsolutePath(),contents.length);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 0,"The number of returned lines is incorrect" );
		
		result = fileOps.GetContents(source.getAbsolutePath(),contents.length-2,10);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 2,"The number of returned lines is incorrect" );
		
		for(int i=contents.length-2;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
				
		result = fileOps.Head(source.getAbsolutePath(),contents.length);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		for(int i=0;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
		
		result = fileOps.Tail(source.getAbsolutePath(),contents.length);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		for(int i=0;i<contents.length;i++){
			Assert.assertEquals(result[i], contents[i],"The file contents on the line " + i + "is unexpected" );
		}
		
		result = fileOps.Head(source.getAbsolutePath(),-1);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 0,"The number of returned lines is incorrect" );
		
		result = fileOps.Tail(source.getAbsolutePath(),-1);
		Assert.assertNotNull(result,"The returned content is unexpectly null");
		Assert.assertEquals(result.length, 0,"The number of returned lines is incorrect" );
	}
}
