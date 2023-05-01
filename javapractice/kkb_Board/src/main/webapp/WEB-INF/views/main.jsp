<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome KKBMall</title>
<link rel="stylesheet" href="resources/css/main.css?after">
</head>
<body>

<div class="wrapper">
	<div class="wrap">
		<div class="top_gnb_area">
			<ul class="list">
				<c:if test = "${member == null}">	<!-- 로그인 x -->	
					<li >
						<a href="/member/login">로그인</a>
					</li>
					<li>
						<a href="/member/join">회원가입</a>
					</li>
				</c:if>
				<c:if test="${member != null }">	<!-- 로그인 o -->		
					<c:if test="${member.adminCk == 1 }">	<!-- 관리자 계정 -->
						<li><a href="/admin/main">관리자 페이지</a></li>
					</c:if>							
					<li>
						로그아웃
					</li>
					<li>
						마이페이지
					</li>
					<li>
						장바구니
					</li>
				</c:if>				
				<li>
					고객센터
				</li>			
			</ul>			
		</div>
		<div class="top_area">
			<div class="logo_area">
				<h1>logo area</h1>
				<a href="/main"><img src="resources/img/kkblogo.png"></a>
			</div>
			<div class="search_area">
				<h1>Search area</h1>
			</div>
			<div class="login_area">
				<!-- 로그인 하지 않은 상태 -->
                <c:if test = "${member == null }">
                    <div class="login_button"><a href="/member/login">로그인</a></div>
                    <span><a href="/member/join">회원가입</a></span>                
                </c:if>    
 				 <!-- 로그인한 상태 -->
                <c:if test="${ member != null }">
                    <div class="login_success_area">
                        <span>회원 : ${member.memberName}</span>
                        <span>충전금액 : <fmt:formatNumber value="${member.money }" pattern="\#,###.##"/></span>
                        <span>포인트 : <fmt:formatNumber value="${member.point }" pattern="#,###" /></span>
                        <a href="/member/logout.do">로그아웃</a>
                    </div>
                </c:if>
			</div>
			<div class="clearfix"></div>			
		</div>
		<div class="navi_bar_area">
			<h1>navi area</h1>
		</div>
		<div class="content_area">
			<h1>content area</h1>
		</div>
		<!-- Footer 영역 -->
        <div class="footer_nav">
            <div class="footer_nav_container">
                <ul>
                    <li>회사소개</li>
                    <span class="line">|</span>
                    <li>인재채용</li>
                    <span class="line">|</span>
                    <li>제휴정책</li>
                    <span class="line">|</span>
                    <li>개인정보처리방침</li>
                    <span class="line">|</span>
                    <li>고객센터</li>
                    <span class="line">|</span>
                </ul>
            </div>
        </div> <!-- class="footer_nav" -->
        
        <div class="footer">
            <div class="footer_container">
                
                <div class="footer_left">
                    <img src="resources/img/kkblogo.png">
                </div>
                <div class="footer_right">
                    (주) Bin's Company    대표이사 : 김경빈
                    <br>
                    빈스 컴퍼니 홈페이지는 꾸준히 업데이트 됩니당!!!
                    <br>
                    대표전화 : 010-6375-3431(발신자 부담전화)
                    <br>
                    <br>
                    COPYRIGHT(C) <strong>https://velog.io/@kkb3431</strong>    ALL RIGHTS RESERVED.
                </div>
                <div class="clearfix"></div>
            </div>
        </div> <!-- class="footer" -->    
	</div>
</div>

</body>
</html>>