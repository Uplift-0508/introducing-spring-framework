<html>
<body>
    <h2>출력 화면</h2>
    <!--
    1. 폼 객체에 저장된 입력값을 텍스트에 표시한다.
    여기서는 JSTL 의 <c:out> 요소를 사용해 EchoForm 의 text 속성값을 HTML 로 출력하고 있다.
    -->
    <div>
        입력한 텍스트는 '<span><c:out value="${echoForm.text}" /></span>' 입니다.
    </div>
    <br>
    <!--
    2. 최상위 페이지를 표시하기 위한 요청(GET /) 을 전송하는 링크를 추가한다.
    -->
    <div>
        <a href="<c:url value='/' />">최상위 페이지로 이동</a>
    </div>
</body>
</html>