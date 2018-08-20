package parallel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.TestNG;

public class Parallel {

	public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, IOException, org.xml.sax.SAXException {
		TestNG testng = new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//src/test/resources/testng.xml"}));
		testng.setSuiteThreadPoolSize(2);	//	There are 2 test suits needs to be executed parallelly.  
		testng.run();
    }	

}
