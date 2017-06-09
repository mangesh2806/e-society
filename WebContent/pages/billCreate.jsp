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
	 	
	document.myform.action ="/e-society/populateMemberInformationForBill";
    document.myform.submit();
}

function calculateMaintainceCharge()
{
	var rate=document.getElementById("maintenanceRate").value;
	alert("Rate is:"+rate);
	var area=document.getElementById("area").value;
	alert("Area is:"+area);
	var maintainceCharge=rate * area;
	document.getElementById("maintainceCharger").value=maintainceCharge;
}

function calculateParkingCharge()
{
	var twowheelerparking=document.getElementById("twowheelerparking").value;
	alert("twowheelerparking is:"+twowheelerparking);
	var fourwheelerparking=document.getElementById("fourwheelerparking").value;
	alert("fourwheelerparking is:"+fourwheelerparking);
	var twowheelerparkingCharge=document.getElementById("twowheelerparkingCharge").value;
	var fourwheelerparkingCharge=document.getElementById("fourwheelerparkingCharge").value;
	
	var parkingCharge=twowheelerparking * twowheelerparkingCharge + fourwheelerparking * fourwheelerparkingCharge;
	alert("parkingCharge is:"+parkingCharge);
	document.getElementById("parkingCharge").value=parkingCharge;
	
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
        <h2>Create Bill</h2>
      <div id="respond">
        <form action="populateMemberInformationForBill"  method="post" id="formSelectReload" name="myform">
            <p>
            <s:select name="memberId" id="memberId" list="memberlist" headerValue="-----Please Select -----" headerKey="0" onchange="populateMemberInformation();"></s:select>
            <label for="memberId"><big>Select a Member to Create Bill</big></label>
          </p>
           
           </form>
           <s:iterator value="memberinfolist" var="member">
           
           <form action="createBill"  method="post" id="formSelectReload" name="myform">
           
           	<label for="firstName">First Name:</label>
            <s:textfield id="firstName" name="billtemp.firstName"></s:textfield>
            
            <label for="lastName">Last Name:</label>
            <s:textfield id="lastName" name="billtemp.lastName"></s:textfield><br>
            
            <label for="bmcTax">BMC Tax:</label>
            <s:textfield id="bmcTax" name="billtemp.bmcTax"></s:textfield>
            
             <label for="waterChargers">Water Charges:</label>
            <s:textfield id="waterChargers" name="billtemp.waterChargers"></s:textfield><br>
           
            <label for="subletCharges">Sublet Charges:</label>
            <s:textfield id="subletCharges" name="billtemp.subletCharges"></s:textfield>
            
            <label for="sinkingFund">Sinking Fund:</label>
            <s:textfield id="sinkingFund" name="billtemp.sinkingFund"></s:textfield><br>
            
            <label for="insuranceCharger">Insurance Charges:</label>
            <s:textfield id="insuranceCharger" name="billtemp.insuranceCharger"></s:textfield>
            
            <label for="conveyance">Conveyance:</label>
            <s:textfield id="conveyance" name="billtemp.conveyance"></s:textfield><br>
            
            <label for="area">Area:</label>
            <s:textfield id="area" name="billtemp.area"></s:textfield>
            
            <label for="maintenanceRate">Maintenance Rate/Square Foot:</label>
            <s:textfield id="maintenanceRate" name="billtemp.maintenanceRate" disabled="true"></s:textfield><br>
            
            <label for="maintainceCharger">Maintaince Charge</label>
            <s:textfield id="maintainceCharger" name="billtemp.maintainceCharger"></s:textfield><br>
            
            
            <label for="twowheelerparking">Number of Two Whellers:</label>
            <s:textfield id="twowheelerparking" name="billtemp.twowheelerparking"></s:textfield>
            
            <label for="fourwheelerparking">Number of Four Whellers:</label>
            <s:textfield id="fourwheelerparking" name="billtemp.fourwheelerparking"></s:textfield><br>
            
            <label for="twowheelerparkingCharge">Two Wheller Parking Charge:</label>
            <s:textfield id="twowheelerparkingCharge" name="billtemp.twowheelerparkingCharge" disabled="true" ></s:textfield>
            
            <label for="fourwheelerparkingCharge">Four Wheller Parking Charge:</label>
            <s:textfield id="fourwheelerparkingCharge" name="billtemp.fourwheelerparkingCharge" disabled="true"></s:textfield><br>
            
            
            <label for="parkingCharge">Parking Charge:</label>
            <s:textfield id="parkingCharge" name="billtemp.parkingCharge"></s:textfield><br>
           
            <label for="repairFund">Repair Fund:></label>
            <s:textfield id="repairFund" name="billtemp.repairFund"></s:textfield>
            
            <label for="others">Others:</label>
            <s:textfield id="others" name="billtemp.others"></s:textfield><br>
            
             <label for="arrears">Arrears:</label>
             <s:textfield id="arrears" name="billtemp.arrears"></s:textfield>
           
            <label for="interestOnArrears">Interest On Arrears:</label>
             <s:textfield id="interestOnArrears" name="billtemp.interestOnArrears"></s:textfield>
             
            <input name="submit" type="submit" id="submit" value="Create Bill" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Reset Form" />
            
           </form>
           </s:iterator>
           
      </div>
    </div>
     
  </div>
</div>

</body>
</html>