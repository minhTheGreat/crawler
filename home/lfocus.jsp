<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
String lfocus =(String) session.getAttribute("lfocus");
if(lfocus!=null){
  out.print(lfocus);
}
%>






