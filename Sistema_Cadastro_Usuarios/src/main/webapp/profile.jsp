<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.example.model.User" %>
<%
    HttpSession session = request.getSession(false);

    if (session == null || session.getAttribute("user") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    User user = (User) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
</head>
<body>
    <h2>Profile</h2>
    <p>Name: <%= user.getName() %></p>
    <p>Email: <%= user.getEmail() %></p>
    <br>
    <a href="logout">Logout</a>
</body>
</html>
