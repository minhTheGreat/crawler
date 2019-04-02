<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
String brView =(String) session.getAttribute("brView");
if(brView!=null){
  out.print(brView);
}
%>
