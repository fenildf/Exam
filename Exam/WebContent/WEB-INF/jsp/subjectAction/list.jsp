<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>科目列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="${pageContext.request.contextPath}/script/jquery.js"></script>
    <script  src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
    <script  src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 科目管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
            	<td width="150px">编号</td>
				<td width="150px">科目名称</td> 
				<td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer">
        
		
		<s:iterator value="#subjectList">
			<tr class="TableDetail1 template">
				<td>${id }</td>
				<td>${name}&nbsp;</td>
				<td>
				<s:a action="subjectAction_delete?id=%{id}" onClick="return window.confirm('您确定要删除${name}吗？')">删除</s:a>
					<s:a action="subjectAction_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
        </s:iterator>
        
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
           <s:a action="subjectAction_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>

<!--说明
<div id="Description"> 
	说明：<br /></div>
-->	
</body>
</html>
