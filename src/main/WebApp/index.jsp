<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add">

	    <label for="songTitle">Song Title</label>
	    <input type="text" id="songTitle" name="songTitle">
	    <br/>
	    <label for="songDuration">Song Duration</label>
	    <input type="text" id="songDuration" name="songDuration">
	    <br/>
	    <label for="songArtist">Song Artist</label>
	    <input type="text" id="songArtist" name="artist">
		<br/>
	    <button type="submit" class="btn btn-primary">Submit</button>
	  	  
	</form>

</body>
</html>