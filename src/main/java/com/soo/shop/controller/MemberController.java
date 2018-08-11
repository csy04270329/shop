package com.soo.shop.controller;

import com.soo.shop.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public String list(ModelMap modelMap){
        //parameter의 modelMap은 controller를 실행해주는 handler adapter가 넣어주게
        //modelMap에 전달된 애들을 tymeleaf까지 넘겨버린다.
        modelMap.addAttribute("name","kim");
        //./resource/templates 파일에서 tymeleaf template을 찾아
        //viewName 리턴
        List<Member> list=new ArrayList<>();
        list.add(new Member(1L,"kim","kim1"));
        list.add(new Member(2L,"park","park1"));
        list.add(new Member(3L,"lee","lee1"));
        modelMap.addAttribute("list",list);
        return "list";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }

}
