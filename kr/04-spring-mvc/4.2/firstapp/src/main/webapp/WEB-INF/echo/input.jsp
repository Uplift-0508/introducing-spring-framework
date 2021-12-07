<html>
<body>
    <h2>입력 화면</h2>

    <!--
    1.2. 스프링 MVC 에서 제공되는 <form:form> 을 사용해 HTML 폼을 작성한다.
    modelAttribute 속성에 폼 객체의 속성을 지정한다.
    그러면 해당 객체의 속성 값을 HTML 폼의 값으로 표시할 수 있다.
    여기서는 EchoController 의 viewInput 메서드 안에서 모델에 추가한 'echoForm' 을 지정한다.
    -->
    <form:form modelAttribute="echoForm">
        <div>텍스트를 입력해 주세요:</div>
        <div>
            <!--
            3.4. 스프링 MVC 에서 제공되는 <form:input> 을 사용해 텍스트 필드를 작성한다.
            path 속성에 modelAttribute 속성에서 지정한 객체 프로퍼티명을 지정한다.
            이 속성에 지정한 프로퍼티가 저장하는 값이 텍스트 필드의 초깃값으로 표시된다.
            여기서는 text 프로퍼티를 지정한다.
            -->
            <form:input path="text" />

            <!--
            1.2. 스프링 MVC 에서 제공되는 <form:errors> 요소를 사용해 오류 정보를 출력하는 HTML 을 출력한다.
            path 속성에 modelAttribute 속성으로 지정된 객체의 프로퍼티명을 지정한다. 티
            그러면 해당 속성에 지정한 프로퍼티의 에러 정보가 표시되는데 이 예에서는 text 프로퍼티를 지정했다.
            -->
            <form:errors path="text" />
        </div>
        <div>

            <!--
            5. 스프링 MVC 에서 제공되는 <form:button> 요소를 사용해 HTML 폼의 전송 버튼을 만든다.
            -->
            <form:button>전송</form:button>
        </div>
    </form:form>
</body>
</html>