package example.app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

// 1. 클래스 애너테이션에 @RequestMapping 을 지정한다.
// value 속성에 'echo' 를 지정하면 '/echo' 라는 경로에 대한 요청이 이 컨트롤러에 매핑된다.
@RequestMapping("echo")
public class EchoController {

    // 2. 입력 화면 표시 요청을 처리하는 메서드를 추가하고 메서드 애너테이션으로 @RequestMapping 을 지정한다.
    // method 속성에 RequestMethod.GET 을 지정하면 'GET /echo' 라는 요청이 이 메서드에 매핑된다.
    @RequestMapping(method = RequestMethod.GET)
    public String viewInput(Model model) {
        EchoForm form = new EchoForm();

        // 3. 폼 객체 (EchoForm 클래스의 인스턴스)를 생성하고 모델에 추가한다.
        // 모델에 추가할 때에 속성명을 생략하면 클래스명을 이용해 'echoForm' 이라는 속성명으로 추가된다.
        // 모델에 추가한 객체는 HttpServletRequest 에 익스포트(export) 되는 구조이므로
        // JSP 에서는 요청 스코프상에 있는 객체로서 참조할 수 있다.
        model.addAttribute(form);

        // 4. 입력 화면을 표시하는 JSP 의 뷰 이름을 반환한다.
        // 여기서는 뷰 이름으로 'echo/input' 을 반환하고 있어 src/main/webapp/WEB-INF/echo/input.jsp 가 호출된다.
        return "echo/input";
    }

    // 1. 입력값 전송 요청을 처리하는 메서드를 추가하고 메서드 애너테이션으로 @RequestMapping 을 지정한다.
    // method 속성에 RequestMethod.POST 를 지정함으로써 'POST /echo' 라는 요청이 이 메서드에 매핑된다.
    @RequestMapping(method = RequestMethod.POST)

    // 2. 메서드 매개변수에 폼 클래스를 지정한다.
    // 메서드 매개변수에 폼클래스를 지정하면 입력 화면에서 입력한 값 (요청 파라미터 값) 을 폼 객체에 저장해서 받을 수 있다.
    // 또한 인수에서 받은 폼 객체는 모델에도 자동으로 추가되는 구조이므로 명시적으로 모델에 추가할 필요는 없다.
    // 1. 폼 클래스 인수에 @Valid 를 지정한다.
    // @Valid 를 지정하면 프론트 컨트롤러는 폼 클래스의 입력값 검사를 하고 검사 결과를 BindingResult 에 저장한다.
    // 2. 메서드 매개변수에 BindingResult 를 지정해서 폼 클래스의 입력값 검사 결과를 받는다.
    // BindingResult 타입의 파라미터 위치는 필수 입력값을 검사하는 폼 클래스 타입의 파라미터 바로 다음에 위치해야 한다.
    // 인수로 받은 BindingResult 객체는 모델에도 자동으로 추가되는 구조이므로 명시적으로 모델에 추가할 필요는 없다.
    public String echo(@Valid EchoForm form, BindingResult result) {

        // 3. BindingResult 의 hasErrors 메서드를 호출해 입력값 검사에서 오류가 발생하는지 판단한다.
        if (result.hasErrors()) {

            // 4. 입력값 검사 오류가 발생하는 경우 입력값 검사 오류 정보를 표시하는 JSP 의 뷰 이름을 반환한다.
            // 여기서는 뷰 이름으로 'echo/input' (입력 화면의 뷰 이름)을 반환하고 있어서
            // src/main/webapp/WEB-INF/echo/input.jsp 가 호출된다.
            return "echo/input";
        }

        // 3. 출력 화면을 표시하는 JSP 의 뷰 이름을 반환한다.
        // 여기서는 뷰 이름으로 'echo/output' 을 반환하고 src/main/webapp/WEB-INF/echo/output.jsp 가 호출된다.
        return "echo/output";
    }

}