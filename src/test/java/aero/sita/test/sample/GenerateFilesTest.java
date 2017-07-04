package aero.sita.test.sample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import aero.sita.src.sample.GenerateFiles;

public class GenerateFilesTest {
	
private GenerateFiles generator;
	
	/**
	 * Setup.
	 */
	@Before
	public void setUp(){
		generator = new GenerateFiles();
	}
	
	/**
	 * tearDown
	 */
	@After
	public void tearDown(){
		generator = null;
	}
	
	/**
	 * testProcessedFile.
	 */
	@Test
	public void testProcessedFileName(){
		Message<?> message = MessageBuilder.withPayload("test").setHeader("file_name", "validfile.txt").build();	
		generator.setFileExtension("PROCESSED");
		String generatedFileName = generator.generateFileName(message);
		Assert.assertEquals("File generated", "validfile.txt.PROCESSED", generatedFileName);
	}
	
	/**
	 * testOutputFile.
	 */
	@Test
	public void testOutputFileName(){
		Message<?> message = MessageBuilder.withPayload("test messages").setHeader("file_name", "validfile.txt").build();	
		generator.setFileExtension("OUTPUT");
		String generatedFileName = generator.generateFileName(message);
		Assert.assertEquals("File generated ", "validfile.txt.OUTPUT", generatedFileName);
	}
}
