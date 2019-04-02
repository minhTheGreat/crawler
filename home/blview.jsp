<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
String blView = (String) session.getAttribute("blView");
if(blView!=null){
  out.print(blView);
}
%>
