<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="security" %>


<!DOCTYPE html>
<html lang="en">
<%@include file="../dynamic/head.jspf" %>
<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigation.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">

            <!-- Skills-->
            <section class="resume-section" id="skills and workflow">
                <div class="resume-section-content">
                    <h2 class="mb-5">Skills</h2>
                    <div class="subheading mb-3">Programming Languages & Tools</div>
                    <ul class="list-inline dev-icons">

                        <li class="list-inline-item"><i class="fab fa-html5" type="radio" class="icon" ></i></li>
                        <li class="list-inline-item"><i class="fab fa-css3-alt" type="radio" class="icon" ></i></li>
                        <li class="list-inline-item"><i class="fab fa-js-square" type="radio" class="icon" ></i></li>
                        <li class="list-inline-item"><i class="fab fa-angular"></i></li>
                        <li class="list-inline-item"><i class="fab fa-react"></i></li>
                        <li class="list-inline-item"><i class="fab fa-node-js"></i></li>
                        <li class="list-inline-item"><i class="fab fa-sass"></i></li>
                        <li class="list-inline-item"><i class="fab fa-less"></i></li>
                        <li class="list-inline-item"><i class="fab fa-wordpress"></i></li>
                        <li class="list-inline-item"><i class="fab fa-gulp"></i></li>
                        <li class="list-inline-item"><i class="fab fa-grunt"></i></li>
                        <li class="list-inline-item"><i class="fab fa-npm"></i></li>
                    </ul>


                    <div class="subheading mb-3">Workflow</div>
                    <c:forEach items="${workflow}" var="title">
                    <ul class="fa-ul mb-0">
                        <li>
                                ${title.abilities}
                            <span class="fa-li"><i class="fas fa-check"></i></span>

                        </li>
                    </ul>
                        <security:authorize access="hasRole('ROLE_ADMIN')">
                            <a href="/editWorkflow/${title.id}">
                                <input class="btn btn-success pull-left" type="submit" value="Edit"
                                       id="searchButton"></input>
                            </a>
                            <form method="post" action='<c:url value="/deleteWorkflow/${title.id}"/>'>
                                <input class="btn btn-success pull-left" type="submit" value="Delete"
                                       id="searchButton2"></input>
                            </form>
                        </security:authorize>
                    </c:forEach>
                </div>
            </section>
    <security:authorize access="hasRole('ROLE_ADMIN')">
        <a href="addWorkflow"/>
        <input class="btn btn-success pull-left" type="submit" value="Add new WorkFlow" id="searchButton1"></input>
        </a>
    </security:authorize>
        </div>
            <hr class="m-0" />
            <%@include file="../dynamic/socialActions.jspf" %>
        <!-- Bootstrap core JS-->
            <%@include file="../dynamic/js.jspf"%>
    </body>
</html>
