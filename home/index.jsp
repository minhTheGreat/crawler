<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<jsp:include flush="true" page="header.jsp"></jsp:include>
  <section id="mainContent">
    <div class="content_middle">

      <jsp:include flush="true" page="lfocus.jsp"></jsp:include>

      <jsp:include flush="true" page="intros.jsp"></jsp:include>

      <jsp:include flush="true" page="rfocus.jsp"></jsp:include>
    </div>

    <div class="content_bottom">
      <div class="col-lg-8 col-md-8">
        <div class="content_bottom_left">
           <jsp:include flush="true" page="lview.jsp"></jsp:include>

          <div class="games_fashion_area">

             <jsp:include flush="true" page="blview.jsp"></jsp:include>
             <jsp:include flush="true" page="brview.jsp"></jsp:include>

          </div>
          <jsp:include flush="true" page="lview2.jsp"></jsp:include>
        </div>
      </div>

      <div class="col-lg-4 col-md-4">
        <div class="content_bottom_right">
          <jsp:include flush="true" page="rview.jsp"></jsp:include>
          <jsp:include flush="true" page="bbview.jsp"></jsp:include>


        </div>
      </div>
    </div>
  </section>
</div>
  <jsp:include flush="true" page="footer.jsp"></jsp:include>
</body>
</html>

