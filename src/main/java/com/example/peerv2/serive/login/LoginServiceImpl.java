package com.example.peerv2.serive.login;

import com.example.peerv2.dto.user.GetUserDto;
import com.example.peerv2.dto.user.JoinUserDto;
import com.example.peerv2.repository.login.LoginRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginRepo loginRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void testPassword(String user_email, String user_pass) {
        JoinUserDto joinUserDto = loginRepo.getUserInfoById(user_email);

        //비밀번호 확인 로직
        Function<String, Boolean> checkingPassword = (password) -> {
            boolean result = passwordEncoder.matches(password, joinUserDto.getUser_pass());
            System.out.println("result : " + result);
            return result;
        };

        checkingPassword.apply(user_pass);
    }


    //------------------------------------------------------------------------------------------------------------------------------------
    //해당 num의 사용자 정보만 가져옴
    public GetUserDto findMember(int user_num) {
        GetUserDto checkUserDto = loginRepo.findMember(user_num);
        return checkUserDto;
    }

    public List<GetUserDto> findMemberAll() {
        List<GetUserDto> memberList = loginRepo.findMemberAll();
        return memberList;
    }


}
