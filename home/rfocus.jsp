<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!-- <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="content_middle_rightbar">
          <div class="single_category wow fadeInDown">
            <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a href="#" class="title_text">Giải trí</a> </h2>
            <ul class="catg1_nav">
              <li>
                <div class="catgimg_container"> <a href="pages/single.html" class="catg1_img"><img alt="" src="images/sui-he-14.jpg"></a></div>
                <h3 class="post_titile"><a href="pages/single.html">Hà Tuệ - nàng thơ phương Đông của show nội y Victoria’s Secret</a></h3>
              </li>
              <li>
                <div class="catgimg_container"> <a href="pages/single.html" class="catg1_img"><img alt="" src="images/phung-ngoc-huy.jpg"></a></div>
                <h3 class="post_titile"><a href="pages/single.html">Bạn trai cũ hát quyên góp giúp Mai Phương trị ung thư</a></h3>
              </li>
            </ul>
          </div>
        </div>
      </div>
-->
<%
String rfocus =(String) session.getAttribute("rfocus");
if(rfocus!=null){
  out.print(rfocus);
}
%>

