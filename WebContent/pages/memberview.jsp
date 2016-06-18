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
            <th>Member ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Phone Number</th>
            <th>Flat Number</th>
            <th>Wing</th>
            <th>Society Share Certificate</th>
            </tr>
        </thead>
        <tbody>
         <s:iterator value="memberlist" var="member">
          <tr class="dark">
            <td><s:property value="memberId" /></td>
            <td><s:property value="firstname"/></td>
             <td><s:property value="lastname"/></td>
             <td><s:property value="phonenumber"/></td>
             <td><s:property value="flatNo"/></td>
             <td><s:property value="wing"/></td>
             <td><s:property value="sscNo"/></td>
                           
           </tr>
          </s:iterator>
        </tbody>
       
      </table>
      
      </div>
   
    <!-- ####################################################################################################### --> 
  </div>
</div>
<!-- ####################################################################################################### -->

</body>
</html>