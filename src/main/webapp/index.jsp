<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link rel="stylesheet" href="resources/css/style.css">
<script type="text/javascript">
	function check() {
		val = true;
		if (!IsEmpty(document.getElementById("username"), "USERNAME"))
			return false;
		if (!IsEmpty(document.getElementById("password"), "PASSWORD"))
			return false;

		//if (!validate_email(document.getElementById("username"),
		//		"Email id Not valid"))
		//return false;
		if (!validatePassword(document.getElementById("password")))
			return false;

		//alert(val);
		return val;

	}
	function IsEmpty(objectfield, stringfield) {
		objectvalue = objectfield.value.length;
		if (objectvalue == "") {
		//	alert("Oops.. Please fill out the value of " + stringfield);
			objectfield.style.background = 'Red';
			return false;
		} else
			objectfield.style.background ="#53e3a6";
			return true;
	}

	function validate_email(field, alerttxt) {
		with (field) {
			apos = value.indexOf("@");
			dotpos = value.lastIndexOf(".");
			if (apos < 1 || dotpos - apos < 2) {
				//alert(alerttxt);
				return false;
			} else {
				return true;
			}
		}
	}

	function validatePassword(fld) {
		var error = "";
		var illegalChars = /[\W_]/; // allow only letters and numbers

		if (fld.value == "") {
			fld.style.background = 'Red';
			error = "You didn't enter a password.\n";
			//alert(error);
			return false;

		} else if ((fld.value.length < 7) || (fld.value.length > 15)) {
			error = "The password is the wrong length. \n";
			fld.style.background = 'Red';
			//alert(error);
			return false;

		} else if (illegalChars.test(fld.value)) {
			error = "The password contains illegal characters.\n";
			fld.style.background = 'Red';
		//	alert(error);
			return false;

		} else if ((fld.value.search(/[a-zA-Z]+/) == -1)
				|| (fld.value.search(/[0-9]+/) == -1)) {
			error = "The password must contain at least one numeral.\n";
			fld.style.background = 'Red';
		//	alert(error);
			return false;

		} else {
			fld.style.background = '#53e3a6';
		}
		return true;
	}
</script>

</head>

<body>

	<h5 hidden="true">Oops.. Please fill out the value of</h5>
	<div class="wrapper">
		<div class="container">
			<h1>Welcome</h1>

			<form class="form" action="ValidateLogin"  method="post" >
				<input type="text" placeholder="Username" id="username" name="username"> <input
					type="password" placeholder="Password" id="password" name="password">
				<button type="submit" id="login-button" >Login</button>
			</form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>






</body>
</html>
