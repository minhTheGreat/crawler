<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<div class="col-lg-6 col-md-6 col-sm-6">
        <div class="content_middle_middle">
        <%
          //Doc cau truc trong phien neu co
          String intros = (String)session.getAttribute("intros");
          if(intros!=null){
          out.print(intros);
          }
        %>
        </div>
</div>
