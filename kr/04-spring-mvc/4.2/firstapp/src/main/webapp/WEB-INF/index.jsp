<html>
<body>
    <h2>Hello World!</h2>

    <!--
    1. 에코 애플리케이션의 입력 화면을 표시하기 위한 요청(GET /echo) 을 전송하는 링크를 추가한다.
    여기서는 JSTL (JSP Standard Tag Library) 의 <c:url> 요소를 사용해 '애플리케이션 컨텍스트 경로' + '/echo' 의 링크를 추가한다.
    -->
    <ul>
        <li><a href="<c:url value='/echo' />">에코 애플리케이션으로 이동</a></li>
    </ul>
</body>
</html>
