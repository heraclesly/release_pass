<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>无标题文档</title>

<script type="text/javascript" src="${home}/assets/js/jquery.js"></script>

<script language="javascript">
	$(function(){
    $('.error').css({'position':'absolute','left':($(window).width()-490)/2});
	$(window).resize(function(){  
    $('.error').css({'position':'absolute','left':($(window).width()-490)/2});
    })  
});  
</script> 


</head>


<body style="background:#edf6fa;">

	
    
    <div class="error">
    
    <h2>非常遗憾，您访问的页面不存在！</h2>
    <p>看到这个提示，就自认倒霉吧!</p>
   
    
    </div>


</body>

<style type="text/css">

    .error{background:url(${home}/assets/img/404.png) no-repeat; width:490px; margin-top:75px;padding-top:65px;}
    .error h2{font-size:22px; padding-left:154px;}
    .error p{padding-left:154px; line-height:35px;color:#717678;}

</style>
</html>
