package com.example.peerv2.api.login;

import com.example.peerv2.dto.PayLoad;
import com.example.peerv2.dto.user.GetUserDto;
import com.example.peerv2.exceptionHandler.UserNotFoundException;
import com.example.peerv2.serive.login.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/login")
public class LoginApi {

    final private LoginServiceImpl loginService;

    //나중에 로그인 할때 로직 변경해서 사용 예정
    @GetMapping
    public void testPassword(@RequestBody Map<String, String> user_input) {
        loginService.testPassword(user_input.get("user_email"), user_input.get("user_pass"));
    }


//    @GetMapping("/findmember/{user_num}")
//    public JoinUserDto findMember(@PathVariable int user_num) {
//        JoinUserDto userDto = loginService.findMember(user_num);
//
//        if (userDto == null) {
//            throw new UserNotFoundException(String.format("해당 유저는 존재하지 않습니다.."));
//        }
//        return userDto;
//    }

    /* ResponseStatus를 이용한 방법
    @GetMapping("/findmember/{user_num}")
    public JoinUserDto findMember(@PathVariable int user_num) {
        JoinUserDto userDto = loginService.findMember(user_num);

        if (userDto == null) {
            throw new UserNotFoundException(String.format("해당 유저는 존재하지 않습니다.."));
        }
        return userDto;
    }*/

    /* ResponseStatusException을 이용한 방법
    1. 근데 httpstatus를 만드는 방법은 없을까?
    2. if문을 사용하는 것으로 상황을 계속 만들어 줘야 하는 건가?
    @GetMapping("/findmember/{user_num}")
    public ResponseEntity<JoinUserDto> findMember(@PathVariable int user_num) {
        JoinUserDto userDto = loginService.findMember(user_num);
        if(userDto == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "test");
        }
        if(userDto.getUser_age() >20){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "test2");
        }
        return ResponseEntity.ok(userDto);
    }*/


    @GetMapping("/findmember/{user_num}")
    public ResponseEntity<Object> findMember(@PathVariable int user_num) {
        GetUserDto joinUserDto = loginService.findMember(user_num);
        if (joinUserDto == null) {
            throw new UserNotFoundException(String.format("해당 유저는 존재하지 않습니다.."));
        }
        return ResponseEntity.ok(new PayLoad(joinUserDto));
    }

    @GetMapping("/findmember/all")
    public ResponseEntity<Object> findMemberAll(){
        List<GetUserDto> memberlist= loginService.findMemberAll();

        return ResponseEntity.ok(new PayLoad<>(memberlist));
    }


}
