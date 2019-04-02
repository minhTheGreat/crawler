<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<jsp:include flush="true" page="data.jsp"></jsp:include>
<%@page import="jsoft.*, jsoft.objects.*"%>
<%@page import="jsoft.gui.article.category.* "%>
<%@page import="jsoft.gui.article.* "%>
<%@page import="jsoft.ads.user_log.* "%>
<%@page import="jsoft.library.Utilities.* "%>
<%@page import="java.util.* "%>
<!DOCTYPE html>
<html>
  <head>
    <title>VietNamNEWS</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/home/images/favorite-icon.png">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Nunito&amp;subset=vietnamese" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/animate.css">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/slick.css">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/theme.css">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="/home/assets/css/custom.css">
    <!--
      [if lt IE 9]>
      <script src="assets/js/html5shiv.min.js"></script>
      <script src="assets/js/respond.min.js"></script>
      <![endif]
    -->
  </head>
  <body>
    <div id="preloader">
      <div id="status">&nbsp;</div>
    </div>
    <a class="scrollToTop" href="#">
      <span></span>
    </a>
    <div class="container">
      <header id="header">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="header_top">
              <div class="header_top_left">
                <ul class="top_nav">
                  <li><a href="#" data-toggle="modal" data-target="#modalSignIn">Đăng nhập</a></li>

                  <!-- <li><a href="index.html"><img src="images/favorite-icon.png"></a></li> -->
                </ul>
              </div>
            </div>
            <div class="header_bottom">
              <div class="header_bottom_left">
                <a class="logo" href="/home/">
                  <img src="/home/images/favorite-icon.png" style="margin:0px; height:125px;width:125px" />
                </a>
              </div>
            </div>
          </div>
        </div>
      </header>
      <div id="navarea">
        <nav class="navbar navbar-default" role="navigation">
          <div class="container-fluid">
            <div class="navbar-header">

            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav custom_nav">
                <li class=""><a href="/home/">Trang chủ</a></li>

                <li class=""><a href="/home/thoi-su">Thời sự</a></li>
                <li class=""><a href="/home/the-thao/">Thể thao</a></li>
                <li class=""><a href="/home/kinh-te/">Kinh tế</a></li>
                <li class=""><a href="/home/giai-tri/">Giải trí</a></li>
                <li class=""><a href="/home/suc-khoe/">Sức khoẻ</a></li>
                <li class=""><a href="/home/phap-luat/">Pháp luật</a></li>
                <li class=""><a href="/home/giao-duc/">Giáo dục</a></li>
                <li class=""><a href="/home/khoa-hoc/">Khoa học</a></li>
                <li class=""><a href="/home/du-lich/">Du lịch</a></li>
                <li class=""><a href="/home/the-gioi/">Thế giới</a></li>
                <!--
                  <li class="dropdown"> <a href="#" class="" data-toggle="dropdown" role="button" aria-expanded="false">Archives</a>
                  <ul class="dropdown-menu" role="menu">
                  <li><a href="pages/archive-main.html">Thể thao</a></li>
                  <li><a href="pages/archive1.html">Bóng đá</a></li>
                  <li><a href="pages/archive2.html">Bóng bàn</a></li>
                  <li><a href="pages/archive3.html">Thể thao điện tử 3</a></li>
                  </ul>
                  </li>
                -->
                <!--
                  <li><a href="pages/single.html">Single page</a></li>
                  <li><a href="pages/contact.html">Contact</a></li>
                  <li><a href="pages/404.html">404 page</a></li>
                -->
              </ul>
            </div>
          </div>
        </nav>
      </div>



