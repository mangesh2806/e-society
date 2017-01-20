<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<%-- <%@taglib prefix="sj" uri="/struts-jquery-tags" %> --%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>PhotoFolio | Style Demo</title>
<script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
<script>
function populateMemberInformation()
{
	 	
	document.myform.action ="/e-society/populateMemberAction";
    document.myform.submit();
   
    
    
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="../layout/styles/layout.css" type="text/css" />
<%-- <sj:head/> --%>
<sx:head />
</head>
<body id="top">
<div class="wrapper c
ol2">
  <div id="container" class="clear"> 
        <div id="content">
        <h2>Create Member</h2>
      <div id="respond">
        <form action="addMemberAction"  method="post" id="formSelectReload" name="myform">
        <p>
        <%-- <s:iterator value="populatememberList" var="member"> --%>
            <s:select name="memberId" id="memberId" list="memberListdropdown" headerValue="-----Please Select 1-----" headerKey="0" onchange="populateMemberInformation();" ></s:select>
            <label for="memberListdropdown"><small> Select Member (required)</small></label>
          </p>
            <p>
            
            <s:textfield id="firstname" name="membertemp.firstname" disabled="true"></s:textfield>
            <label for="firstname"><small> First Name (required)</small></label>
          </p>
          <p>
            <s:textfield id="lastname" name="membertemp.lastname" disabled="true"></s:textfield>
            <label for="lastname"><small> Last Name (required)</small></label>
          </p>
          <p>
            <input type="text" id="phonenumber" name="phonenumber"/>
            <label for="phonenumber"><small>Phone Number (required)</small></label>
          </p><p>
            <s:select name="membertemp.flatNo" id="flatNo" list="flatlist" disabled="true" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="flatNo"><small>Flat Number (required)</small></label>
          </p>
          
          <p>
            <s:select name="membertemp.wing" id="wing" list="winglist" disabled="true" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="wing"><small>Wing (required)</small></label>
          </p>
          
          <p>
            <input type="text" id="sscNo" name="sscNo"/>
            <label for="sscNo"><small>Social Certificate Number (required)</small></label>
          </p>
          <p>
            <input type="text" id="alternateAddress" name="alternateAddress"/>
            <label for="alternateAddress"><small>Alternate Address (required)</small></label>
          </p>
          <p>
            <input type="text" id="emergencyContact" name="emergencyContact"/>
            <label for="emergencyContact"><small>Emergency Contact (required)</small></label>
          </p>
          <p>
            <input type="text" id="email" name="email"/>
            <label for="email"><small>Email (required)</small></label>
          </p>
         <p>
            <sx:datetimepicker name="livingFrom" displayFormat="dd-MMM-yyyy" value="" />
         <label for="livingFrom"><small>Living From</small></label>  
          </p> 
          <p>
            <sx:datetimepicker name="dob" displayFormat="dd-MMM-yyyy" value="" />
         <label for="dob"><small>Date of Birth</small></label>  
          </p> 
        <p>
            <s:select name="serviceType" id="serviceType" list="{'Salaried','Owned Business'}" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="serviceType"><small>Service Type</small></label>
          </p>
          <p>
            <input type="text" id="companyName" name="companyName"/>
            <label for="companyName"><small>Company Name (required)</small></label>
          </p>
          <p>
            <input type="text" id="area" name="area"/>
            <label for="area"><small>Area (required)</small></label>
          </p>
          <p>
            <s:select name="isOnRent" id="isOnRent" list="{'YES','NO'}" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="isOnRent"><small>Flat On Rent</small></label>
          </p>
          <p>
          <%-- </s:iterator> --%>
            <input name="submitform" type="submit" id="submitform" value="Submit Form" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Reset Form" />
          </p>
          </form>
      </div>
    </div>
     
  </div>
</div>

</body>
</html>