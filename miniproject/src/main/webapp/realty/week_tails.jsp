<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금주 분양 매물 정보</title>
<link rel="stylesheet" type="text/css" href="./css/index.css?v=1">
<link rel="stylesheet" type="text/css" href="./css/week_tails.css?v=1">
</head>
<body>
<!--최상단-->
<header>
    <div class="top_banner"></div>
   </header>
    <!--최상단끝-->
   <!--메뉴-->
   <nav>
    <div class="menus">
      <ul class="menus_ul">
        <li><img src="./logo/e_click_logo.png"></li>
        <li>일반매물</li>
        <li>추천매물</li>
        <li>중계의뢰</li>
        <li>상담신청</li>
        <li>업체의뢰</li>
        <li>의뢰현황</li>
        <li class="logins">
          <!--
          홍길동님 환영합니다.[로그아웃]
          -->
          <span title="로그인"><img src="./ico/login.svg"></span>
          <span title="회원가입"><img src="./ico/membership.svg"></span>
        </li>
      </ul>
    </div>
   </nav>
    <!--메뉴끝-->
<main>
	<div class="weektails">
		<p>분양정보</p>
		<div id="weektails">
			<p>LH센트럴힐(공공임대)</p>
            <ul>
                <li>종류</li>
                <li>아파트 | 공공임대 </li>
                <li>주소</li>
				<li>서울시 송파구 문정동 12-2</li>
                <li>규모</li>
				<li>총 104세대 | 총 2개동</li>
                <li>시기</li>
				<li>2025.04 분양 | 2027.02 입주</li>
                <li>난방구조</li>
				<li>개별난방,도시가스</li>
                <li>건설사</li>
				<li>GS건설㈜</li>
                <li>사진정보</li>
				<li><img src="./room/room1.jpg"></li>
            </ul>
		</div>
        <div><button class="btn_css">방문예약</button></div>
        <div><button class="btn_close">방문예약완료</button></div>
	</div>
</main>
<!-- 카피라이터 -->
<footer>
    <div class="copyright">
      <ol>
        <li>
          <img src="./logo/e_click_logo.png" class="logos">
        </li>
        <li>
          <ul>
            <li>회사소개</li>
            <li>이용약관</li>
            <li>위치기반서비스 약관</li>
            <li>제휴문의</li>
            <li>개인정보처리방침</li>
            <li>신고센터</li>
          </ul>
        </li>
        <li>
          <ul>
            <li>저작권규약</li>
            <li>책임한계 및 법적고지</li>
            <li>이메일 무단수집거부</li>
            <li>고객센터문의</li>
            <li></li>
            <li></li>
          </ul>
        </li>
        <li>
          <ul>
            <li>e-Click 주식회사 | 대표 : 홍길동</li>
            <li>서울특별시 종로구 3가 국일빌딩 5F</li>
            <li>사업자번호 : 211-81-12345 | 통신판매업 : 2023-서울종로-1234호</li>
            <li>정보보호책임자 : 홍길동</li>
            <li>영업문의 : 02-123-5678</li>
            <li>팩스번호 : 02-550-1234</li>
          </ul>
        </li>
      </ol>
    </div>
   </footer>
</body>
</html>