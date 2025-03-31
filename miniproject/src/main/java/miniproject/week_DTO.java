package miniproject;

import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository("week_DTO")
public class week_DTO {

	//week
		int bindex;
		String btag, btitle, baddr, bpart;
		String binfo, bdate, bin, bimg;
}
