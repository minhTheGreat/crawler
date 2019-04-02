<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>VietNamNEWS</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/favorite-icon.png">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Nunito&amp;subset=vietnamese" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<link rel="stylesheet" type="text/css" href="assets/css/custom.css">
<!--[if lt IE 9]>
<script src="assets/js/html5shiv.min.js"></script>
<script src="assets/js/respond.min.js"></script>
<![endif]-->
</head>
<body>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<a class="scrollToTop" href="#"><span></span></a>
<div class="container">
  <header id="header">
    <div class="row">
      <div class="col-lg-12 col-md-12">
        <div class="header_top">
          <div class="header_top_left">
            <ul class="top_nav">
              <li><a href="index.html">Trang chủ</a></li>
              <li><a href="pages/page.html">Giới thiệu</a></li>
              <li><a href="pages/contact.html">Liên hệ</a></li>
              <li><a href="#" data-toggle="modal" data-target="#modalSignIn">Đăng nhập</a></li>
              <li><a href="#" data-toggle="modal" data-target="#modalSignUp">Đăng ký</a></li>
              <!-- <li><a href="index.html"><img src="images/favorite-icon.png"></a></li> -->
            </ul>
          </div>
          <div class="header_top_right">
            <form action="#" class="search_form">
              <input type="text" placeholder="Tìm kiếm">
              <input type="submit" value="">
            </form>
          </div>
        </div>
        <div class="header_bottom">
          <div class="header_bottom_left">
            <a class="logo" href="index.html">Việt Nam <strong>NEWS</strong> <span>Nắm bắt thời cuộc</span></a>
          </div>
        </div>
      </div>
    </div>
  </header>
  <div id="navarea">
    <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav custom_nav">
            <li class=""><a href="index.html">Trang chủ</a></li>
            <li class=""><a href="pages/archive-main.html">Thời sự</a></li>
            <li class=""><a href="pages/archive-main.html">Thể thao</a></li>
            <li class=""><a href="pages/archive-main.html">Kinh tế</a></li>
            <li class=""><a href="pages/archive-main.html">Giải trí</a></li>
            <li class=""><a href="pages/archive-main.html">Sức khoẻ</a></li>
            <li class=""><a href="pages/archive-main.html">Pháp luật</a></li>
            <li class=""><a href="pages/archive-main.html">Giáo dục</a></li>
            <li class=""><a href="pages/archive-main.html">Khoa học</a></li>
            <li class=""><a href="pages/archive-main.html">Du lịch</a></li>
            <li class=""><a href="pages/archive-main.html">Thế giới</a></li>
            <!-- <li class="dropdown"> <a href="#" class="" data-toggle="dropdown" role="button" aria-expanded="false">Archives</a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="pages/archive-main.html">Thể thao</a></li>
                <li><a href="pages/archive1.html">Bóng đá</a></li>
                <li><a href="pages/archive2.html">Bóng bàn</a></li>
                <li><a href="pages/archive3.html">Thể thao điện tử 3</a></li>
              </ul>
            </li> -->
            <!-- <li><a href="pages/single.html">Single page</a></li>
            <li><a href="pages/contact.html">Contact</a></li>
            <li><a href="pages/404.html">404 page</a></li> -->
          </ul>
        </div>
      </div>
    </nav>
  </div>
  <section id="mainContent">
    <!-- <div class="content_top">
      <div class="row">
        <div class="col-lg-6 col-md-6 col-sm6">
          <div class="latest_slider">
            <div class="slick_slider">
              <div class="single_iteam"><img src="images/xalattop.jpg" alt="">
                <h2><a class="slider_tittle" href="pages/single.html">Đường 5.000 tỷ nối bốn quận, huyện Hà Nội sắp khánh thành</a></h2>
              </div>
              <div class="single_iteam"><img src="images/550x330x2.jpg" alt="">
                <h2><a class="slider_tittle" href="pages/single.html">Fusce eu nulla semper porttitor felis sit amet</a></h2>
              </div>
              <div class="single_iteam"><img src="images/550x330x3.jpg" alt="">
                <h2><a class="slider_tittle" href="pages/single.html">Fusce eu nulla semper porttitor felis sit amet</a></h2>
              </div>
              <div class="single_iteam"><img src="images/550x330x4.jpg" alt="">
                <h2><a class="slider_tittle" href="pages/single.html">Fusce eu nulla semper porttitor felis sit amet</a></h2>
              </div>
            </div>
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm6">
          <div class="content_top_right">
            <ul class="featured_nav wow fadeInDown">
              <li><img src="images/300x215x1.jpg" alt="">
                <div class="title_caption"><a href="pages/single.html">Sed luctus semper odio aliquam rhoncus</a></div>
              </li>
              <li><img src="images/300x215x2.jpg" alt="">
                <div class="title_caption"><a href="pages/single.html">Sed luctus semper odio aliquam rhoncus</a></div>
              </li>
              <li><img src="images/300x215x3.jpg" alt="">
                <div class="title_caption"><a href="pages/single.html">Sed luctus semper odio aliquam rhoncus</a></div>
              </li>
              <li><img src="images/300x215x4.jpg" alt="">
                <div class="title_caption"><a href="pages/single.html">Sed luctus semper odio aliquam rhoncus</a></div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div> -->
    <div class="content_middle">
      <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="content_middle_leftbar">
          <div class="single_category wow fadeInDown">
            <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a href="#" class="title_text">Sức khoẻ</a> </h2>
            <ul class="catg1_nav">
              <li>
                <div class="catgimg_container"> <a href="pages/single.html" class="catg1_img"><img alt="" src="images/Mai-Phuong-xuat-vien.jpg"></a></div>
                <h3 class="post_titile"><a href="pages/single.html">Diễn viên Mai Phương khập khiễng xuất viện</a></h3>
              </li>
              <li>
                <div class="catgimg_container"> <a href="pages/single.html" class="catg1_img"><img alt="" src="images/BENH-VIEN-VL-2018.jpg"></a></div>
                <h3 class="post_titile"><a href="pages/single.html">Bác sĩ sai sót trong vụ thiếu úy cảnh sát tử vong do uống nhầm ma túy</a></h3>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-lg-6 col-md-6 col-sm-6">
        <div class="content_middle_middle">
          <div class="slick_slider2">
            <div class="single_featured_slide">
              <a href="pages/single.html"><img src="images/xalattop.jpg" alt=""></a>
              <h2><a href="pages/single.html">Đường 5.000 tỷ nối bốn quận, huyện Hà Nội sắp khánh thành</a></h2>
              <p>Hơn 20 km đường trục Nam Hà Nội với tổng mức đầu tư 5.000 tỷ đồng đã được thảm nhựa, trồng cây xanh để khánh thành dịp 10/10.</p>
            </div>
            <div class="single_featured_slide"> <a href="pages/single.html"><img src="images/rung-thong.jpg" alt=""></a>
              <h2><a href="#">Khu rừng thông ba lá ở Lâm Đồng bị đầu độc</a></h2>
              <p>Đám rừng thông ba lá ở huyện Bảo Lâm đang héo lá, chết dần khi bị đầu độc bằng thuốc diệt cỏ.</p>
            </div>
            <div class="single_featured_slide"> <a href="pages/single.html"><img src="images/x-trail-14.jpg" alt=""></a>
              <h2><a href="#">Nissan X-Trail mới giá từ 991 triệu tại Việt Nam</a></h2>
              <p>Crossover 5+2 nâng cấp một số tính năng, thay đổi nhẹ ở ngoại thất trên phiên bản V-series, dành riêng cho thị trường Việt Nam.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
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
    </div>
    <div class="content_bottom">
      <div class="col-lg-8 col-md-8">
        <div class="content_bottom_left">
          <div class="single_category wow fadeInDown">
            <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a class="title_text" href="#">Kinh tế</a> </h2>
            <div class="business_category_left wow fadeInDown">
              <ul class="fashion_catgnav">
                <li>
                  <div class="catgimg2_container"> <a href="pages/single.html"><img alt="" src="images/saigon-tower-1-8289-1536576583.jpg"></a> </div>
                  <h2 class="catg_titile"><a href="pages/single.html">Ngân hàng ồ ạt rao bán tài sản nghìn tỷ thu hồi nợ</a></h2>
                  <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                  <p>Có ngân hàng chỉ trong thời gian ngắn rao bán tài sản có giá trị lên đến hàng chục nghìn tỷ đồng.</p>
                </li>
              </ul>
            </div>
            <div class="business_category_right wow fadeInDown">
              <ul class="small_catg">
                <li>
                  <div class="media wow fadeInDown"> <a class="media-left" href="pages/single.html"><img src="images/jack-ma-daniel-zhang-5686-1536548678.jpg" alt=""></a>
                    <div class="media-body">
                      <h4 class="media-heading"><a href="pages/single.html">Tâm thư ấn định ngày nghỉ hưu của Jack Ma</a></h4>
                      <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="media wow fadeInDown"> <a class="media-left" href="pages/single.html"><img src="images/jack-ma-daniel-zhang-5686-1536548678.jpg" alt=""></a>
                    <div class="media-body">
                      <h4 class="media-heading"><a href="pages/single.html">Tâm thư ấn định ngày nghỉ hưu của Jack Ma</a></h4>
                      <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/toan-canh-dien-dan-kinh-te-the-gioi-ve-asean-sap-dien-ra-o-ha-noi-1536549560_180x108.jpg" alt=""></a>
                    <div class="media-body">
                      <h4 class="media-heading"><a href="#">Toàn cảnh Diễn đàn Kinh tế thế giới về ASEAN sắp diễn ra ở Hà Nội</a></h4>
                      <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/hm1-5523-1536315033.jpg" alt=""></a>
                    <div class="media-body">
                      <h4 class="media-heading"><a href="#">'Cá mập' thời trang thế giới đổ về Việt Nam</a></h4>
                      <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          <div class="games_fashion_area">
            <div class="games_category">
              <div class="single_category">
                <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a class="title_text" href="#">Du lịch</a> </h2>
                <ul class="fashion_catgnav wow fadeInDown">
                  <li>
                    <div class="catgimg2_container"> <a href="pages/single.html"><img alt="" src="images/1-1536309215_680x0.jpg"></a> </div>
                    <h2 class="catg_titile"><a href="#">10 thành phố có mùa thu đẹp ở châu Âu</a></h2>
                    <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    <p>Những ngày tháng 9-10 là dịp lý tưởng để tận hưởng khí trời mát mẻ, khung cảnh rực rỡ sắc lá vàng ở Anh, Italy...</p>
                  </li>
                </ul>
                <ul class="small_catg wow fadeInDown">
                  <li>
                    <div class="media"> <a class="media-left" href="#"><img src="images/binhgom-14_180x108.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Ngôi chùa ở Sài Gòn có nhiều bình gốm nhất Việt Nam</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/dulich149552332892871495523728-8608-5967-1536491676_180x108.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Vì sao ngày càng có nhiều người bỏ việc đi du lịch?</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
            <div class="fashion_category">
              <div class="single_category">
                <div class="single_category wow fadeInDown">
                  <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a class="title_text" href="#">Thể thao</a> </h2>
                  <ul class="fashion_catgnav wow fadeInDown">
                    <li>
                      <div class="catgimg2_container"> <a href="#"><img alt="" src="images/mo2-2406-1536586916.jpg"></a> </div>
                      <h2 class="catg_titile"><a href="#">Tin Thể thao tối 10/9: Ramos ca ngợi Modric, 'đá xoáy' Ronaldo</a></h2>
                      <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      <p>Ramos khen Modric xứng đáng thắng giải Cầu thủ hay nhất UEFA, danh hiệu mà Cristiano Ronaldo chỉ về thứ hai.</p>
                    </li>
                  </ul>
                  <ul class="small_catg wow fadeInDown">
                    <li>
                      <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/zinedinezidane-cropped-hca02r3-9291-6203-1536554003.jpg" alt=""></a>
                        <div class="media-body">
                          <h4 class="media-heading"><a href="#">Zidane: 'Tôi sẽ sớm trở lại bóng đá'</a></h4>
                          <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/Nole-3417-1536567122.jpg" alt=""></a>
                        <div class="media-body">
                          <h4 class="media-heading"><a href="#">Djokovic: 'Federer và Nadal đã thúc đẩy tôi'</a></h4>
                          <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                        </div>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
          <div class="technology_catrarea">
            <div class="single_category">
              <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <a class="title_text" href="#">Khoa học</a> </h2>
              <div class="business_category_left">
                <ul class="fashion_catgnav wow fadeInDown">
                  <li>
                    <div class="catgimg2_container"> <a href="#"><img alt="" src="images/VNEAITop-1536557196-5742-1536557443_180x108.jpg"></a> </div>
                    <h2 class="catg_titile"><a href="#">Trí tuệ nhân tạo làm thay đổi mọi mặt đời sống con người</a></h2>
                    <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                    <p>Trí tuệ nhân tạo đang hiện hữu trong mọi lĩnh vực đời sống, giúp con người tiết kiệm sức lao động đồng thời nâng cao hiệu quả công việc. </p>
                  </li>
                </ul>
              </div>
              <div class="business_category_right">
                <ul class="small_catg wow fadeInDown">
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/cong-nghe-tren-xe-tu-lai-phuong-tien-tuong-lai-cua-con-nguoi-1536547432_180x108.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Công nghệ trên xe tự lái - phương tiện di chuyển của tương lai</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/cong-nghe-tren-xe-tu-lai-phuong-tien-tuong-lai-cua-con-nguoi-1536547432_180x108.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Công nghệ trên xe tự lái - phương tiện di chuyển của tương lai</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/sieu-vat-lieu-4963-1536510002.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Người Việt sáng chế siêu vật liệu hấp thụ sóng điện từ</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/HoanangluongMTset-1536381504-9774-1536381579_180x108.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Thiết bị năng lượng hình hoa tự động quay theo mặt trời</a></h4>
                        <div class="comments_box"> <span class="meta_date">10/09/2018</span> <span class="meta_comment"><a href="#">Nguồn: vnexpress</a></span> <span class="meta_more"><a  href="#">Chi tiết...</a></span> </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4">
        <div class="content_bottom_right">
          <div class="single_bottom_rightbar">
            <h2>Start up</h2>
            <ul class="small_catg popular_catg wow fadeInDown">
              <li>
                <div class="media wow fadeInDown"> <a href="#" class="media-left"><img alt="" src="images/PR-898x505-8224-1536118087.jpg"> </a>
                  <div class="media-body">
                    <h4 class="media-heading"><a href="#">Bốn bước quan hệ công chúng giúp startup thu hút đầu tư</a></h4>
                    <p>Chuyên gia cho biết một quy trình quan hệ công chúng (PR) 4 bước gồm "Xác định- Truyền thông- Khẳng định- Thu hút" sẽ giúp doanh nghiệp thu hút vốn.</p>
                  </div>
                </div>
              </li>
              <li>
                <div class="media wow fadeInDown"> <a href="#" class="media-left"><img alt="" src="images/anh1-jpeg-7118-1536141729-5632-1536197161.jpg"> </a>
                  <div class="media-body">
                    <h4 class="media-heading"><a href="#">CEO 16 tuổi làm giàu từ thương mại điện tử</a></h4>
                    <p>Sở hữu năm website bán hàng trực tuyến, Giám đốc điều hành 16 tuổi cho biết công thức thành công là đam mê và kỹ năng quản lý thời gian.</p>
                  </div>
                </div>
              </li>
              <li>
                <div class="media wow fadeInDown"> <a href="#" class="media-left"><img alt="" src="images/meetup-2904-1536142216.jpg"> </a>
                  <div class="media-body">
                    <h4 class="media-heading"><a href="#">Startup Việt 2018 mở đăng ký cho cộng đồng khởi nghiệp</a></h4>
                    <p>Từ ngày 5/9, các startup trong nước có thể nộp hồ sơ trực tuyến, tham gia sự kiện khởi nghiệp Startup Việt 2018 trên website chính thức của chương trình. </p>
                  </div>
                </div>
              </li>
            </ul>
          </div>
          <div class="single_bottom_rightbar">
            <ul role="tablist" class="nav nav-tabs custom-tabs">
              <li class="active" role="presentation"><a data-toggle="tab" role="tab" aria-controls="home" href="#mostPopular">Bài báo hot nhất</a></li>
              <li role="presentation"><a data-toggle="tab" role="tab" aria-controls="messages" href="#recentComent">Bài viết vừa đọc</a></li>
            </ul>
            <div class="tab-content">
              <div id="mostPopular" class="tab-pane fade in active" role="tabpanel">
                <ul class="small_catg popular_catg wow fadeInDown">
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/rick-kid.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Người giàu Việt ngày càng nhiều, chi tiêu càng cao</a></h4>
                        <p>Những món hàng giá "đắt vô lý" với không ít người, dần được đón nhận nhiều hơn ở Việt Nam nhờ giới nhà giàu và siêu giàu.</p>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/hdba-3799-1524283352-8325-1536585488.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Ngân hàng Nhà nước chấp thuận sáp nhập PGBank vào HDBank</a></h4>
                        <p>Dự kiến cuối năm nay thương vụ sáp nhập PGBank và HDBank sẽ hoàn tất và ngân hàng sau sáp nhập có quy mô vốn điều lệ 15.345 tỷ đồng.</p>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/cacbicao-9214-1536578814.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Cựu cán bộ Công an TP HCM lĩnh 14 năm tù vì buôn lậu 54 ôtô sang</a></h4>
                        <p>Lam và đồng phạm thuê Việt kiều mang xe Rolls Royce, Bentley, Lexus, Porsche... về Sài Gòn bán cho chủ salon ôtô thu lợi hàng chục tỷ.</p>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
              <div id="recentComent" class="tab-pane fade" role="tabpanel">
                <ul class="small_catg popular_catg">
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/112x112.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Duis condimentum nunc pretium lobortis </a></h4>
                        <p>Nunc tincidunt, elit non cursus euismod, lacus augue ornare metus, egestas imperdiet nulla nisl quis mauris. Suspendisse a pharetra </p>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/112x112.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Duis condimentum nunc pretium lobortis </a></h4>
                        <p>Nunc tincidunt, elit non cursus euismod, lacus augue ornare metus, egestas imperdiet nulla nisl quis mauris. Suspendisse a pharetra </p>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media wow fadeInDown"> <a class="media-left" href="#"><img src="images/112x112.jpg" alt=""></a>
                      <div class="media-body">
                        <h4 class="media-heading"><a href="#">Duis condimentum nunc pretium lobortis </a></h4>
                        <p>Nunc tincidunt, elit non cursus euismod, lacus augue ornare metus, egestas imperdiet nulla nisl quis mauris. Suspendisse a pharetra </p>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div class="single_bottom_rightbar wow fadeInDown">
              <h2>Thẻ gán</h2>
              <ul class="labels_nav">
                <li><a href="#">Giải trí</a></li>
                <li><a href="#">Sức khoẻ</a></li>
                <li><a href="#">Thời sự</a></li>
                <li><a href="#">Thời trang</a></li>
                <li><a href="#">Thể thao</a></li>
                <li><a href="#">Công nghệ số</a></li>
                <li><a href="#">Kinh tế</a></li>
                <li><a href="#">Start up</a></li>
              </ul>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>
<footer id="footer">
  <div class="footer_top">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-4">
          <div class="single_footer_top wow fadeInRight">
            <h2>Giới thiệu</h2>
            <p><strong>Thành lập ngày 10/09/2018.</strong><br>
            <strong>Nhóm sinh viên trường đại học Công nghiệp Hà Nội</strong>.<br>
            <!-- <strong>Giấy phép:</strong> XXX.<br> -->
            <strong>Điện thoại:</strong> 033-4492-484<br>
            <strong>Người thực hiện:</strong><br>
            <span style="margin-left: 20px;">- Nguyễn Như Thuỳ</span><br>
            <span style="margin-left: 20px;">- Nguyễn Trung Hiếu</span><br>
            <span style="margin-left: 20px;">- Trần Quang Minh</span><br>
            </p>
            <p>
            <!-- <strong>Tòa soạn:</strong> XXX. -->
            <!-- <strong>Đường dây nóng:</strong> 0123 123 0123<br> -->
            <!-- <strong>Fax:</strong> 024 3795 XXXX -->
            </p>
          </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-4">
            <div class="single_footer_top wow fadeInRight">
              <a href="index.html"><img src="images/favorite-icon.png" height="150px"></a>
            </div>
          </div>
      </div>
    </div>
  </div>
  <div class="footer_bottom">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
          <div class="footer_bottom_left">
            <p>Copyright &copy; 2018 <a href="index.html">magExpress</a></p>
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
          <div class="footer_bottom_right">
            <p>Developed BY Wpfreeware</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</footer>

<!-- Modal Sign in-->
<div class="modal fade" id="modalSignIn" role="dialog">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <form action="#" class="search_form">
        <div class="modal-body">
          <div class="form-group">
            <label for="usr">Tên đăng nhập:</label>
            <input type="email" class="form-control" id="usr" placeholder="Email">
          </div>
          <div class="form-group">
            <label for="pwd">Mật khẩu:</label>
            <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu">
          </div>
        </div>
        <div class="modal-footer">
          <a href="#">Quên mật khẩu?</a>
          <button type="submit" class="btn btn-default modal-submit" data-dismiss="modal">Đăng nhập</button>
          <br>
          <div class="share_post">
            <a class="facebook" href="#"><i class="fa fa-facebook"></i>Facebook</a>
            <a class="twitter" href="#"><i class="fa fa-twitter"></i>Twitter</a>
            <a class="googleplus" href="#"><i class="fa fa-google-plus"></i>Google+</a>
            <a class="linkedin" href="#"><i class="fa fa-linkedin"></i>LinkedIn</a>
            <a class="pinterest" href="#"><i class="fa fa-pinterest"></i>Pinterest</a>
            <a class="stumbleupon" href="#"><i class="fa fa-stumbleupon"></i>StumbleUpon</a>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

<!-- Modal Sign up-->
<div class="modal fade" id="modalSignUp" role="dialog">
    <div class="modal-dialog modal-md">
      <div class="modal-content">
        <form action="#" class="search_form">
          <div class="modal-body">
            <div class="form-group">
              <label for="usr">Tên đăng nhập:</label>
              <input type="email" class="form-control" id="usr" placeholder="Email">
            </div>
            <div class="form-group">
              <label for="pwd">Mật khẩu:</label>
              <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu">
            </div>
          </div>
          <div class="modal-footer">
            <button type="submit" class="btn btn-default modal-submit" data-dismiss="modal">Đăng ký</button>
            <br>
            <div class="share_post">
              <a class="facebook" href="#"><i class="fa fa-facebook"></i>Facebook</a>
              <a class="twitter" href="#"><i class="fa fa-twitter"></i>Twitter</a>
              <a class="googleplus" href="#"><i class="fa fa-google-plus"></i>Google+</a>
              <a class="linkedin" href="#"><i class="fa fa-linkedin"></i>LinkedIn</a>
              <a class="pinterest" href="#"><i class="fa fa-pinterest"></i>Pinterest</a>
              <a class="stumbleupon" href="#"><i class="fa fa-stumbleupon"></i>StumbleUpon</a>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/wow.min.js"></script>
<script src="assets/js/slick.min.js"></script>
<script src="assets/js/custom.js"></script>
</body>
</html>
