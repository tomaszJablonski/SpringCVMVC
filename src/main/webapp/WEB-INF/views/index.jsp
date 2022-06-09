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
                        telephone number:500-380-413
                        <a target="_parent" href="mailto:tjablonski1990@gmail.com">tjablonski1990@gmail.com</a>
                    </div>
                    <p class="lead mb-5">
                    <div class="indexDesc">
                        Hello everybody, my name is Tomasz Jabłoński and thank you for your interest in my Portfolio. My
                        dream is become a java programmer so I made this website to show you my work.
                    </div>

                    <div class="indexDesc">
                        I work with SpringBoot WEB with MVC and Security in Intellij IDE.
                    </div>

                    <div class="indexDesc">
                        All data is saved in the MySQL database . As an admin you can add, edit and delete data from the
                        database and as a user you can only to watch the page.
                    </div>

                    <div class="indexDesc">
                        I hope you enjoy my work, and feel free to contact me if you wish to begin a cooperation.
                    </div>


                    <div class="indexDesc">
                        Have a good day :)
                    </div>
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
