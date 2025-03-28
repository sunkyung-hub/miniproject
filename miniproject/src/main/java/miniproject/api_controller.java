package miniproject;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
public class api_controller {

	PrintWriter pw = null;
	
	@Resource(name="md_DTO")
	md_DTO dto;
	
	@Resource(name="md_DAO")
	md_DAO dao;
	
	@GetMapping("/mdjson.do")
	public String mdchoice(HttpServletResponse res) {
		res.setContentType("text/html;charset=utf-8"); //언어셋
		
		try {
			this.pw = res.getWriter();
			List<md_DTO> result = this.dao.md_list();
			
			JSONObject alldata = new JSONObject();
			JSONArray ja = new JSONArray();
//			System.out.println(result);
			
			int a = 0;
			while(a<result.size()) {
				JSONObject jo = new JSONObject();
				jo.put("타이틀", result.get(a).mtitle);
				jo.put("상세내용", result.get(a).mcom);
				jo.put("이미지", result.get(a).mpic);
				jo.put("링크주소", result.get(a).mlink);
				ja.put(jo);
				a++;
			}
			alldata.put("md_db", ja);
			this.pw.print(alldata);
			this.pw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	
	}
	
	@GetMapping("/weekjson.do")
	public String weekdate(HttpServletResponse res) {
		res.setContentType("text/html;charset=utf-8"); //언어셋
		
		try {
			this.pw = res.getWriter();
			List<md_DTO> result2 = this.dao.week_list();
			
			JSONObject alldata2 = new JSONObject();
			JSONArray ja2 = new JSONArray();
//			System.out.println(result);
			
			int b = 0;
			while(b<result2.size()) {
				JSONObject jo2 = new JSONObject();
				jo2.put("bunyang_index", result2.get(b).bindex);
				jo2.put("bunyang_tag", result2.get(b).btag);
				jo2.put("bunyang_title", result2.get(b).btitle);
				jo2.put("bunyang_addr", result2.get(b).baddr);
				jo2.put("bunyang_part", result2.get(b).bpart);
				jo2.put("bunyang_info", result2.get(b).binfo);
				jo2.put("bunyang_date", result2.get(b).bdate);
				jo2.put("bunyang_in", result2.get(b).bin);
				jo2.put("bunyang_img", result2.get(b).bimg);
				ja2.put(jo2);
				b++;
			}
			alldata2.put("week_db", ja2);
			this.pw.print(alldata2);
			this.pw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	
	}
}
