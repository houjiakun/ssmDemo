<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body style="text-align: center">
<table>
    <th>
        <td>
            用户名
        </td>
        <td>
            密码${user[0].loginName}
        </td>
    </th>

   <%-- <c:forEach items="users" var="user">
        <tr>
            <td>&lt;%&ndash;${user.loginName}&ndash;%&gt;</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>--%>
</table>
</body>
</html>
