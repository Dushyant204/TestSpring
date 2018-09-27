package Test.TestSpring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {

		return "Page";
	}
	
	@RequestMapping("/home")
	public ModelAndView getPage() {
		ModelAndView mv=new ModelAndView("Page");
		mv.addObject("key","hello fiends");
		System.out.println("key has been added");
		return mv;
	}
	 
	
	// need to add jackson support dependency at POM file..
	@ResponseBody
	@RequestMapping("/homeRest")
	public List<String> getResponse() {
		List<String> ls=new ArrayList<>();
		
		ls.add("Amit");
		ls.add("Rahul");
		ls.add("Sunil");
		System.out.println("List have been  added");
		return ls;
	}
}
