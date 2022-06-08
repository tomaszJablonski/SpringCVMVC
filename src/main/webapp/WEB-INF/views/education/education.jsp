<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="color" uri="http://www.springframework.org/tags/form" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="security" %>


<!DOCTYPE html>
<html lang="en">
<%@include file="../dynamic/head.jspf" %>
<a id="page-top">
    <!-- Navigation-->
    <%@include file="../dynamic/navigation.jspf" %>
    <!-- Page Content-->
    <div class="container-fluid p-0">
        <!-- Education-->
        <section class="resume-section" id="education">
            <div class="resume-section-content">
                <h2 class="mb-5">Education</h2>
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">


                    <div class="flex-grow-1">
                        <c:forEach items="${education}" var="title">
                            <div class="flex-shrink-0"><span class="text-primary"
                                                             type="date">${title.dateStart} - ${title.dateEnd}</span>
                            </div>

                            <h3 class="mb-0">${title.schoolName}</h3>
                            <div class="subheading mb-3">${title.fieldOfStudy}</div>
                            <div>${title.description}</div>

                            <br>
                            <security:authorize access="hasRole('ROLE_ADMIN')">
                                <a href="/editEducation/${title.id}">
                                    <input class="btn btn-success pull-left" type="submit" value="Edit"
                                           id="searchButton"></input>
                                </a>
                                <br>
                                <form method="post" action='<c:url value="/deleteEducation/${title.id}"/>'>
                                <input class="btn btn-success pull-left" type="submit" value="Delete"
                                       id="searchButton2"></input>
                            </security:authorize>
                            </form>
                        </c:forEach>
                    </div>
                </div>

                <security:authorize access="hasRole('ROLE_ADMIN')">
                <a href="addEducation"/>
                <input class="btn btn-success pull-left" type="submit" value="Dodaj nową pozycję"
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
