<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<%-- <%@taglib prefix="sj" uri="/struts-jquery-tags" %> --%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>PhotoFolio | Style Demo</title>
<script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
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
        <h2>Create Notice</h2>
      <div id="respond">
        <form action="addNoticeAction"  method="post" id="formSelectReload">
        
            <p>
            <s:textarea name="description" id="description"></s:textarea>
          	<label for="description"><small>Description:</small></label>
          </p>
         <p>
            <sx:datetimepicker name="notice_date" displayFormat="dd-MMM-yyyy" value="" />
         <label for="notice_date"><small>Notice Date</small></label>  
          </p> 
         
           <p>
            <input name="submit" type="submit" id="submit" value="Submit Form" />
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