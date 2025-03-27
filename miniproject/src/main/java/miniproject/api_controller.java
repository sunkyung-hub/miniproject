package miniproject;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api_controller {

	PrintWriter pw = null;
	
	@Resource(name="md_DTO")
	md_DTO dto;
	
	@Resource(name="md_DAO")
	md_DAO dao;
	
	@GetMapping("/realty/mdchoice")
	public String mdchoice(HttpServletResponse res) {
		res.setContentType("text/html;charset=utf-8"); //언어셋
		
		try {
			this.pw = res.getWriter();
			
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
		return null;
		
		
	}
}
