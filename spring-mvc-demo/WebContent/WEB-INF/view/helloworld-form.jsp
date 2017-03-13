<!DOCTYPE html>
<html>
	<head>
		<title>Hello World - Input Form</title>
	</head>
	<body>
		<!-- Without processForm in HelloWorldController,
			 it will crash -->
		<form action="processFormVersionTwo" method="GET">
		
			<input type="text" name="studentName" placeholder="What's your name?"/>
			
			<input type="submit" />
			
		</form>
	</body>
</html>