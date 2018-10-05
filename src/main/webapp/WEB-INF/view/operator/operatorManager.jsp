<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>操作员列表---中国移动计费系统</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${ctx }/resources/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="${ctx }/resources/css/public.css" media="all" />
</head>
<body class="childrenBody">
	<blockquote class="layui-elem-quote quoteBox">
		<form class="layui-form">
			<div class="layui-form-item">
				<div class="layui-inline">
						<label class="layui-form-label">操作员姓名</label>
						<div class="layui-input-inline">
							<input type="text" name="operatorName" id="operatorName" autocomplete="off" class="layui-input " />
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">操作员编号</label>
						<div class="layui-input-inline">
							<input type="text" name="operatorId" id="operatorId" autocomplete="off" class="layui-input " />
						</div>
					</div>
			</div>
			<div class="layui-form-item" align="center">
			<a class="layui-btn search_btn" data-type="reload">搜索</a>
			<a class="layui-btn search_btn layui-btn layui-btn-warm" data-type="reload">重置</a>
			</div>
		</form>
	</blockquote>
	<script type="text/html"  id="operatorToolBar">
	<a class="layui-btn layui-btn-xs layui-btn layui-btn-normal" lay-event="add">添加</a>
	</script>
	<table id="operatorList" lay-filter="operatorList"></table>
	<!--操作-->
	<script type="text/html" id="operatorListBar">
		<a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
	</script>
<script type="text/javascript" src="${ctx }/resources/layui/layui.js"></script>
<script type="text/javascript" src="${ctx }/resources/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
var tableIns;
function reloadTable() {
	tableIns.reload({
	 page: {
         curr: 1 //重新从第 1 页开始
     },
     where: {
    	 operatorName: $("#operatorName").val(),//搜索的关键字
    	 operatorId: $("#operatorId").val(),
     }
	})
}
layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //操作员列表
   tableIns = table.render({
        elem: '#operatorList',
        url : '${ctx }/operator/queryAllOperator.action',
        cellMinWidth : 95,
        page : true,
        toolbar: '#operatorToolBar',
        defaultToolbar: ['filter', 'exports'],
        height : "full-125",
        limit : 10,
        limits : [10,15,20,25],
        id : "operatorListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'operatorId', title: '操作员编号', width:120, align:"center"},
            {field: 'operatorName', title: '操作员名称', align:"center"},
            {field: 'isAdmin ', title: '是否可用', align:'center', templet:function(d){
                return d.isAdmin=="Y"?"管理员":"操作员";
            }},
            {title: '操作', width:150, templet:'#operatorListBar',fixed:"right",align:"center"}
        ]]
    });
   //监听头工具栏事件
   table.on('toolbar(operatorList)', function(obj){
     var checkStatus = table.checkStatus(obj.config.id)
     ,data = checkStatus.data; //获取选中的数据
     switch(obj.event){
     case 'add':
     	addOperator();
     break;
     };
   });
   //添加操作员
   function addOperator(){
       var index = layui.layer.open({
           title : "添加操作员",
           //area设置弹出层大小
           area:["800px","600px"],
           type : 2,
           content : "${ctx}/operator/toAddOperator.action",
           success : function(layero, index){
               var body = layui.layer.getChildFrame('body', index);
               
               setTimeout(function(){
                   layui.layer.tips('点击此处返回操作员列表', '.layui-layer-setwin .layui-layer-close', {
                       tips: 3
                   });
               },500)
           }
       })
      // layui.layer.full(index);//最大化窗口
       //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
       $(window).on("resize",function(){
           layui.layer.full(index);
       })
   }
   //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
   $(".search_btn").on("click",function(){
   	reloadTable();
   });
   //修改操作员
   function updateOperator(id){
       var index = layui.layer.open({
           title : "修改操作员",
           //area设置弹出层大小
           area:["800px","600px"],
           type : 2,
           content : "${ctx}/operator/toUpdateOperator.action?id="+id,
           success : function(layero, index){
               var body = layui.layer.getChildFrame('body', index);
               setTimeout(function(){
                   layui.layer.tips('点击此处返回操作员列表', '.layui-layer-setwin .layui-layer-close', {
                       tips: 3
                   });
               },500)
           }
       })
      // layui.layer.full(index);//最大化窗口
       //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
       $(window).on("resize",function(){
           layui.layer.full(index);
       })
   }
   //列表操作
   table.on('tool(operatorList)', function(obj){
       var layEvent = obj.event,
           data = obj.data;
       if(layEvent === 'edit'){ //修改
       	updateOperator(data.id);
       }else if(layEvent === 'del'){ //删除
           layer.confirm('确定删除'+data.operatorname+'人员？',{icon:3, title:'提示信息'},function(index){
                $.post("${ctx}/operator/deleteOperator.action",{
                    id : data.id  //将需要删除的operatorId作为参数传入
                },function(data){
               	 layer.msg(data.msg);
                   tableIns.reload();
                   layer.close(index);
                })
           });
       } else if(layEvent === 'look'){ //预览
       }
   });
})
</script>
</body>
</html>