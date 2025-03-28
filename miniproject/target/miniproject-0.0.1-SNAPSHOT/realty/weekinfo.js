$(function(){
	fetch("../realty/json/week_data.json") //json파일 읽어옴
	.then((response) => response.json()) //읽어온 데이터를 json으로 변환
	.then((json)=>{
		let data2 = json.week_db; //json에 있는 md_db 받아오기
		let html3 = "";
		
		data2.forEach(element => { //배열의 개수만큼 반복문 돌림
			console.log(element) //배열 출력
		html3 +=`<li>
					<a href="http://localhost:8080/miniproject/realty/week_tails.jsp">
					<span>매매</span>
					<div>${element.bunyang_title}</div>
					<aside>${element.bunyang_addr}</aside>
					<span>${element.bunyang_part} | ${element.bunyang_info}</span><br>
					<label>${element.bunyang_date} | ${element.bunyang_in} </label>
					<div><img src="${element.bunyang_img}"></div>
				</li>
				</a>`
			});
			
			$('.weeklist').html(html3); //mdchoice.jsp와 연결
			/* weeklist는 ul의 class이므로,
			ul 태그 안에 위에 작성한 tag(html)가 html 값으로 들어감  */
		})
		.catch(error=>{
			console.log("error발생!");
		})
})