<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registered</title>  
</head>  
  <body>  
    <center>  
      <span>User Registered</span>  
    </center>  
    <br>  
    <table align="center" border="1">  
        <tr>  
            <td height="100"><span>user name:</span></td>  
            <td height="100"><span>${param.username }</span></td>  
        </tr>  
        <tr>  
            <td height="100"><span>password:</span></td>  
            <td height="100"><span>${param.password }</span></td>  
        </tr>  
                <tr>  
            <td height="100"><span>gender:</span></td>  
            <td height="100"><span>${param.gender }</span></td>  
        </tr>  
        <tr>  
            <td height="100" colspan="2" align="center"><a href="UserInfoRegistration.jsp">return to registration</a></td>  
        </tr>  
    </table>  
  </body>  
</html>