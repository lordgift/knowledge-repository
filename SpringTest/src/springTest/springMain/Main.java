package springTest.springMain;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import springTest.springCal.SpringCalManager;
import springTest.springInterface.SpringInterface;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");
		SpringCalManager scm = (SpringCalManager)ctx.getBean("springCalManager");
		scm.testCal(1, 2);
	}

}
