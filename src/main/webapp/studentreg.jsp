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
            background-color: green; /* Background color for the button on hover */
            border-color: white;
        }
    </style>
</head>
<body>
    <%@ include file="navbar.jsp" %>
    <div class="container">
        <h3>Student Registration</h3>
        <form method="post" action="insertstudent">
            <label for="name">Name</label>
            <input type="text" name="name" required="required"/>

            <label>Gender</label>
            <input type="radio" name="gender" value="MALE" required/>Male
            <input type="radio" name="gender" value="FEMALE" required/>Female
            <input type="radio" name="gender" value="OTHERS" required/>Others

            <label>Date of Birth</label>
            <input type="date" name="dob" required="required"/>

            <label>Department</label>
            <select name="dept" required>
                <option value="">---Select---</option>
                <option value="CSE">CSE</option>
                <option value="CSIT">CSIT</option>
                <option value="MECHANICAL">MECHANICAL</option>
                <option value="ECE">ECE</option>
                <option value="EEE">EEE</option>
                <option value="BIOTECHNOLOGY">BIOTECHNOLOGY</option>
                <option value="OTHERS">Others</option>
            </select>

            <label>Email ID</label>
            <input type="email" name="email" required/>

            <label>Password</label>
            <input type="password" name="pwd" required/>

            <label>Location</label>
            <input type="text" name="location" required/>

            <label>Contact No</label>
            <input type="text" name="contact" pattern="[789][0-9]{9}" placeholder="Must be 10 digits" required/>

            <input type="submit" value="Register" class="button">
        </form>
    </div>
</body>
</html>
