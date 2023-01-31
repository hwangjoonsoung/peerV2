package com.example.peerv2.api.member;

import com.example.peerv2.dto.user.JoinUserDto;
import com.example.peerv2.serive.member.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/v1/member")
@RequiredArgsConstructor
@RestController
public class Member {

    final private MemberServiceImpl memberService;

    //회원 가입
    @PostMapping
    public void insertMemeber(@Valid @RequestBody JoinUserDto userdto) {
        memberService.insertMember(userdto);
    }

    //회원 수정
    @PutMapping
    public void fetchMember(@RequestBody JoinUserDto userdto) {
        memberService.fetchMember(userdto);
    }

    //회원 탈퇴
    @DeleteMapping
    public void deleteMember(@RequestBody JoinUserDto userdto) {
        memberService.deleteMember(userdto);
    }

}
