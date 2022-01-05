<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chen.ssm.po.User" %>
<%@ page language="java" import="com.chen.ssm.po.User" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'list.jsp' starting page</title>


</head>

<body>
<%
    ArrayList userlist = (ArrayList) request.getAttribute("userlist");
%>
<h2 align="center">员工列表</h2>
<table align="center">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <%
        for (int i = 0; i < userlist.size(); i++) {
            User user = (User) userlist.get(i);
    %>
    <tr>
        <th><%=user.getId() %>
        </th>
        <th><%=user.getName() %>
        </th>
        <th><%=user.getPwd() %>
        </th>
        <th><a href="/prj-servlet-22/modify.jsp">修改</a><a href="/prj-servlet-22/delete.jsp">删除</a></th>
            <%
        } %>
</table>
</body>
</html>
