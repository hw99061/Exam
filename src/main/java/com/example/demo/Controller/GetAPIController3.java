package com.example.demo.Controller;
import com.example.demo.model.SearchVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // 여기는 컨트롤러라고 알려주는 @RestController 어노테이션 사용
@RequestMapping("/ai") // 여기로 들어올 path를 지정할 @RequestMapping 어노테이션 사용 localhost:8080/ai

public class GetAPIController3 {
//    @GetMapping("/getParameters")
//    public String getParameters(@RequestParam(name = "id") String userId
//                                , @RequestParam(name = "email") String userEmail){
//        return "아이디는 "+userId+" 이메일은 "+userEmail;
@GetMapping("/getMultiParameters")
public String getMultiParameters(SearchVO searchVo) {
    return "VO사용 아이디는 "+searchVo.getId()+" 이메일은 "+searchVo.getEmail();
}

}


