package org.launchcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheeseMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheeseMvcApplication.class, args);
	}
}



///2017-07-26 12:16:02.106 ERROR 7872 --- [nio-8080-exec-4] o.thymeleaf.templateparser.ErrorHandler  : [THYMELEAF][http-nio-8080-exec-4] Fatal error during parsing

///org.xml.sax.SAXParseException: The element type "THYMELEAF_ROOT" must be terminated by the matching end-tag "</THYMELEAF_ROOT>".