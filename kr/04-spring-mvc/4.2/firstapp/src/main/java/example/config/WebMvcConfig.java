package example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// 1. DispatcherServlet 용 설정 클래스를 작성한다.
@Configuration

// 2. 클래스에 @EnableWebMvc 를 지정한다.
// @EnableWebMvc 를 지정하면 스프링 MVC 가 제공하는 설정 클래스가 임포트되어 스프링 MVC 를 이용할 때 필요한 컴포넌트의 빈 정의가 자동으로 이뤄진다.
@EnableWebMvc

// 3. 클래스에 @ComponentScan 을 지정한다.
// @ComponentScan 을 지정하면 value 속성에 명시된 패키지 아래로 스테레오 타입(Stereotype) 애너테이션 (@Component 나 @Controller 등) 이
// 부여된 클래스가 스캔되어 애플리케이션 컨텍스트에 빈으로 등록된다.
@ComponentScan("example.app")

// 4. 부모 클래스로 WebMvcConfigurerAdapter 클래스를 지정한다.
// WebMvcConfigurerAdapter 클래스를 상속하면 기본적으로 적용된 빈 정의를 간단히 커스터마이징할 수 있다.
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    // 1. configureViewResolvers 메서드를 오버라이드 한다.
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        // 2. ViewResolverRegistry 클래스의 jsp 메서드를 호출해서 JSP 용 ViewResolver 를 설정한다.
        registry.jsp();
    }

    // 3. 위와 같이 빈을 정의하면 /WEB-INF 디렉터리 바로 아래에 저장된 JSP 파일이 뷰로 취급된다.

}
