<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
String lView2 =(String) session.getAttribute("lView2");
if(lView2!=null){
  out.print(lView2);
}
%>
