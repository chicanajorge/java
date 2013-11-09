<%-- 
    Document   : nuevoAutor
    Created on : 01/11/2013, 08:57:47 PM
    Author     : Francisco
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
 
</head>
 
<body>
<h1>Struts 2 Example</h1>
 
<s:form action="guardarAutor">
        <s:textfield label="Nombres" name="autor.nombres"/>
	<s:textfield label="Apellido Paterno" name="autor.apePaterno"/>
	<s:textfield label="Apellido Materno" name="autor.apeMaterno"/>
	<s:submit value="Guardar"/>
</s:form>
 
</body>
</html>
