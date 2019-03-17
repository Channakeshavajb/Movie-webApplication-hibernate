<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MovieReview</title>
</head>
<body>
<h1>Movie Review</h1>
<form action="MovieServlet" method="post">
<label for="nm">MovieName</label>
<input type="text" name="name" id="nm" placeholder="Movie Name"><br><br>
<label for="ln">Language</label>
<select name="Lang" id="ln">
<option name="kan" value="Kannada">Kannada</option>
<option name="hin" value="Hindi">Hindi</option>Z
<option name="eng" value="English">English</option>
<option name="tel" value="telugu">Telugu</option>

</select><br><br>
<label for="bd">Budget</label>
<input type="text" name="budget" id="bd" placeholder="Budget"><br><br>
<label for="yes">YES</label>
<input type="radio" name="rec" value="Yes" id="yes" >
<label for="no">NO</label>
<input type="radio" name="rec" value="No" id="no" ><br><br>

<button type="submit">Submit</button>
<button type="reset">Reset</button>
</form>
</body>
</html>