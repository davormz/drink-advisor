<!DOCTYPE html>
<!-- This is a JSP Import -->
<%@ page import="java.util.*" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recomendations</title>
    <link rel="stylesheet" href="/styles/main.css"/>
</head>
<body>
    <jsp:include page="header.jsp" />
    <section class="content">
        <div class="panel">
            <h2 class="panel__title">Recomendations</h2>
    
            <!-- This is a JSP Scriptlet -->
            <%
                List<String> brands = (List) request.getAttribute("brands");
                for(String brand : brands){
                    out.println("<br>Try: <strong>" + brand + "</strong>");
                } 
            %>
            <p class="panel__nav">
                <a class="button" role="button" href="#">Go back</a>
            </p>
        </div>
    </section>
    <jsp:include page="footer.jsp" />
</body>
</html>