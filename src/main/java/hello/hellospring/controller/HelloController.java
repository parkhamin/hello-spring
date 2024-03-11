package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//웹 어플리케이션에서 첫 번째 진입점이 바로 컨트롤러
@Controller
public class HelloController {
    @GetMapping("hello")
    //웹 어플리케이션에서 '.hello'라고 들어오면 이 메서드를 호출
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
        //컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버('viewResolver')가 화면을 찾아서 처리한다.
        //즉, resource:templates/+{ViewName}+.html
    }
}
