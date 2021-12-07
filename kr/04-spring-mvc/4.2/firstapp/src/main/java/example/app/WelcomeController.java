package example.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 1. 컨트롤러 클래스에 @Controller 애너테이션을 지정한다.
@Controller
public class WelcomeController {

    // 2. 최상위 페이지 표시 요청을 처리하는 메서드를 추가하고 메서드 애너테이션으로서 @RequestMapping 을 지정한다.
    // value 속성에 '/' 를 지정해 '/' 경로에 대한 요청이 이 메서드에 매핑되게 만든다.
    @RequestMapping("/")
    public String home() {

        // 3. 최상위 페이지를 표시하는 JSP 의 뷰 이름을 반환한다.
        // 여기서는 뷰 이름으로 'index' 를 반환하고 있어 src/main/webapp/WEB-INF/index.jsp 가 호출된다.
        return "index";
    }

}