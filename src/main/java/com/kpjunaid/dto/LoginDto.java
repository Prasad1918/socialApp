package com.kpjunaid.dto;

import com.kpjunaid.annotation.ValidEmail;
import com.kpjunaid.annotation.ValidPassword;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    int jk = 908;
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;

    private int i= 123;
}
