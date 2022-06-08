<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/head.jspf"%>
<body class="bg-gradient-primary">
<div class="container">
  <!-- Outer Row -->
  <div class="row justify-content-center">
    <div class="col-xl-10 col-lg-12 col-md-9">
      <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
          <!-- Nested Row within Card Body -->
          <div class="row">
            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
            <div class="col-lg-6">
              <div class="p-5">
                <div class="text-center">
                  <h1 class="h4 text-gray-900 mb-4">Witaj na stronie mojego CV!</h1>
                </div>
                <form class="user" method="post" action='<c:url value="/login"/>'>
                  <div class="form-group">
                    <input type="text" class="form-control form-control-user" id="exampleInputEmail"
                           aria-describedby="emailHelp" name="username" placeholder="enter your username...">
                  </div>
                  <div class="form-group">
                      <input type="password" class="form-control form-control-user" name="password"
                             id="exampleInputPassword" placeholder="enter your password...">
                  </div>
                    <div class="form-group">
                        <div class="custom-control custom-checkbox small">
                            <input type="checkbox" class="custom-control-input" id="customCheck">
                            <label class="custom-control-label" for="customCheck">Remember me</label>
                        </div>
                    </div>
                    <input type="submit" value="Login" class="btn btn-primary btn-user btn-block">
                    <div class="form-group">
                        <div class="custom-control custom-checkbox small">
                            <h6>Legend</h6>
                            <div class="passes" id="passes">
                                <h10>If you want login as admin: </br> Login:admin Password:admin</h10>
                                <h10></br>If you want login as user: </br> Login:user Password:user</h10>
                            </div>
                        </div>
                    </div>


                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<%@include file="../dynamic/js.jspf" %>
</body>
</html>