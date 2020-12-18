<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>  
<html lang="en">  
<head>  
    <meta charset="UTF-8">
    <title>Registration Page</title>
    <link rel="stylesheet" href="form.css">
</head>  
<body>  
    <h1>User Registration Page</h1>
    <form:form method="post" action="register" 
            modelAttribute="user">
        <form:label path="name">Full Name</form:label>
        <form:input path="name"/><br/>
        <form:errors path="name" cssClass="error" /><br/>

        <form:label path="email">Email</form:label>
        <form:input path="email"/><br/>
        <form:errors path="email" cssClass="error" /><br/>

        <form:label path="password">Password</form:label>
        <form:password path="password"/><br/>
        <form:errors path="password" cssClass="error" /><br/>

        <form:label path="birthDate">Birthday (yyyy-mm-dd):</form:label>
        <form:input path="birthDate" /><br />
        <form:errors path="birthDate" cssClass="error" /><br/>

        <form:label path="profession">Profession:</form:label>
        <form:select path="profession" items="${profession}" /><br />
        <form:errors path="profession" cssClass="error" /><br/>

        <form:button>Register</form:button>
    </form:form>
</body>  
</html>