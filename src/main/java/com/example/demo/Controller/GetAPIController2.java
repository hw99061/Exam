package com.example.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // 여기는 컨트롤러라고 알려주는 @RestController 어노테이션 사용
@RequestMapping("/api") // 여기로 들어올 path를 지정할 @RequestMapping 어노테이션 사용 localhost:8080/api
public class GetAPIController2 {
    // GetMapping은 RequestMapping과는 다르게 메소드유형 없이 주소만 지정해주면된다.
    @GetMapping("/getParameters")  // localhost:8080/api/getParameters?id=shlee0882&email=shlee0882@gmail.com
    public String getParameters(@RequestParam String id, @RequestParam String email){
        return "아이디는 "+id+" 이메일은 "+email;
    }

}
