<!-- 사용자가 Email 인증 버튼을 눌렀을 때 처리해주는 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<%@ page import="util.SHA256"%>
<%@ page import="java.io.PrintWriter"%>


<%
	request.setCharacterEncoding("UTF-8");
	UserDAO userDAO = new UserDAO();
	String code =  "";
	if(request.getParameter("code") !=  ""){
		code = request.getParameter("code");
	}
	
	String userID =  "";
	
	if(session.getAttribute("userID") !=  ""){
		userID = (String) session.getAttribute("userID");
	}
	if(userID ==  ""){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인 해주세요');");
		script.println("location.href = 'userLogin.jsp'");
		script.println("</script>");
		script.close();
		return;
	}
	
	// hash 처리한 결과를 비교해 결과 값 반환
	String userEmail = userDAO.getUserEmail(userID);
	boolean isRight = (SHA256.getSHA256(userEmail).equals(code)) ? true : false;
	if(isRight == true){
		userDAO.setUserEmailChecked(userID);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('인증에 성공했습니다.');");
		script.println("location.href = 'index.jsp'");
		script.println("</script>");
		script.close();
		return;
	}else{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('잘못된 이메일 주소입니다.');");
		script.println("location.href = 'index.jsp'");
		script.println("</script>");
		script.close();
	}

%>