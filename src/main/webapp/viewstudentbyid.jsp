<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1" %>

<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
        /* Center the card and content on the page */
       body {
        background-size: cover;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: flex-start;
        height: 100vh;
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
        transition: background-color 0.3s;
    }
    
     .container:hover
    {
    background-color: navy;
    color: white;
    border-color:white;
    transform: scale(1.05);
    } 

    .button {
        background-color: #333;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        margin-top: 20px;
        cursor: pointer;
        transition: background-color 0.3s; /* Add transition for the button */
    }

    .button:hover {
        background-color: navy; /* Change background color on hover */
        border-color: white;
    }
    </style>
</head>
<body>
<%@ include file="adminnavbar.jsp" %>


<div class="container" align="center">
    <h2 class="data">Student Information</h2>

    <p class="data">ID : ${student.id}</p>
    <p class="data">Name : ${student.name}</p>
    <p class="data">Gender : ${student.gender}</p>
    <p class="data">Date of Birth : ${student.dateofbirth}</p>
    <p class="data">Department : ${student.department}</p>
    <p class="data">Email : ${student.email}</p>
    <p class="data">Location : ${student.location}</p>
    <p class="data">Contact No : ${student.contact}</p>
</div>
<br>
<br>
<a href="viewallstudents" class="button">Back</a>
</body>
</html>
