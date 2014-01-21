<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
<head>
<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
<title>Esempio tag logic</title>
</head>

<body>
	<html:form action="/logicAction" method="post">
		<h2>Enter a number:</h2>
		<html:text property="number" />

		<br />
	Nella pagina di output <b>logic:equal</b> funzionerà se il valore inserito sarà 1.
	Altrimenti verrà eseguito <b>logic:notEqual</b>.
	
	<br> <html:submit value="Submit" /> <html:cancel />
	</html:form>

</body>
</html:html>