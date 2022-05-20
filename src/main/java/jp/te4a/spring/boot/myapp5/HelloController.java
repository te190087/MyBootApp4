package jp.te4a.spring.boot.myapp5;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@RequestMapping(value="/post", method=RequestMethod.POST)
	public ModelAndView postForm(@RequestParam("text1") String text1) {
	    ModelAndView mv = new ModelAndView("index");
	    mv.addObject("msg", "you write '" + text1 + "'!!!");
	    return mv;
	}
}