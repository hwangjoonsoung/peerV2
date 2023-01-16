package com.example.peerv2.serive.member;

import com.example.peerv2.dto.user.UserDto;
import com.example.peerv2.repository.member.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepo memberrepo;
    private final PasswordEncoder passwordEncoder;


    public void insertMember(UserDto userdto) {
        String password = userdto.getUser_pass();

        //비밀번호 암호화
        Consumer<String> encodingPassword = (passwordInput) -> {
            String encode = passwordEncoder.encode(passwordInput);
            userdto.setUser_pass(encode);
        };

        encodingPassword.accept(password);
        memberrepo.insertMember(userdto);
    }

    @Override
    public void fetchMember(UserDto userdto) {

        //비밀번호 암호화
        Consumer<String> encodingPassword = (passwordInput) -> {
            String encode = passwordEncoder.encode(passwordInput);
            userdto.setUser_pass(encode);
        };

        encodingPassword.accept(userdto.getUser_pass());
        memberrepo.fetchMember(userdto);

    }

    @Override
    public void deleteMember(UserDto userDto) {

        memberrepo.deleteMember(userDto);

    }
}
