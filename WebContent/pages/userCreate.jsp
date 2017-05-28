<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>PhotoFolio | Style Demo</title>
<script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
<script>
$(document).ready(function() {
   $('#states').change(function(event) {
      var state = $("select#states").val();
      $.getJSON('ajaxAction', {
    	  stateName : state
      }, function(jsonResponse) {
        $('#ajaxResponse').text(jsonResponse.dummyMsg);
        var select = $('#city');
        select.find('option').remove();
        $.each(jsonResponse.cityMap, function(key, value) {
          $('<option>').val(key).text(value).appendTo(select);
        });
      });
      });
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="../layout/styles/layout.css" type="text/css" />
</head>
<sj:head />
<body id="top">
<div class="wrapper col2">
  <div id="container" class="clear"> 
        <div id="content">
        <h2>Create a User</h2>
      <div id="respond">
        <form action="addUserAction"  method="post" id="formSelectReload">
        <p>
            <s:select name="wing" id="wing" list="winglist" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="wing"><small> Select Wing (required)</small></label>
          </p>
        <p>
            <s:select name="flat" id="flat" list="flatlist" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="flat"><small> Select Flat (required)</small></label>
          </p>
        
            <p>
            <!-- <input id="firstname" type="text" name="firstname"  /> -->
            <s:textfield id="firstname" name="firstname"></s:textfield>:
            <label for="firstname"><small> First Name (required)</small></label>
          </p>
          <p>
            <input id="lastname" type="text" name="lastname"  />
            <label for="lastname"><small> Last Name (required)</small></label>
          </p>
          <br>
          <br>
          <p>
            <s:select name="userType" id="user_type" list="usertypelist" headerValue="-----Please Select 1-----" headerKey="0"></s:select>
            <label for="user_type"><small> User Type (required)</small></label>
          </p>
          <br>
          <p>
            <input type="password" id="password" name="password"/>
            <label for="password"><small>Password (required)</small></label>
          </p>
          <br>
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