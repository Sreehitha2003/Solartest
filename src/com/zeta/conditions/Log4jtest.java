package com.zeta.conditions;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
import static com.zeta.helper.Help.*;

public class Log4jtest {

	public static void main(String[] args) {
		try {
			int z = 1 / 0;
			function(Log4jtest.class).info("i");
			lg.info("Worked");
		} catch (Exception e) {
			lg.error(e);
		} finally {
			lg.info("woahhh");
		}
	}
}
