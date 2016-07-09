<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>  
</head>  
<body>  
    <h1 align="center">User Registration Page</h1>  
    <form method="post" action="register" class="form">  
        <table width="280" border="0" align="center">  
            <tr>  
                <td width="87" align="center" valign="middle" >  
                        <div align="right">name:</div>  
                </td>  
                <td width="183">  
                  <label>  
                    <input name="username" type="text" id="username" maxlength="10" />  
                  </label>  
                <td>  
            </tr>  
            <tr>  
                <td height="37" align="center" valign="middle">  
                  <div align="right">password: </div>  
                </td>  
                <td>  
                    <label>   
                        <input name="password" type="password" id="password" maxlength="20" />   
                    </label>  
                </td>  
            </tr>  
            <tr>  
                <td height="37" align="center" valign="middle">  
                  <div align="right">gender: </div>  
                </td>  
                <td>  
                    <label>   
                        <input name="gender" type="text" id="gender" maxlength="20" />   
                    </label>  
                </td>  
            </tr>  
            <tr>  
                <td align="center" valign="middle">  
                    <input type="submit" name="Submit" value="submit" />  
                </td>  
                <td>   
                    <input name="reset" type="reset" id="reset" value="reset" />  
                </td>  
            </tr>  
        </table>  
    </form>  
</body>  
</html>