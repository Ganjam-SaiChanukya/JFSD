<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 

<html> 
<head> 
<link type="text css" rel="stylesheet" href="css/style.css"> 
<style> 
.container {
  border: 1px solid #ddd;
  padding: 0.5rem;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  margin-bottom: 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
  transition: background-color 0.2s, color 0.2s;
}

.container h3 {
  font-size: 1.0rem;
  margin: 0;
}

.container p {
  margin: 0;
}

.container .btn {
  display: inline-block;
  padding: 0.5rem 1rem;
  background-color: #007bff;
  color: black;
  text-decoration: none;
  border-radius: 3px;
  transition: background-color 0.2s;
}

/* Add a style for hover state */
.container:hover {
  background-color: white;
  color: black;
}

.button {
  background-color: #333;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 3px;
  margin-top: 20px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.button:hover {
  background-color: navy;
  border-color: white;
}
</style> 
</head> 
<body> 

<%@ include file="adminnavbar.jsp" %>

<br> 

<h3 align="center">Delete Student</h3> 

<div align="left">
<c:forEach items="${stddata}"  var="std"> 
  <div class="container"> 
    <div>
      <h3><b>ID:</b> <c:out value="${std.id}" /></h3><br>
      <p><b>NAME:</b> <c:out value="${std.name}" /></p><br>
      <p><b>DEPARTMENT: </b><c:out value="${std.department}" /></p>
    </div>
    <a class="button" href='<c:url value="deletestu/${std.id}"></c:url>'>Delete</a>
  </div> 
</c:forEach> 
</div>

</body> 
</html>
