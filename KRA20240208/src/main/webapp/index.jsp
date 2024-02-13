<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>정보 입력</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>


<div class="container-md justify-content-center">

    <h2 class="mt-3 text-center">회원가입</h2>

    <div class="row">
        <form action="/list" method="post">

            <div class="mt-3 mb-3">
                <label class="form-label"> 이  름 </label>
                <input type="text" name="name" class="form-control" placeholder="이름을 입력해 주세요">
            </div>

            <div class="mb-3">
                <label class="form-label"> 아이디 </label>
                <input type="text" name="id" class="form-control" placeholder="사용하실 아이디를 입력해주세요">
            </div>

            <div class="mb-3">
                <label class="form-label"> 비밀번호 </label>
                <input type="text" name="password" class="form-control" placeholder="사용하실 비밀번호를 입력해주세요">
            </div>


            <div class="mb-4">
                <label class="form-label">나  이</label>
                <input type="text" name="age" class="form-control" placeholder="나이를 입력하세요">
            </div>

            <div class="mb-4">
                <div>성별을 체크하세요</div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="true">
                    <label class="form-check-label" for="true">
                        남자
                    </label>
                </div>
                <div>
                    <input class="form-check-input" type="radio" name="gender" id="false">
                    <label class="form-check-label" for="false">
                        여자
                    </label>
                </div>
            </div>


            <div class="mb-4">
                <div> 취미를 체크하세요 </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="hobbies" value="술먹기" id="술먹기">
                    <label class="form-check-label" for="술먹기">술먹기</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="hobbies" value="잠자기" id="잠자기">
                    <label class="form-check-label" for="잠자기">잠자기</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="hobbies" value="공부하기" id="공부하기">
                    <label class="form-check-label" for="공부하기">공부하기</label>
                </div>
            </div>


            <div class="mb-4">
                가고싶은 여행지
                <select class="form-select form-select-sm mb-3" aria-label=".form-select-lg example">
                    <option selected>가고 싶은 여행지를 선택하세요</option>
                    <option value="1">괌</option>
                    <option value="2">다낭</option>
                    <option value="3">나트랑</option>
                    <option value="3">코타키나발루</option>
                    <option value="3">대만</option>
                </select>
            </div>

            <div class="form-floating mb-4">
                <textarea class="form-control" placeholder="Leave a comment here" name="content" id="floatingTextarea2" style="height: 100px"></textarea>
                <label for="floatingTextarea2"> 자기소개를 적어주세요 </label>
            </div>

            <div class="float-end mb-3">
                <button  class="btn btn-dark btn-md" type="submit">회원가입</button>
                <button class="btn btn-outline-dark btn-md" type="reset">다시쓰기</button>
            </div>
        </form>
    </div>
</div>


<%--<form action="/list" method="post">--%>
<%--    이&nbsp;&nbsp;&nbsp;름 : <input type="text" name="name" size="15"><br>--%>
<%--    아이디 : <input type="text" name="id" size="15"><br>--%>
<%--    비밀번호 : <input type="password" name="password"><br>--%>
<%--    나이 : <input type="text" name="age"><br>--%>

<%--    성별 : <input type="radio" name="gender" value="true">남자--%>
<%--    <input type="radio" name="gender" value="false">여자<br>--%>
<%--    취미 : <input type="checkbox" name="hobbies" value="술먹기">술먹기--%>
<%--    <input type="checkbox" name="hobbies" value="잠자기">잠자기--%>
<%--    <input type="checkbox" name="hobbies" value="공부하기">공부하기<br>--%>


<%--    가고 싶은 여행지는?--%>
<%--    <select name="travel">--%>
<%--        <option>괌</option>--%>
<%--        <option>다낭</option>--%>
<%--        <option>나트랑</option>--%>
<%--        <option>코나키나발루</option>--%>
<%--        <option>대만</option>--%>
<%--    </select><br><br>--%>

<%--    <textarea rows="10" cols="50" name="content"></textarea><br>--%>

<%--    <button type="submit">회원가입</button>--%>
<%--    <button type="reset">다시쓰기</button>--%>
<%--</form>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>