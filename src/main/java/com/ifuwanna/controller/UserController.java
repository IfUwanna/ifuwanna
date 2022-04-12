package com.ifuwanna.controller;

import com.ifuwanna.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName    : com.ifuwanna.controller
 * fileName       : UserController
 * author         : Jihun Park
 * date           : 2022/03/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/18        Jihun Park       최초 생성
 */
@Controller
public class UserController {

    @GetMapping("user")
    @ResponseBody
    public User hello(){

        Name name = new Name("KIM","HS");
        Address addr1 = new Address("ABC", "123");
        Address addr2 = new Address("ABC", "456");
        Info info = new Info(name,new ArrayList<>(Arrays.asList(addr1,addr2)));
        Membership membership = new Membership("grade","12345");
        User user = new User(info,membership);

        return user;
    }
}
