package com.osoree.marketapp.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member join(String username, String nickname, String password, String email ){
        Member m = new Member();
        m.setUsername(username);
        m.setNickname(nickname);
        m.setPassword(passwordEncoder.encode(password));
        m.setEmail(email);
        m.setCreateDate(LocalDateTime.now());
        this.memberRepository.save(m);
        return m;
    }
}
