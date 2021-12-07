package example.app;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class EchoForm implements Serializable {

    private static final long serialVersionUID = 1115232259783191726L;

    // 1. 필수값 검사를 하기 위해 Hibernate Validator 가 제공하는 @NotEmpty 를 지정한다.
    @NotEmpty

    // 2. 최대 문자 수 검사를 하기 위해 Bean Validation 이 제공하는 @Size 를 지정한다. 최대 문자 수 (100자) 는 max 속성에 지정한다.
    @Size(max = 100)
    // 1. 입력 값을 가지고 있는 프로퍼티를 정의한다.
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}