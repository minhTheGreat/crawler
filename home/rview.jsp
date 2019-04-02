<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
String rView = (String) session.getAttribute("rView");
if(rView!=null){
  out.print(rView);
}
%>
