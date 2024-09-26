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
            background-color: green; /* Background color for the button on hover */
            border-color: white;
        }
    </style>
</head>
<body>
    <%@ include file="studentnavbar.jsp" %>
    <div class="container">
        <h3>Update Profile</h3>
        <form method="post" action="updatestudent">
            <label for="name">Name</label>
            <input type="text" name="name" required="required" value="${student.name}"/>

            <label>Gender</label>
            ${student.gender} <br>

            <label>Date of Birth</label>
            <input type="date" name="dob" required="required" value="${student.dateofbirth}" />

            <label>Department</label>
            <select name="dept" required>
                <option value="${student.department}" selected>${student.department}</option>
                <option value="CSE">CSE</option>
                <option value="CSIT">CSIT</option>
                <option value="MECHANICAL">MECHANICAL</option>
                <option value="ECE">ECE</option>
                <option value="EEE">EEE</option>
                <option value="BIOTECHNOLOGY">BIOTECHNOLOGY</option>
                <option value="OTHERS">Others</option>
            </select>

            <label>Email ID</label>
            <input type="email" name="email" required value="${student.email}" readonly/>

            <label>Password</label>
            <input type="password" name="pwd" required value="${student.password}" />

            <label>Location</label>
            <input type="text" name="location" required value="${student.location}"/>

            <label>Contact No</label>
            <input type="text" name="contact" required value="${student.contact}" />

            <input type="submit" value="Update" class="button">
        </form>
    </div>
</body>
</html>
