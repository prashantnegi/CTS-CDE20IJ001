<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>User registration</title>
    <link rel="stylesheet" href="/register.css" type="text/css"/>
</head>

<body>

    <h3>User Registration</h3>
    <form:form action="register" method="post" modelAttribute="user">
        <form:label path="name">Full name:</form:label>
        <form:input path="name" /><br />
        <form:errors path="name" cssClass="error" /><br/>

        <form:label path="email">E-mail:</form:label>
        <form:input path="email" /><br />
        <form:errors path="email" cssClass="error" /><br/>

        <form:label path="password">Password:</form:label>
        <form:password path="password" /><br />
        <form:errors path="password" cssClass="error" /><br/>

        <form:label path="birthDay">Birthday (yyyy-mm-dd):</form:label>
        <form:input path="birthDay" /><br />
        <form:errors path="birthDay" cssClass="error" /><br/>

        <form:label path="gender">Gender:</form:label>
        <form:radiobutton path="gender" value="Male" />Male
        <form:radiobutton path="gender" value="Female" />Female<br />
        <form:errors path="gender" cssClass="error" /><br/>

        <form:label path="profession">Profession:</form:label>
        <form:select path="profession" items="${professionList}" /><br />
        <form:errors path="profession" cssClass="error" /><br/>

        <form:label path="married">Married?</form:label>
        <form:checkbox path="married" /><br />
        <form:errors path="married" cssClass="error" /><br/>

        <form:label path="note">Note:</form:label>
        <form:textarea path="note" cols="25" rows="5" /><br />
        <form:errors path="note" cssClass="error" /><br/>

        <form:button>Register</form:button>

    </form:form>
</body>

</html>