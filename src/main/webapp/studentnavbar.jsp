<!DOCTYPE html>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
        /* Reset margin and padding for body and html elements */
        body, html {
            margin: 0;
            padding: 0;
             background-image: url('https://assets-global.website-files.com/5a9ee6416e90d20001b20038/64f5c4d7a2c4f397980b0e09_Rectangle%20(26).svg');
        background-size: cover;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        }

        /* Add any custom styles for the navbar here */
        .navbar {
            background-color: #333; /* Background color for the navbar */
            overflow: hidden;
            display: flex;
            justify-content: space-between; /* Items at the ends (brand name and navbar links) */
            align-items: center; /* Vertically center items in the navbar */
            padding: 15px; /* Adjust padding as needed */
            width: 100%; /* Make the navbar full width */
        }

        .navbar a {
            color: white; /* Text color for links */
            text-align: center;
            text-decoration: none;
            margin: 0 15px; /* Add some margin between links */
            transition: background-color 0.3s; /* Smooth transition for background color */
        }

        /* Add a style for the active link (current page) */
        .navbar a.active {
            background-color: #000; /* Background color for the active link */
        }
    </style>
</head>
<body>
    <div class="navbar">
        <div>
            <a href="#">SCRS</a> <!-- Brand name -->
        </div>
        <div>
            <a href="studenthome">Home</a>
            <a href="studentviewallcourses">Courses</a>
            <a href="updatestudentprofile">Update Profile</a>
            <a href="studentlogin">Logout</a>
        </div>
    </div>
    
</body>
</html>
