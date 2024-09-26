<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
    body {
        background-image: url('https://assets-global.website-files.com/5a9ee6416e90d20001b20038/64f5d5f04d7b8b89e6a66e35_Rectangle%20(31).svg');
        background-size: cover;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    .container {
        width: 100%;
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        text-align: center;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        margin-top: 50px;
        transition: background-color 0.3s; /* Add a smooth transition for background color changes */
    }

    .blink h3 {
        color: #333;
    }

    h3 {
        color: black;
    }

    label {
        display: block;
        text-align: left;
        margin-top: 10px;
        color: #333;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    .button {
        background-color: #333;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        margin-top: 20px;
        cursor: pointer;
    }

    .button:hover {
        background-color: navy;
        border-color: white;
    }
</style>

</head>
<body>
    <%@ include file="navbar.jsp" %>
    <div class="container">
        <div class="blink">
            <h3 align="center">${message}</h3>
        </div>
        <h3 align="center">Admin Login</h3>
        <form method="post" action="checkadminlogin">
            <label for="uname">Username</label>
            <input type="text" name="uname" required/>

            <label for="pwd">Password</label>
            <input type="password" name="pwd" required/>
            <br>
             <br>
             <br>

            <input type="submit" value="Login" class="button">
        </form>
    </div>
</body>
</html>
