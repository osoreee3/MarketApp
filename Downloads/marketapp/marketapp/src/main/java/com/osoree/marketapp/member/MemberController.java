package com.osoree.marketapp.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/login")
    public String login(){
        return "member/login";
    }
    @GetMapping("/join")
    public String showJoin(MemberForm memberForm){
        return "member/join";
    }

    @PostMapping("/join")
    public String join(@Valid MemberForm memberForm){
        memberService.join(memberForm.getUsername(), memberForm.getNickname(),memberForm.getPassword(), memberForm.getEmail());
        return "redirect:/member/login";
    }
}
