package com.example.peerv2.serive.login;

import com.example.peerv2.dto.user.UserDto;
import com.example.peerv2.repository.login.LoginRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginRepo loginRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void testPassword(String user_email, String user_pass) {
        UserDto userDto = loginRepo.getUserInfoById(user_email);

        //비밀번호 확인 로직
        Function<String, Boolean> checkingPassword = (password) -> {
            boolean result = passwordEncoder.matches(password, userDto.getUser_pass());
            System.out.println("result : " + result);
            return result;
        };

        checkingPassword.apply(user_pass);
    }


//------------------------------------------------------------------------------------------------------------------------------------
    public UserDto findMember(int user_num){
        UserDto userDto= loginRepo.findMember(user_num);
        return userDto;
    }

}
