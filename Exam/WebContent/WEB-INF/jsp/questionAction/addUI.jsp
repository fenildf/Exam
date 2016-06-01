<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>添加题目</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script  src="${pageContext.request.contextPath}/script/jquery.js"></script>
    <script  src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
    <script  src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
</head>
<body>

<!-- 标题显示 --> 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <s:form action="questionAction_add">
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 部门信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table class="mainForm">
                    <tr><td>请选择出题类型：</td>
                        <td><s:select name="queTypeId" list="#queTypeList"  listValue="name" listKey="id"   cssClass="SelectStyle">
                            </s:select>
                        </td>
                    </tr>
                    <tr>
                    	<td>试题内容：</td>
                    	<td><s:textarea name="content" cssClass="TextareaStyle"></s:textarea></td>
                    </tr>
                     <tr>
                    	<td>图片：</td>
                    	<td><s:textfield name="picture" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                    <tr>
                    	<td>试题答案：</td>
                    	<td><s:textarea name="answer" cssClass="TextareaStyle"></s:textarea></td>
                    </tr>
                    <tr>
                    	<td>难易程度：</td>
                    	<td><s:radio name="level" list="{'易','中等','难'}"></s:radio></td>
                    </tr>
                    <tr><td>科目：</td>
                        <td><s:select name="subjectId" list="#subjectList"  listValue="name" listKey="id"   cssClass="SelectStyle">
                            </s:select>
                        </td>
                    </tr>
                     <tr>
                    	<td>每小题几分：</td>
                    	<td><s:textfield name="level" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>
