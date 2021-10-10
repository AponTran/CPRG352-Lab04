<%-- 
    Document   : editnote
    Created on : 10-Oct-2021, 3:25:42 AM
    Author     : AponTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form action="note" method="POST" >
            <div>
                <h1>Simple Note Keeper</h1>
                <h2>Edit Note</h2>
            </div>
            
            <h3>Title: </h3>
            <input type="text" name="edit_title" value="${note.title}">
            <br>
            <label>Contents:</label>
            <textarea  name="edit_contents" placeholder="${note.content}"></textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
