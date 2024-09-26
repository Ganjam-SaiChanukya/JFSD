<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
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
            background-color: #333; /* Background color for the button */
            color: white; /* Text color for the button */
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
    <%@ include file="adminnavbar.jsp" %>
    <div class="container">
        <h3>Add Course</h3>
        <form method="post" action="insertcourse" enctype="multipart/form-data">
        
        
            <label for="coursecode">Course Code</label>
            <input type="text" name="coursecode" required="required"/>
          
            <label for="coursetitle">Course Title</label>
            <input type="text" name="coursetitle" required="required"/>
            
            <br>
            <label>LPTS</label>
            <input type="text" name="ltps" required="required"/>
            
            <label>Credits</label>
            <input type="text" name="credits" required="required"/>
            
            <label>Project File</label><br>
            <input type="file" name="courseimage" required="required"/>
            <br>
            <br>

            <input type="submit" value="Add Course" class="button">
        </form>
    </div>
</body>
</html>
