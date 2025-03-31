package miniproject;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("week_DAO")
public class week_DAO {
	@Resource(name="template")
	public SqlSessionTemplate st;
	
	List<week_DTO> all = null;
	
	public List<week_DTO> week_list(){
		this.all = this.st.selectList("mproject.week_all");
		return all;
	}
}
