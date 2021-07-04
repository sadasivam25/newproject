package SampleJune10;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({SampleLaunch1.class,SampleLaunch2.class,SampleLaunch3.class})

public class TrailTwo {

	
	public static void main(String []args) {
		Result runclasses = JUnitCore.runClasses(TrailTwo.class);
		
		int runcount = runclasses.getRunCount();
		System.out.println("Total Method Executing count:" + runcount);
		
		int ignorecount = runclasses.getIgnoreCount();
		System.out.println("Total Method Ignored;" + ignorecount);
		
		int failurecount = runclasses.getFailureCount();
		System.out.println("Total Failure Count:" + failurecount);
		
		List<Failure> failures = runclasses.getFailures();
		for (int i =0; i <failures.size(); i++) {
			String string = failures.get(i).toString();
			System.out.println("Failure Methods Name:"+ string);
		}
		
	}
}
