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
    <!-- Experience-->
    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Selected professional experience</h2>
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <div class="flex-shrink-0"><span class="text-primary"> 1.03.2019 - 1.03.2020 </span></div>

                    <h3 class="mb-0">Specjalista ds. Transportu</h3>
                    <div class="subheading mb-3">Praca biurowa w firmie CORRECT</div>
                    <p>Sprawdzanie faktur, wystawanie dokumentów dla kierowców oraz działu celnego. Wysyłanie dokumentów
                        do działu księgowości oraz kontakt ze współpracującymi działami. Telefoniczna obsługa kierowców
                        oraz podległych firm powierzonych. Obsługa MS OFFICE. </p>

                    <div class="flex-shrink-0"><span class="text-primary"> 1.12.2018 - 28.02.2019 </span></div>

                    <h3 class="mb-0">Stanowisko Specjalista ds. Exportu</h3>
                    <div class="subheading mb-3">Praca biurowa COM40/CORRECT</div>
                    <p>Wystawianie dokumentów dla samochodów kursujących na Białoruś. Tworzenie i obsługa zamówień,
                        wystawianie i drukowanie faktur; MS OFFICE (głównie EXCEL i WORD) – tworzenie od podstaw
                        faktury, używanie formuł w EXCEL. Kontaktowanie się z innymi działami w firmie oraz na Białorusi
                        w sprawach zamówień pod wysyłkę.</p>


                    <c:forEach items="${experience}" var="title">
                                <div class="flex-shrink-0"><span class="text-primary">${title.dateStart} - ${title.dateEnd}</span></div>

                                <h3 class="mb-0">${title.nameOfTheJob}</h3>
                            <div class="subheading mb-3">${title.mainTask}</div>
                            <p>${title.description}</p>

                                <security:authorize access="hasRole('ROLE_ADMIN')">
                                    <a href="/editExperience/${title.id}">
                                        <input class="btn btn-success pull-left" type="submit" value="Edit"
                                               id="searchButton"></input>
                                    </a>
                                    <form method="post" action='<c:url value="/deleteExperience/${title.id}"/>'>
                                        <input class="btn btn-success pull-left" type="submit" value="Delete"
                                               id="searchButton2"></input>
                                    </form>
                                </security:authorize>
                            </c:forEach>
                        </div>
                    </div>
                    <security:authorize access="hasRole('ROLE_ADMIN')">
                        <a href="addExperience"/>
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
