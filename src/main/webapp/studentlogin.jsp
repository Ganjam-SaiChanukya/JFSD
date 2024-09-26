<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
           body {
            background-image: url('https://assets-global.website-files.com/5a9ee6416e90d20001b20038/64f5c4d7a2c4f397980b0e09_Rectangle%20(26).svg'); /* Replace 'YOUR_IMAGE_URL' with your background image URL */
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
            background-color: transparent; /* Initial background color with full transparency */
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            margin-top: 50px;
            transition: background-color 0.3s; /* Add a smooth transition for background color changes */
        }

        .blink h3 {
            color: #333; /* Color for the blinking message */
        }

        h3 {
            color: black; /* Color for the "Student Login" heading */
        }

        label {
            display: block;
            text-align: left;
            margin-top: 10px;
            color: #333; /* Color for labels */
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .button {
            background-color: #333; /* Background color for the button */
            color: white; /* Text color for the button */
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            margin-top: 20px;
            cursor: pointer;
        }

        .button:hover {
            background-color: green; /* Background color for the button on hover */
            border-color: white;
        }

        .custom-link {
            text-decoration: none;
            color: #333; /* Color for the registration link */
        }

        .custom-link:hover {
            color: #000; /* Color for the registration link on hover */
        }
    </style>
</head>
<body>
    <%@ include file="navbar.jsp" %>
    <div class="container">
        <div class="blink">
            <h3 align="center" style="color:white">${message}</h3>
        </div>
        <h3 align="center"><b>Student Login</b></h3>
        <form method="post" action="checkstudentlogin">
            <label for="email">Email ID</label>
            <input type="email" name="email" required/>

            <label for="pwd">Password</label>
            <input type="password" name="pwd" required/>
            <br>
             <br>
             <br>

            <input type="submit" value="Login" class="button">
        </form>
        <h3 align="center">
            New Registration ? <a href="studentreg" class="custom-link">Sign Up</a>
        </h3>
    </div>
</body>
</html>
