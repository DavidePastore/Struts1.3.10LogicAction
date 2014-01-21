<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
<title>Verifica dato</title>
</head>

<body>
	<h3>Verifica dato</h3>

	<h4>Il numero inserito è:</h4>
	<h4>
		<bean:write name="LogicForm" property="number" />
	</h4>

	<logic:equal name="LogicForm" property="number" value="1">
		Hai immesso il numero 1 e sono entrato nel tag equal.
	</logic:equal>

	<logic:notEqual name="LogicForm" property="number" value="1">
		Hai immesso un numero diverso da 1 e sono entrato nel tag <b>notEqual</b>.
	</logic:notEqual>

</body>
</html>
