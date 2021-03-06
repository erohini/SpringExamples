<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<fmt:setBundle basename="resources.register" />
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	var xmlHttpRequest;
	function validateUsername() {

		var uName=document.getElementById("username");
		
		if (window.XMLHttpRequest) {
			//creating Http request object for modern browsers
			xmlHttpReq = new XMLHttpRequest();
		} else {
			//creating Http request object for IE6, IE5
			xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlHttpReq.open("GET","validateUsername?username=uName","true");
		//registering a call back function
		xmlHttpReq.onreadystatechange=processResponse;
		xmlHttpReq.send();
	}

function processResponse(){
	if(xmlHttpReq.readyState==4 && xmlHttpReq.status==200){

		document.getElementById("message").innerHTML=xmlHttpReq.responseText;
		}
	
}
	
</script>


</head>
<body>
	<h2 align="center">
		<fmt:message key="page.header"></fmt:message>
	</h2>
	<form action="registerProcess">
		<table>
			<tr>
				<td><fmt:message key="form.username"></fmt:message></td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName" id="username" onchange="validateUsername()" /></td>
				<td><div id="message"></div></td>
			</tr>
			<tr>
				<td><fmt:message key="form.password"></fmt:message></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>ConfirmPassword</td>
				<td><input type="password" name="confirmpassword" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Gender</td>
			</tr>
			<tr>
				<td>Female: <input type="radio" name="female" /></td>
				<td>Male: <input type="radio" name="male" /></td>
			</tr>
			<tr>
				<td>CITY</td>
				<td><select>
						<option>NYC</option>
						<option>HYD</option>
						<option>DTW</option>
						<option>RJY</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="REGISTER" /></td>
			</tr>
		</table>

	</form>

</body>
</html>