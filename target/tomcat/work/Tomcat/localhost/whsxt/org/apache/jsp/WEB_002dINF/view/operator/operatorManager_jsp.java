/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-03 07:17:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.operator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operatorManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>操作员列表---中国移动计费系统</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\t<blockquote class=\"layui-elem-quote quoteBox\">\r\n");
      out.write("\t\t<form class=\"layui-form\">\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">操作员姓名</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"operatorName\" id=\"operatorName\" autocomplete=\"off\" class=\"layui-input \" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">操作员编号</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"operatorId\" id=\"operatorId\" autocomplete=\"off\" class=\"layui-input \" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\" align=\"center\">\r\n");
      out.write("\t\t\t<a class=\"layui-btn search_btn\" data-type=\"reload\">搜索</a>\r\n");
      out.write("\t\t\t<a class=\"layui-btn search_btn layui-btn layui-btn-warm\" data-type=\"reload\">重置</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("\t<script type=\"text/html\"  id=\"operatorToolBar\">\r\n");
      out.write("\t<a class=\"layui-btn layui-btn-xs layui-btn layui-btn-normal\" lay-event=\"add\">添加</a>\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<table id=\"operatorList\" lay-filter=\"operatorList\"></table>\r\n");
      out.write("\t<!--操作-->\r\n");
      out.write("\t<script type=\"text/html\" id=\"operatorListBar\">\r\n");
      out.write("\t\t<a class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">修改</a>\r\n");
      out.write("\t\t<a class=\"layui-btn layui-btn-xs layui-btn-danger\" lay-event=\"del\">删除</a>\r\n");
      out.write("\t</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var tableIns;\r\n");
      out.write("function reloadTable() {\r\n");
      out.write("\ttableIns.reload({\r\n");
      out.write("\t page: {\r\n");
      out.write("         curr: 1 //重新从第 1 页开始\r\n");
      out.write("     },\r\n");
      out.write("     where: {\r\n");
      out.write("    \t operatorName: $(\"#operatorName\").val(),//搜索的关键字\r\n");
      out.write("    \t operatorId: $(\"#operatorId\").val(),\r\n");
      out.write("     }\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("layui.use(['form','layer','table','laytpl'],function(){\r\n");
      out.write("    var form = layui.form,\r\n");
      out.write("        layer = parent.layer === undefined ? layui.layer : top.layer,\r\n");
      out.write("        $ = layui.jquery,\r\n");
      out.write("        laytpl = layui.laytpl,\r\n");
      out.write("        table = layui.table;\r\n");
      out.write("\r\n");
      out.write("    //操作员列表\r\n");
      out.write("   tableIns = table.render({\r\n");
      out.write("        elem: '#operatorList',\r\n");
      out.write("        url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/operator/queryAllOperator.action',\r\n");
      out.write("        cellMinWidth : 95,\r\n");
      out.write("        page : true,\r\n");
      out.write("        toolbar: '#operatorToolBar',\r\n");
      out.write("        defaultToolbar: ['filter', 'exports'],\r\n");
      out.write("        height : \"full-125\",\r\n");
      out.write("        limit : 10,\r\n");
      out.write("        limits : [10,15,20,25],\r\n");
      out.write("        id : \"operatorListTable\",\r\n");
      out.write("        cols : [[\r\n");
      out.write("            {type: \"checkbox\", fixed:\"left\", width:50},\r\n");
      out.write("            {field: 'operatorId', title: '操作员编号', width:120, align:\"center\"},\r\n");
      out.write("            {field: 'operatorname', title: '操作员名称', align:\"center\"},\r\n");
      out.write("            {field: 'isAdmin ', title: '是否可用', align:'center', templet:function(d){\r\n");
      out.write("                return d.isAdmin==\"Y\"?\"管理员\":\"操作员\";\r\n");
      out.write("            }},\r\n");
      out.write("            {title: '操作', width:150, templet:'#operatorListBar',fixed:\"right\",align:\"center\"}\r\n");
      out.write("        ]]\r\n");
      out.write("    });\r\n");
      out.write("   //监听头工具栏事件\r\n");
      out.write("   table.on('toolbar(operatorList)', function(obj){\r\n");
      out.write("     var checkStatus = table.checkStatus(obj.config.id)\r\n");
      out.write("     ,data = checkStatus.data; //获取选中的数据\r\n");
      out.write("     switch(obj.event){\r\n");
      out.write("     case 'add':\r\n");
      out.write("     \taddOperator();\r\n");
      out.write("     break;\r\n");
      out.write("     };\r\n");
      out.write("   });\r\n");
      out.write("   //添加操作员\r\n");
      out.write("   function addOperator(){\r\n");
      out.write("       var index = layui.layer.open({\r\n");
      out.write("           title : \"添加操作员\",\r\n");
      out.write("           //area设置弹出层大小\r\n");
      out.write("           area:[\"800px\",\"600px\"],\r\n");
      out.write("           type : 2,\r\n");
      out.write("           content : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/operator/toAddOperator.action\",\r\n");
      out.write("           success : function(layero, index){\r\n");
      out.write("               var body = layui.layer.getChildFrame('body', index);\r\n");
      out.write("               \r\n");
      out.write("               setTimeout(function(){\r\n");
      out.write("                   layui.layer.tips('点击此处返回操作员列表', '.layui-layer-setwin .layui-layer-close', {\r\n");
      out.write("                       tips: 3\r\n");
      out.write("                   });\r\n");
      out.write("               },500)\r\n");
      out.write("           }\r\n");
      out.write("       })\r\n");
      out.write("      // layui.layer.full(index);//最大化窗口\r\n");
      out.write("       //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）\r\n");
      out.write("       $(window).on(\"resize\",function(){\r\n");
      out.write("           layui.layer.full(index);\r\n");
      out.write("       })\r\n");
      out.write("   }\r\n");
      out.write("   //搜索【此功能需要后台配合，所以暂时没有动态效果演示】\r\n");
      out.write("   $(\".search_btn\").on(\"click\",function(){\r\n");
      out.write("   \treloadTable();\r\n");
      out.write("   });\r\n");
      out.write("   //修改操作员\r\n");
      out.write("   function updateOperator(id){\r\n");
      out.write("       var index = layui.layer.open({\r\n");
      out.write("           title : \"修改操作员\",\r\n");
      out.write("           //area设置弹出层大小\r\n");
      out.write("           area:[\"800px\",\"600px\"],\r\n");
      out.write("           type : 2,\r\n");
      out.write("           content : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/operator/toUpdateOperator.action?id=\"+id,\r\n");
      out.write("           success : function(layero, index){\r\n");
      out.write("               var body = layui.layer.getChildFrame('body', index);\r\n");
      out.write("               setTimeout(function(){\r\n");
      out.write("                   layui.layer.tips('点击此处返回操作员列表', '.layui-layer-setwin .layui-layer-close', {\r\n");
      out.write("                       tips: 3\r\n");
      out.write("                   });\r\n");
      out.write("               },500)\r\n");
      out.write("           }\r\n");
      out.write("       })\r\n");
      out.write("      // layui.layer.full(index);//最大化窗口\r\n");
      out.write("       //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）\r\n");
      out.write("       $(window).on(\"resize\",function(){\r\n");
      out.write("           layui.layer.full(index);\r\n");
      out.write("       })\r\n");
      out.write("   }\r\n");
      out.write("   //列表操作\r\n");
      out.write("   table.on('tool(operatorList)', function(obj){\r\n");
      out.write("       var layEvent = obj.event,\r\n");
      out.write("           data = obj.data;\r\n");
      out.write("       if(layEvent === 'edit'){ //修改\r\n");
      out.write("       \tupdateOperator(data.id);\r\n");
      out.write("       }else if(layEvent === 'del'){ //删除\r\n");
      out.write("           layer.confirm('确定删除'+data.operatorname+'人员？',{icon:3, title:'提示信息'},function(index){\r\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/operator/deleteOperator.action\",{\r\n");
      out.write("                    id : data.id  //将需要删除的operatorId作为参数传入\r\n");
      out.write("                },function(data){\r\n");
      out.write("               \t layer.msg(data.msg);\r\n");
      out.write("                   tableIns.reload();\r\n");
      out.write("                   layer.close(index);\r\n");
      out.write("                })\r\n");
      out.write("           });\r\n");
      out.write("       } else if(layEvent === 'look'){ //预览\r\n");
      out.write("       }\r\n");
      out.write("   });\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
