<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--
Template Name: PhotoFolio
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>PhotoFolio</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
<script type="text/javascript" src="layout/scripts/jquery.min.js"></script>
<!-- tabs -->
<script type="text/javascript" src="layout/scripts/jquery.ui.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $("#tabcontainer").tabs({
        event: "click"
    });
});
</script>
<script type="text/javascript" src="layout/scripts/jquery-photostack.js"></script>
<script type="text/javascript" src="layout/scripts/jquery-coin-slider.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#portfolioslider').coinslider({
        width: 480,
        height: 280,
        navigation: false,
        links: false,
        hoverPause: true
    });
});
</script>
<!-- / coinslider -->
</head>

<body id="top">
<div class="wrapper col1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="index.html">PhotoFolio</a></h1>
      <p>Free Website Template</p>
    </div>
    <div class="fl_right"><a href="<%=request.getContextPath()%>/logout" class="button">LOGOUT</a></div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col1">
  <div id="topbar" class="clear">
    <ul id="topnav">
      <li class="active"><a href="index.html">Home</a></li>
      <li><a href="#">Member Management</a>
      <ul>
          <li><a href="<%=request.getContextPath()%>/createMemberAction">Member Creation</a></li>
          <li><a href="<%=request.getContextPath()%>/viewMemberAction">View Members</a></li>
          <li><a href="#">Link 3</a></li>
        </ul>
      </li>
      <li><a href="pages/full-width.html">Notice Management</a>
      <ul>
          <li><a href="<%=request.getContextPath()%>/createNoticeAction">Notice Creation</a></li>
          <li><a href="<%=request.getContextPath()%>/viewMemberAction">View Members</a></li>
          <li><a href="#">Link 3</a></li>
        </ul>
      </li>
      
      <li><a href="#">User Management</a>
        <ul>
          <li><a href="<%=request.getContextPath()%>/createUserAction">User Creation</a></li>
          <li><a href="<%=request.getContextPath()%>/viewUserAction">View Users</a></li>
          <li><a href="#">Link 3</a></li>
        </ul>
      </li>
      <li><a href="pages/portfolio.html">Portfolio</a></li>
      <li class="last"><a href="pages/gallery.html">Gallery</a></li>
    </ul>
    <form action="#" method="post" id="search">
      <fieldset>
        <legend>Site Search</legend>
        <input type="text" value="Search Our Website&hellip;" onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />
        <input type="image" id="go" src="layout/images/search.gif" alt="Search" />
      </fieldset>
    </form>
  </div>
</div>
<style type="text/css">
.button {
   border-top: 1px solid #3c515e;
   background: #546066;
   background: -webkit-gradient(linear, left top, left bottom, from(#000000), to(#546066));
   background: -webkit-linear-gradient(top, #000000, #546066);
   background: -moz-linear-gradient(top, #000000, #546066);
   background: -ms-linear-gradient(top, #000000, #546066);
   background: -o-linear-gradient(top, #000000, #546066);
   padding: 5px 10px;
   -webkit-border-radius: 26px;
   -moz-border-radius: 26px;
   border-radius: 26px;
   -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;
   -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;
   box-shadow: rgba(0,0,0,1) 0 1px 0;
   text-shadow: rgba(0,0,0,.4) 0 1px 0;
   color: white;
   font-size: 12px;
   font-family: Georgia, serif;
   text-decoration: none;
   vertical-align: middle;
   }
.button:hover {
   border-top-color: #727678;
   background: #727678;
   color: #ccc;
   }
.button:active {
   border-top-color: #7c8387;
   background: #7c8387;
   }
</style>
</body>
</html>