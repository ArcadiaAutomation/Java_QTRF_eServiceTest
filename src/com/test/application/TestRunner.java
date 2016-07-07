package com.test.application;
import java.io.File;
import java.io.FileOutputStream;


//import org.apache.tools.ant.taskdefs.optional.junit.JUnitResultFormatter;
//import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter;

import org.junit.internal.TextListener;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

import com.qtrf.core.DriverManager;




public class TestRunner 
{		
	  public static void main(String... args)// throws ClassNotFoundException 
	  {
//	        String[] classAndMethod = args[0].split("#");
//	        Request request = Request.method(Class.forName(classAndMethod[0]),
//	                classAndMethod[1]);

//	        Result result = new JUnitCore().run(request);
	        
//	        Result result = new JUnitCore().run(Test1.class);
//	        System.exit(result.wasSuccessful() ? 0 : 1);
	        
	        JUnitCore core = new JUnitCore(); 
//			core.run(TestLogin.class);	        
	        core.addListener(new TextListener(System.out));
	        
	        
	       
			core.addListener(new JUnitResultFormatterAsRunListener(new XMLJUnitResultFormatter()) {
			    @Override
			    public void testStarted(Description description) throws Exception {
			        formatter.setOutput(new FileOutputStream(new File("C:\\Program Files (x86)\\Jenkins\\workspace\\JTest-eService\\report","TEST-"+description.getDisplayName()+".xml")));
			        super.testStarted(description);
			    }
			});
			core.run(TestLogin.class);

	   }
}  	