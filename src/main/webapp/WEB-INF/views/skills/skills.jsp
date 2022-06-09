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
    <section class="resume-section" id="skills and skill">
        <div class="resume-section-content">
            <h2 class="mb-5">Skills</h2>
            <div class="subheading mb-3">Programming Languages & Tools</div>
            <ul class="list-inline dev-icons">
                <li class="list-inline-item"><i class="fa-brands fa-java"></i><h6>JAVA 8+</h6></li>
                <li class="list-inline-item"><i class="fa-solid fa-check"></i></i><h6>Tests(MOCK)</h6></li>
                <li class="list-inline-item"><i class="fa-solid fa-check" id="check"></i></i><h6>Tests(Parameterized
                    test)</h6></li>
                <li class="list-inline-item"><i class="fa-solid fa-check"></i></i><h6>Tests(Junit5)</h6></li>
                <li class="list-inline-item"><i class="fa-solid fa-check"></i></i><h6>Tests(assertj)</h6></li>
                </br>
                <li class="list-inline-item"><img src="resources/assets/img/intellij.png" id="icon1"></i></i><h6>
                    IntelliJ</h6></li>
                <li class="list-inline-item"><img src="resources/assets/img/vsc.png" id="icon2"></i></i><h6>Visual
                    Studio Code</h6></li>
                </br>
                <li class="list-inline-item"><img src="resources/assets/img/spring.png"></i></i><h6>Spring Boot</h6>
                </li>
                </br>
                <li class="list-inline-item"><img src="resources/assets/img/mySQL.png"></i></i><h6>MySQL</h6></li>
                </br>
                <li class="list-inline-item"><img src="resources/assets/img/git.png"></i></i><h6>GIT</h6></li>
                <br>
                <li class="list-inline-item"><i class="fab fa-html5"></i><h6>HTML5</h6></li>
                <li class="list-inline-item"><i class="fab fa-css3-alt"></i><h6>CSS</h6></li>
                <li class="list-inline-item"><i class="fab fa-js-square"></i><h6>JS</h6></li>
                <li class="list-inline-item"><i class="fab fa-angular"></i><h6>Angular</h6></li>
                <li class="list-inline-item"><i class="fab fa-node-js"></i><h6>node</h6></li>

            </ul>


            <div class="subheading mb-3">Skills</div>
            <ul class="fa-ul mb-0">
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    Obsługa programu Postman
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    Obsługa programu Brackets
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    Design Patterns
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    SOLID
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    FIRST
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    CLEAN CODE
                </li>
                <li>
                    <span class="fa-li"><i class="fas fa-check"></i></span>
                    Język angielski - średniozaawansowny
                </li>


                <c:forEach items="${talents}" var="title">

                <li>
                        ${title.talents}
                    <span class="fa-li"><i class="fas fa-check"></i></span>

                </li>
            </ul>
            <security:authorize access="hasRole('ROLE_ADMIN')">
                <a href="/editSkill/${title.id}">
                    <input class="btn btn-success pull-left" type="submit" value="Edit"
                               id="searchButton"></input>
                    </a>
                    <form method="post" action='<c:url value="/deleteSkill/${title.id}"/>'>
                        <input class="btn btn-success pull-left" type="submit" value="Delete"
                               id="searchButton2"></input>
                    </form>
                </security:authorize>
            </c:forEach>
            <br>
            <security:authorize access="hasRole('ROLE_ADMIN')">
                <a href="addSkill"/>
                <input class="btn btn-success pull-left" type="submit" value="Add new Skill" id="searchButton1"></input>
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
