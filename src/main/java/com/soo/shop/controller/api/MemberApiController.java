package com.soo.shop.controller.api;

import com.soo.shop.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller /// @ResponseBody가 안붙었을 경우에 메소드가 리턴한 값는 view name이다.
//@ResponseBody   ///컨트롤러 메소드가 리턴하는 값이 응답 바디로 전달한다.
@RestController  ///view가 아니라 data를 return 한다.
@RequestMapping("/api/members")
public class MemberApiController {

    @GetMapping("/member1")
    public String member1(){
        return "member1";
    }

    //messageconvertor에 의해 dto-->문자열로 바뀌어서 바디에 담겨 출력된다.
    @GetMapping("/member2")
    public Member member2(){
        Member member=new Member(1L,"kim","test1@test.com");
        return member;
    }

    //파라미터는 무조건 string이지만 얘를 spring이 id의 type인 Long으로 바꿔줌
    @GetMapping("/member3")
    public Member member3(@RequestParam(name = "name",required = true)String name,
                          @RequestParam(name = "id",required = false,defaultValue = "1")Long id){
        Member member=new Member(id,name,"");
        return member;
    }

    //@ModelAttribute 를 사용하면 이름과 같은 프로퍼티에 값이 설정된다. 파라미터 이름과 모델에 있는 프로퍼티값이 일치해야한다 필드값이 아니다
    //예를들어 파라미터로 name들어오면 setName이런식의 함수 자동호출
    @GetMapping("/member4")
    public Member member4(@ModelAttribute Member member){
        return member;
    }

    @PostMapping("/member5")
    public String member5(){
        return "member5";
    }

    //query parameter는 header에 담아 보낸다 body에 보내고싶으면? 얘를 객체로변환시키는게 좋겠지
    @PostMapping("/member6")
    public Member member6(@RequestParam(name = "name",required = true)String name,
                          @RequestParam(name = "id",required = false,defaultValue = "1")Long id){
        Member member=new Member(id,name,"");
        return member;
    }

    //client단에서 body에 member담아서 보내줘야한다, json->객체,
    //Content-Type ->application/json
    @PostMapping("/member7")
    public Member member7(@RequestBody Member member){
        return member;
    }

    @GetMapping("/member8")
    public String member8(@PathVariable(name = "id")String id){
        return id;
    }

}
