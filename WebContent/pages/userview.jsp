<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>PhotoFolio | Style Demo</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="../layout/styles/layout.css" type="text/css" />
</head>
<body id="top">


<div class="wrapper col2">
  <div id="container" class="clear"> 
   
    <div id="content">
      
      <h2>Table(s)</h2>
      <table summary=" Users " cellpadding="0" cellspacing="0">
      
        <thead>
          <tr>
            <th>User ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>User Type</th>
            </tr>
        </thead>
        <tbody>
         <s:iterator value="userlist" var="user">
          <tr class="dark">
            <td><s:property value="userId" /></td>
            <td><s:property value="firstname"/></td>
             <td><s:property value="lastname"/></td>
             <td><s:property value="userType"/></td>
             <td><a href="userEdit?id=<s:property value="userId"/>">edit</a></td>
           </tr>
          </s:iterator>
        </tbody>
       
      </table>
      
      </div>
    <!-- <div id="column">
      <div class="subnav">
        <h2>Secondary Navigation</h2>
        <ul>
          <li><a href="#">Navigation - Level 1</a></li>
          <li><a href="#">Navigation - Level 1</a>
            <ul>
              <li><a href="#">Navigation - Level 2</a></li>
              <li><a href="#">Navigation - Level 2</a></li>
            </ul>
          </li>
          <li><a href="#">Navigation - Level 1</a>
            <ul>
              <li><a href="#">Navigation - Level 2</a></li>
              <li><a href="#">Navigation - Level 2</a>
                <ul>
                  <li><a href="#">Navigation - Level 3</a></li>
                  <li><a href="#">Navigation - Level 3</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li><a href="#">Navigation - Level 1</a></li>
        </ul>
      </div>
      
     
    </div> -->
    <!-- ####################################################################################################### --> 
  </div>
</div>
<!-- ####################################################################################################### -->

</body>
</html>