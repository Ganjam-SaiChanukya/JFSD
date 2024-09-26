<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
        /* Add any custom styles for the page content here */
        .page-content {
            text-align: center;
        }

        .page-content img {
            width: 100%; /* Make the image full-width */
            height: auto;
        }

        /* Add styles for the containers */
        .container-row {
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
            margin: 20px 0;
        }

        .container {
            width: calc(33.33% - 20px); /* Three containers in a row with some spacing */
            background-color: transparent; /* Background color for the containers */
            border: 1px solid #ccc;
            padding: 20px;
            margin-bottom: 20px;
            transition: background-color 0.3s; /* Smooth transition for the background color change on hover */
        }
         .container:hover {
            background-color: #f1f1f1; /* Light color for the container on hover */
            transform: scale(1.05); /* Zoom in the container on hover */
        }

    </style>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Home</title>
</head>
<body>

<%@ include file="facultynavbar.jsp" %>
<div class="page-content">
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
    
</body>
</html>
