<%-- 
    Document   : vliegtuigtype.jsp
    Created on : 3-apr-2019, 10:54:24
    Author     : Wannes
--%>

<%@page import="hbo5.it.www.beans.Vliegtuigtype"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alle vliegtuigtypes</h1>
        <%ArrayList<Vliegtuigtype> vliegtuigtypes = (ArrayList<Vliegtuigtype>) request.getAttribute("vliegtuigtypes");%>
        <h1>Overzicht van alle hotels</h1>
        <table>                  
            <% for (Vliegtuigtype vliegtuigtype : vliegtuigtypes) { %>
            <tr>            
                <td><a href="ManageServlet?hoteldetails=<%=vliegtuigtype.getId()%>"><%=vliegtuigtype.getTypenaam()%></a></td>
           
          </td>         
            </tr>
        <% } %>
         </table>
        <p><a href="index.jsp">Terug naar beginpagina</a></p>
    </body>
        
        

</html>
