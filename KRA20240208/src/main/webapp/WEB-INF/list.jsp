<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-02-08
  Time: 오전 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container-sm">
    <div class="row">
    <div class="mt-3 mb-3 ">
        <h2 class="text-center">회원 정보</h2>
    </div>
        <div class="row">
            <form>

                <div class="mt-3 mb-3">
                    <label class="form-label"> 이  름 </label>
                    <input type="text" name="name" class="form-control" value="${dto.name}" readonly>
                </div>

                <div class="mb-3">
                    <label class="form-label"> 아이디 </label>
                    <input type="text" name="id" class="form-control" value="${dto.id}" readonly>
                </div>

                <div class="mb-3">
                    <label class="form-label"> 비밀번호 </label>
                    <input type="text" name="password" class="form-control" value="${dto.password}" readonly>
                </div>


                <div class="mb-3">
                    <label class="form-label">나  이</label>
                    <input type="text" name="age" class="form-control" value="${dto.age}" readonly>
                </div>


                <div class="mb-3">
                    <label class="form-label">성  별 : </label>
                    <c:if test="${dto.gender == true}" > 남  자 </c:if>
                    <c:if test="${dto.gender == false}" > 여  자</c:if>
                </div>

                <div class="mb-3">
                    <label class="form-label">취  미</label>
                    <c:forEach var="hobby" items="${dto.hobbies}>"> ${hobby}</c:forEach>
                </div>


                <div class="mb-3">
                    <label class="form-label">가고싶은 여행지</label>
                    <c:forEach var="trip" items="${dto.travel}">${trip}</c:forEach>
                </div>



                <div class="form-floating mb-3">
                    <textarea class="form-control" placeholder="Leave a comment here" name="content" id="floatingTextarea2" style="height: 100px" readonly></textarea>
                    <label for="floatingTextarea2"> ${dto.content} </label>
                </div>

            </form>
        </div>
    </div>


<%--    <form>--%>
<%--    <h1>회원 정보 </h1>--%>
<%--    <h2>--%>
<%--    이&nbsp;&nbsp;&nbsp;름 : ${dto.name}<br>--%>
<%--    아이디 : ${dto.id}<br>--%>
<%--    비밀번호 : ${dto.password}<br>--%>
<%--    나이 : ${dto.age}<br>--%>



<%--    하고싶은 말<br>--%>
<%--    : ${dto.content}<br>--%>

<%--    </h2>--%>
<%--</form>--%>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>