<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html>
<head>
<link type="text/css" rel="stylesheet" href="css/style.css">
<style>
.student-container {
  border: 1px solid #ddd;
  padding: 0.5rem; /* Reduce padding to make it thin */
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  margin-bottom: 1rem;
  display: flex;
  justify-content: space-between; /* Move content to the right */
  align-items: center;
  transition: background-color 0.2s, color 0.2s;
}

.student-container h3 {
  font-size: 1.0rem;
  margin: 0; /* Remove margin to adjust spacing */
}

.student-container p {
  margin: 0; /* Remove margin to adjust spacing */
}

.student-container .btn {
  padding: 0.5rem 1rem;
  background-color: #007bff;
  color: black; /* Change the default button text color to black */
  text-decoration: none;
  border-radius: 3px;
  transition: background-color 0.2s;
}

/* Add a style for hover state */
.student-container:hover {
  background-color: white;
  color: black;
}

/* Style for the button on hover */
.student-container:hover .btn {
  background-color: skyblue;
  color: white;
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

<br>

<h3 align="center">List of Students</h3>

<div align="left">
  <c:forEach items="${studentdata}" var="student">
    <div class="student-container">
      <div>
        <h3><b>ID:</b> <c:out value="${student.id}" /></h3><br>
        <p><b>NAME:</b> <c:out value="${student.name}" /></p><br>
        <p><b>DEPARTMENT:</b> <c:out value="${student.department}" /></p>
      </div>
      <a class="button" href='<c:url value="viewstudent?id=${student.id}"></c:url>'>View</a>
    </div>
  </c:forEach>
</div>

</body>
</html>
