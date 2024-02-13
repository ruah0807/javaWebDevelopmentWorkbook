<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-02-05
  Time: 오후 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>회원가입 결과</title>
</head>
<body>
<h1> 회원 목록 </h1>

<h2>
이름 : ${dto.name}<br>
아이디 :${dto.id}<br>
비밀번호 : ${dto.password}<br>
나이 : ${dto.age}<br>

성별 : <c:if test ="${dto.gender == true}">남자</c:if>
<c:if test ="${dto.gender == false}">여자</c:if><br>

취미 : <c:forEach var="hobby" items="${dto.hobbies}">
    ${hobby}
</c:forEach><br>

가고 싶은 여행지 : <c:forEach var="trip" items="${dto.travel}">
    ${trip}
</c:forEach><br><br>

자기소개 : ${dto.content}<br>
</h2>

</body>
</html>
