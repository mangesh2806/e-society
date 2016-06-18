<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html >
  <head>
    <meta charset="UTF-8">


    <title>Log-in</title>
    
    
    
    <link rel='stylesheet prefetch' href='css/jquery-ui.css'>

        <link rel="stylesheet" href="css/style.css">

    
    
    
  </head>

  <body>

    <div class="login-card">
    <h2 align="center"><font color="white">You Have Successfully Logged Out, To Login :</font></h2><br>
  
    
  <div class="login-help">
    <%-- <a href="<%=request.getContextPath()%>/loginAction"><h3>Click Here</h3></a> --%>
    <h2 align="center"><font color="white"><a href="<%=request.getContextPath()%>/login.jsp">LOGIN</a></font></h2><br>
  </div>
</div>
    <script src='js/jquery-2.1.4.min.js'></script>
<script src='js/jquery-ui.min.js'></script>

    
    
    
    
  </body>
</html>
