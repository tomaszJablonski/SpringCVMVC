<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html lang="en">

<%@include file="dynamic/head.jspf" %>

    <body id="page-top">
        <!-- Navigation-->
        <%@include file="dynamic/navigation.jspf" %>
        <!-- Page Content-->
        <div class="container-fluid p-0">
            <!-- About-->
            <section class="resume-section" id="about">
                <div class="resume-section-content">
                    <h1 class="mb-0">
                        Tomasz
                        <span class="text-primary">Jabłoński</span>
                    </h1>
                    <div class="subheading mb-5">
                        telephone number:111-111-111
                        <a href="mailto:name@email.com">tjablonski1990@email.com</a>
                    </div>
                    <p class="lead mb-5">
                        Welcome in my CV. I am future programmer. Add texts ...

                    </p>

                    <%@include file="dynamic/socialActions.jspf" %>
                </div>

            </section>
            <hr class="m-0" />
        </div>
        <!-- Bootstrap core JS-->
        <%@include file="dynamic/js.jspf"%>
    </body>
</html>
