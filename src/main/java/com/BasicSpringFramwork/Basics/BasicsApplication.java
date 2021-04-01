package com.BasicSpringFramwork.Basics;
import com.BasicSpringFramwork.Basics.XMLconfig.XMLdao;
import com.BasicSpringFramwork.Basics.XMLconfig.XMLjdbcConnection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicsApplication {

	public static void main(String[] args) {

		// Basically Dao is our Bean and we are wiring into Dependency called jdbc connection.
		// 1st way of creating beans and dependency.

  		 XMLdao xmLdao = new XMLdao(new XMLjdbcConnection());
			XMLjdbcConnection result = xmLdao.getXmLjdbcConnection();
		 	System.out.println("Get Connection :: "+result);

// !!----------------------------------------------------------------------------------------------------------!!

		// Now Insist of doing all the above things creating by own spring do things for us.
		// 2nd way of managing beans and dependencies.

		// Application context maintain all te beans
		// IN WITHOUT BOOT WE WILL CHANGE IN APPLICATION CONTEXT
//		try (ClassPathXmlApplicationContext applicationContext =
//					 new ClassPathXmlApplicationContext("applicationContext.xml")) {
//
//			XMLdao xmLdao2 = applicationContext.getBean(XMLdao.class);
//
//			System.out.println("Bean :: " + xmLdao2.getXmLjdbcConnection());
//
//		}
	}

}
