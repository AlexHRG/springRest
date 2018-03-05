package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@EnableAutoConfiguration
public class Application {

	private final static String RESTTEMPLATE = "http://graph.facebook.com/pivotalsoftware";
	
	public static void main(String[] args) {
		//for REST
		SpringApplication.run(Application.class, args);
		
		//for REST client
//		RestTemplate template = new RestTemplate();
//		Page page = template.getForObject(RESTTEMPLATE, Page.class);
//		
//		System.out.println("Name:    " + page.getName());
//        System.out.println("About:   " + page.getAbout());
//        System.out.println("Phone:   " + page.getPhone());
//        System.out.println("Website: " + page.getWebsite());
	}

}
