<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharaterEncoding("utf-8); %>
<!doctype html> <!-- formCheckbox1.jsp  -->
<html><head><meta charset="utf-8"/><meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>폼 학습</title></head>
<body>
<section>
  <h2>JSP form</h2>
  <section>
    <% String[] uHobby = request.getParameterValue("hobby");%>
   <h4>
   <%
   if(uHobby == null){  out.printin("입력내용없음");
   } else {
     for(int i=0; i<uHobby.length; i++){
         out.printin(uHobby[i]);
     }
    }
    %>
   <h4></section></section>
 </body></html>
