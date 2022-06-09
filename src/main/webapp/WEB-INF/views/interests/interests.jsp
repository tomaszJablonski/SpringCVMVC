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

    <!-- Interests-->
    <section class="resume-section" id="interests">
        <div class="resume-section-content">
            <h2 class="mb-5">Interests</h2>
            <p>Learning English</p>
            <p>Reading books and magazine about IT</p>
            <p>Learning for better programming </p>
            <p>Codewars</p>

            <c:forEach items="${interests}" var="title">
                        <p>${title.description}</p>

                        <security:authorize access="hasRole('ROLE_ADMIN')">
                            <a href="/editInterestsDescription/${title.id}">
                                <input class="btn btn-success pull-left" type="submit" value="Edit"
                                       id="searchButton"></input>
                            </a>
                            <form method="post" action='<c:url value="/deleteInterests/${title.id}"/>'>
                                <input class="btn btn-success pull-left" type="submit" value="Delete"
                                       id="searchButton2"></input>
                            </form>
                        </security:authorize>
                    </c:forEach>
                    <br>
                    <security:authorize access="hasRole('ROLE_ADMIN')">
                        <a href="addInterestsDescription"/>
                        <input class="btn btn-success pull-left" type="submit" value="Add Description"
                               id="searchButton1"></input>
                        </a>
                    </security:authorize>
                </div>
            </section>

</div>

<hr class="m-0"/>
<%@include file="../dynamic/socialActions.jspf" %>

<!-- Bootstrap core JS-->
<%@include file="../dynamic/js.jspf" %>
</body>
</html>
