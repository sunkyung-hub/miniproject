package miniproject;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository("md_DTO")
public class md_DTO {
	
	//md
	int midx;
	String mlink, mpic, mcom, mtitle;
	
	//week
	int bindex;
	String btag, btitle, baddr, bpart;
	String binfo, bdate, bin, bimg;
}
