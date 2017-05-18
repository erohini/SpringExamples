<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>

/* $(document).ready(function(){
	$("button").click(function(){

		var div=$("div");
		div.animate({height: '300px', opacity: '0.4'}, "slow");
        div.animate({width: '300px', opacity: '0.8'}, "slow");
        div.animate({height: '100px', opacity: '0.4'}, "slow");
        div.animate({width: '100px', opacity: '0.8'}, "slow");
		});
}); */


$(document).ready(function(){
	$("button").click(function(){
		$("p").fadeToggle();});
});

$(document).ready(function(){
	$('input[name="userId"]').on({mouseenter: function(){
		$(this).css("background-color", "lightgray");
	},
	mouseleave: function(){
		$(this).css("background-color", "lightblue");
	},
		click: function(){
			$(this).css("background-color", "yellow");
		}


	});
});

$(document).ready(function(){
	$("#btn1").click(function(){
		alert("Text: "+$("p").text());
		});

	$("#btn2").click(function(){
		alert("HTML: "+$("p").html());
		});
});

</script>



</head>
<body>
<p><b>This is a paragraph</b></p>
<button>Toggle Button</button>
<button id="btn1">Button1</button>
<button id="btn2">Button2</button>
<!-- <div style="background:#98bf21;height:100px;width:100px;position:absolute;"></div> -->

	<h2 align="center">Register Process</h2>
	<form action="registerProcess">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" /></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" /></td>
			</tr>

			<tr>
				<td>User ID:</td>
				<td><input type="text" name="userId" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<td>ConfirmPassword:</td>
				<td><input type="password" name="confirmPassword" /></td>
			</tr>

			<tr>
				<td>Email:</td>
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
				<td>CITY:</td>
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