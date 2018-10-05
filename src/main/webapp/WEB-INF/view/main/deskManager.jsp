<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>首页---中国移动计费系统</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${ctx }/resources/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="${ctx }/resources/css/public.css" media="all" />
	<script type="text/javascript" src="${ctx }/resources/css/public.css"></script>
</head>
<body class="childrenBody">
	<blockquote class="layui-elem-quote layui-bg-green">
		<div id="nowTime"></div>
	</blockquote>
			<div align="center">
			<h2 >欢迎你<font style="color:green;" >${operator.operatorName }</font></h2>
			<br>
			<br>
			<br>
			<h2>你的权限是<font style="color:green;" >
			<c:choose>
			<c:when test="${operator.isAdmin eq  'Y' }">管理员</c:when>
			<c:otherwise>操作员</c:otherwise>
			</c:choose>
			</font></h2>
			</div>
			<div align="center"><h3 style="color: red;">${error }</h3></div>
	<script type="text/javascript" src="${ctx }/resources/layui/layui.js"></script>
	<script type="text/javascript">
	//获取系统时间
	var newDate = '';
	getLangDate();
	//值小于10时，在前面补0
	function dateFilter(date){
	    if(date < 10){return "0"+date;}
	    return date;
	}
	function getLangDate(){
	    var dateObj = new Date(); //表示当前系统时间的Date对象
	    var year = dateObj.getFullYear(); //当前系统时间的完整年份值
	    var month = dateObj.getMonth()+1; //当前系统时间的月份值
	    var date = dateObj.getDate(); //当前系统时间的月份中的日
	    var day = dateObj.getDay(); //当前系统时间中的星期值
	    var weeks = ["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
	    var week = weeks[day]; //根据星期值，从数组中获取对应的星期字符串
	    var hour = dateObj.getHours(); //当前系统时间的小时值
	    var minute = dateObj.getMinutes(); //当前系统时间的分钟值
	    var second = dateObj.getSeconds(); //当前系统时间的秒钟值
	    var timeValue = "" +((hour >= 12) ? (hour >= 18) ? "晚上" : "下午" : "上午" ); //当前时间属于上午、晚上还是下午
	    newDate = dateFilter(year)+"年"+dateFilter(month)+"月"+dateFilter(date)+"日 "+" "+dateFilter(hour)+":"+dateFilter(minute)+":"+dateFilter(second);
	    document.getElementById("nowTime").innerHTML = "亲爱的boss，"+timeValue+"好！ 欢迎使用仓库系统。当前时间为： "+newDate+"　"+week;
	    setTimeout("getLangDate()",1000);
	}

	layui.use(['form','element','layer','jquery'],function(){
	    var form = layui.form,
	        layer = parent.layer === undefined ? layui.layer : top.layer,
	        element = layui.element;
	        $ = layui.jquery;
	    //上次登录时间【此处应该从接口获取，实际使用中请自行更换】
	    $(".loginTime").html(newDate.split("日")[0]+"日</br>"+newDate.split("日")[1]);
	    //icon动画
	    $(".panel a").hover(function(){
	        $(this).find(".layui-anim").addClass("layui-anim-scaleSpring");
	    },function(){
	        $(this).find(".layui-anim").removeClass("layui-anim-scaleSpring");
	    })
	    $(".panel a").click(function(){
	        parent.addTab($(this));
	    })

	})

	</script>
</body>
</html>