package com.example.peerv2.serive.login;

import com.example.peerv2.dto.user.userDto;
import com.example.peerv2.repository.login.loginRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class loginServiceImpl implements loginService {

    private final loginRepo loginRepo;
    private final PasswordEncoder passwordEncoder;

    public void insertMember(userDto userdto) {
        String password = userdto.getUser_pass();

        //비밀번호 암호화
        Consumer<String> encodingPassword = (passwordInput) -> {
            String encode = passwordEncoder.encode(passwordInput);
            userdto.setUser_pass(encode);
        };

        encodingPassword.accept(password);
        loginRepo.insertMember(userdto);
    }

    @Override
    public void testPassword(String user_email, String user_pass) {
        userDto userDto = loginRepo.getUserInfoById(user_email);

        //비밀번호 확인 로직
        Function<String, Boolean> checkingPassword = (password) -> {
            boolean result = passwordEncoder.matches(password, userDto.getUser_pass());
            System.out.println("result : " + result);
            return result;
        };

        checkingPassword.apply(user_pass);
    }
}
