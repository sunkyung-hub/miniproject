$(function(){
	
fetch("http://localhost:8080/miniproject/mdjson.do") //json파일 읽어옴
.then((response) => response.json()) //읽어온 데이터를 json으로 변환
.then((json)=>{
	data = json.md_db; //json에 있는 md_db 받아오기
	
	let html2 = "";
	
	data.forEach(element => { //배열의 개수만큼 반복문 돌림
		console.log(element) //배열 출력
	html2 +=`<a href="${element.링크주소}" target="_blank">
			<li><div><img src="${element.이미지}"></div>
				<span>${element.타이틀}</span>
				<div>${element.상세내용}</div>
			</div>	
		   </li>
			</a>`	
	
		});
		
		$('.mdlist').html(html2); //mdchoice.jsp와 연결
		/* mdlist는 ul의 class이므로,
		ul 태그 안에 위에 작성한 tag(html)가 html 값으로 들어감  */
	})
	.catch(error=>{
		console.log("error발생!");
	})
})