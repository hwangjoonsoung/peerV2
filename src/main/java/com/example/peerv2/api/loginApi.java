package com.example.peerv2.api;

import com.example.peerv2.dto.user.userDto;
import com.example.peerv2.serive.login.loginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/login")
public class loginApi {

    @Autowired
    private loginServiceImpl loginService;

    @PostMapping
    public void insertMemeber(@RequestBody userDto userdto){
        loginService.insertMember(userdto);
    }

    @GetMapping
    public void testPassword(@RequestBody Map<String,String> user_input){
        loginService.testPassword(user_input.get("user_email") ,user_input.get("user_pass"));
    }







}
