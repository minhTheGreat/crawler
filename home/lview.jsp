<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
String lView =(String) session.getAttribute("lView");
if(lView!=null){
  out.print(lView);
}


%>
