package com.example.peerv2.api.member;

import com.example.peerv2.dto.user.UserDto;
import com.example.peerv2.serive.member.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/member")
@RequiredArgsConstructor
@RestController
public class Member {

    final private MemberServiceImpl memberService;

    //회원 가입
    @PostMapping
    public void insertMemeber(@RequestBody UserDto userdto) {
        memberService.insertMember(userdto);
    }

    //회원 수정
    @PutMapping
    public void fetchMember(@RequestBody UserDto userdto) {
        memberService.fetchMember(userdto);
    }

    //회원탈퇴
    @DeleteMapping
    public void deleteMember(@RequestBody UserDto userdto) {
        memberService.deleteMember(userdto);
    }

}
