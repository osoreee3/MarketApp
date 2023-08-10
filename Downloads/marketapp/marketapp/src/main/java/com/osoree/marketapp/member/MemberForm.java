package com.osoree.marketapp.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    @NotEmpty
    private String username;

    @NotEmpty
    @Size(min = 3, max=25)
    private String nickname;

    @NotEmpty
    private String password;

    @NotEmpty
    @Email
    private String email;

}
