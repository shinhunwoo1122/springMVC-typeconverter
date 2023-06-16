package hello.typeconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/converterTest")
    public String converterTest(){
        return "OK";
    }

}
