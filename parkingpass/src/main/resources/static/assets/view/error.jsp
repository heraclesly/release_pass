<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.0/weui.min.css">
</head>
<body>
<div class="weui-msg">
    <div class="weui-msg__icon-area"><img  width="150px" src="${home}/assets/img/mood.png"></div>
    <div class="weui-msg__text-area">
        <p class="weui-msg__desc" style="color:red;">服务器开小差了,稍后再试吧~~~</p>
    </div>
    <div class="weui-msg__opr-area">
        <p class="weui-btn-area">
            <a href="javascript:back()" class="weui-btn weui-btn_default">返回</a>
        </p>
    </div>
    <div class="weui-msg__extra-area">
        <div class="weui-footer">
            <p class="weui-footer__links">
                <a href="javascript:void(0);" class="weui-footer__link"></a>
            </p>
            <p class="weui-footer__text"></p>
        </div>
    </div>

</div>
</body>

<script>
    function back() {

        if (history.length == 1) {
            WeixinJSBridge.call('closeWindow');
        } else {
            history.back();
        }


    }
</script>
</html>