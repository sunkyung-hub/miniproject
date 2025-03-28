package miniproject;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("md_DAO")
public class md_DAO {

	@Resource(name="template")
	public SqlSessionTemplate st;
	List<md_DTO> all = null;
	
		public List<md_DTO> md_list(){
			this.all = this.st.selectList("mproject.md_all");
			return all;
		}
	
		public List<md_DTO> week_list(){
			this.all = this.st.selectList("mproject.week_all");
			return all;
		}
	
}
