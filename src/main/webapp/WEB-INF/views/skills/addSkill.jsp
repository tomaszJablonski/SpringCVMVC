<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <form method="post" action="/addSkill">

        <section class="resume-section" id="skill">
            <div class="resume-section-content">
                <h2 class="mb-5">Add Skill</h2>
                <!-- Begin Page Content -->
                <div class="container-fluid">


                    <!-- Content Row -->
                    <div class="row">
                        <div class="col-xl-12 col-md-12 mb-12">
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <div class="form-group row">
                                        <label for="start" class="col-2 col-form-label">addSkill</label>
                                        <div class="col-10">
                                <textarea class="form-control" rows="5" id="start" name="talents"
                                          placeholder="write here about your interests ..."></textarea>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </section>
        <input class="btn btn-success pull-left" type="submit" value="Save" id="searchButton1"></input>
    </form>
</div>


<hr class="m-0"/>

<%@include file="../dynamic/socialActions.jspf" %>

<!-- Bootstrap core JS-->
<%@include file="../dynamic/js.jspf" %>
</body>
</html>
