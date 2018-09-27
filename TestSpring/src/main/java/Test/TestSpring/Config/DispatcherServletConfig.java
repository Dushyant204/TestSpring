package Test.TestSpring.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages="Test.TestSpring")
@EnableWebMvc
public class DispatcherServletConfig extends WebMvcConfigurerAdapter {

	// ************************************************************
		// ************* This is a front Controller ****************
		// ************* It replace Dipacther-Servlet.xml ****************
		// ************************************************************
		
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
