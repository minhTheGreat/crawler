<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="jsoft.library.*" %>
<%@page import="java.util.* "%>
<%@page import="jsoft.*, jsoft.objects.*"%>
<%@page import="jsoft.ads.category.* "%>
<%@page import="jsoft.gui.article.* "%>
<jsp:include flush="true" page="../header.jsp"></jsp:include>
  <section id="mainContent">
    <div class="content_middle">


    </div>
    <div class="clr"></div>
    <div class="content_bottom">
      <div class="col-lg-8 col-md-8">
        <div class="content_bottom_left">
      <%
      String archive_science = (String) session.getAttribute("archive_science");
  if (archive_science != null) {
    out.print(archive_science);
  }
      %>
        </div>


      <div class="col-lg-4 col-md-4">
        <div class="content_bottom_right">
          <jsp:include flush="true" page="../rview.jsp"></jsp:include>
          <jsp:include flush="true" page="../bbview.jsp"></jsp:include>


        </div>
      </div>

  </section>
</div>
  <jsp:include flush="true" page="../footer.jsp"></jsp:include>
</body>
</html>

