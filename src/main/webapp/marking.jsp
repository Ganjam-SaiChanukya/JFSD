<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
          body {
            background-image: url('https://assets-global.website-files.com/5a9ee6416e90d20001b20038/64f5cd668cdc87f3cdf36c7e_Rectangle%20(3).svg'); /* Replace 'YOUR_IMAGE_URL' with your background image URL */
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

        h3 {
            text-align: center;
            text-decoration: underline;
        }

        label {
            display: block;
            text-align: left;
            margin-top: 10px;
        }

        input[type="radio"] {
            margin: 0 5px;
        }

        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="number"],
        input[type="email"],
        input[type="password"],
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="text"][pattern]:invalid {
            outline: 2px solid red;
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
            background-color: purple; /* Background color for the button on hover */
            border-color: white;
        }
    </style>
</head>
<body>
    <%@ include file="facultynavbar.jsp" %>
    <div class="container">
        <h3>Project Marking</h3>
        <form method="post" action="#">
            <label>Marks</label>
            <input type="number" name="projectmarks" required="required"/>
            
           <input type="button" value="Submit" class="button" onclick="window.location.href = 'markingmessage.jsp';">

        </form>
    </div>
</body>
</html>
