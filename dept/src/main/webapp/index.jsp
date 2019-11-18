<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/13
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>


<h1>员工列表</h1>
<h3>欢迎管理员：${user.usersName}</h3>
<a href="/addORupdata.do?is=0">添加员工</a>
<table border="1">
    <tr>
        <td>序号</td>
        <td>员工名称</td>
        <td>部门</td>
        <td>工资</td>
        <td>性别</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${empList}" var="emp">
    <tr>
        <td>${emp.empId}</td>
        <td>${emp.empName}</td>
        <td>${emp.dept}</td>
        <td>${emp.empSal}</td>
        <td>${emp.empSex}</td>
        <td>${emp.createDate}</td>
        <td><a href="/addORupdata.do?is=1&empId=${emp.empId}">修改</a>&nbsp;&nbsp;<a target="aa" onclick="deleteEmp(${emp.empId})">删除</a></td>
    </tr>
    </c:forEach>

</table>
<iframe id="aa" name="aa" style="display: none"></iframe>
<script>

    function deleteEmp(empId){
        var r=confirm("确认删除吗");
        if(r==true){
            location.href="/deleteEmp.do?empId="+empId;
        }
    }

</script>
</body>
</html>
