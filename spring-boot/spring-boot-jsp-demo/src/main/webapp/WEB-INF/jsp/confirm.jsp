<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>User Confirmation</title>
    <link rel="stylesheet" href="/register.css" type="text/css"/>
</head>

<body>

    <h3>User Confirmation</h3>
    <div align="center">
        <h2>Registration Succeeded!</h2>
        <span>Full name:</span><span>${user.name}</span><br/>
        <span>E-mail:</span><span>${user.email}</span><br/>
        <span>Password:</span><span>${user.password}</span><br/>
        <span>Birthday:</span><span>${user.birthDay}</span><br/>
        <span>Gender:</span><span>${user.gender}</span><br/>
        <span>Profession:</span><span>${user.profession}</span><br/>
        <span>Married?:</span><span>${user.married}</span><br/>
        <span>Note:</span><span>${user.note}</span><br/>
    </div>
</body>

</html>