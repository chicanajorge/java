<%-- 
    Document   : listAutor
    Created on : 01/11/2013, 08:49:03 PM
    Author     : Francisco
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>

    </head>

    <body>
        <h1>Struts 2 Example</h1>

        <s:if test="hasActionErrors()">
            <div class="errors">
                <s:actionerror/>
            </div>
        </s:if>
        <table>
            <tr>
                <th>Nombres</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Accion</th>
            </tr>
            <s:iterator value="autores">
                <tr><td><s:property value="nombres"/></td>
                    <td><s:property value="apePaterno"/></td>
                    <td><s:property value="apeMaterno"/></td>
                    <td><a href="eliminarAutor?id=<s:property value="idAutor" />" /> Eliminar </a></td>
                </tr>
            </s:iterator>
        </table>
        <a href="nuevoAutor">Agregar nuevo autor</a>
    </body>
</html>
