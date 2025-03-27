package miniproject;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository("md_DTO")
public class md_DTO {
	
	int midx;
	String mlink, mpic, mcom, mtitle;
}
