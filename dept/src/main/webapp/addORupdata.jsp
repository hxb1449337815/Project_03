<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/13
  Time: 14:52
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
<h1>${msg}</h1>
<c:if test="${msg=='添加员工'}"><form method="post" action="/addEmp.do"></c:if><c:if test="${msg=='修改员工'}"><form method="post" action="/updateEmp.do"></c:if>
    <table border="1">
        <tr>
            <td>员工名称</td>
            <td><input name="empName" value="${emp.empName}"/><input type="hidden" name="empId" value="${emp.empId}"/></td>
        </tr>
        <tr>
            <td>部门</td>
            <td><select name="deptId">
                <c:if test="${emp.deptId==1}"><option value="1">研发部</option></c:if>
                <c:if test="${emp.deptId==2}"><option value="1">测试部</option></c:if>
                <c:if test="${emp.deptId==3}"><option value="1">市场部</option></c:if>
                <option value="1">研发部</option>
                <option value="2">测试部</option>
                <option value="3">市场部</option>
            </select></td>
        </tr>
        <tr>
            <td>工资</td>
            <td><input name="empSal" value="${emp.empSal}"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" value="男" <c:if test="${emp.empSex=='男'}">checked</c:if> name="empSex">男&nbsp;<input type="radio" value="女" <c:if test="${emp.empSex=='女'}">checked</c:if> name="empSex">女 </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="保存" /></td>
        </tr>
    </table>
</form>

</body>
</html>
