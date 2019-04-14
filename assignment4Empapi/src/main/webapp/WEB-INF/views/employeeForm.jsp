<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form Page</title>
</head>
<body>

<h2>Please Enter Employee Details</h2>

<form action="/createEmployee" method="post" >

Enter EmployeeId:- <input type="text" name="empId"><br>
Enter Employee Name:- <input type="text" name="empName"><br>

Enter Employee Mail:- <input type="text" name="empMail"><br>
Enter Employee Location:- <input type="text" name="empLocation"><br>
<br>

<input type="submit" value="submit">


</form>

</ul>

</body>
</html>