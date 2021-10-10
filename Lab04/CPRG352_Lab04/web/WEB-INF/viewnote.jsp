<%-- 
    Document   : viewnote
    Created on : 10-Oct-2021, 3:32:18 AM
    Author     : AponTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <div>
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2>
        </div>
        
        <div>
            <h3>Title:</h3><p name="view_title"> ${note.title}</p>
            <br>
            <h3>Contents: </h3><p name="view_content"> ${note.content}</p>
            <br>
        </div>
        
        <a href="note?edit">Edit</a>
    </body>
</html>
