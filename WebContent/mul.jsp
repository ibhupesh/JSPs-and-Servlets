<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
       <%  
        int i= Integer.parseInt(request.getParameter("num3")); //getting the first parameter and converting it into integer
		int j= Integer.parseInt(request.getParameter("num4"));
		
		int k= i*j; // multiplying the two number
		out.println("Product of the two numbers = "+k);
		System.out.println(i+" * "+j+" = "+k);
		%>

</body>
</html>