package com.bit.blog55.controller.api;

import com.bit.blog55.dto.ResponseDto;
import com.bit.blog55.model.RoleType;
import com.bit.blog55.model.User;
import com.bit.blog55.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserApiController { // user.js의 ajax에서 url: "/api.user", 이게 호출되어서 만드는 것.

    @Autowired
    private UserService userService;

//    @Autowired
//    private AuthenticationManager authenticationManager;


//    @PostMapping("api/user")
//    public int save(@RequestBody User user){
//        System.out.println("UserApiController:save 호출됨");
//        return 1;
//    }

    //48강에서 주석처리함. 시큐리티에서는 이 방법 안 쓴다고
        @PostMapping("/blog/api/user/login")
    public ResponseDto<Integer> login(@RequestBody User user, HttpSession session) {
      System.out.println("UserApiController : login 호출됨");
        User principal=userService.로그인(user); //principal접근주체
        if(principal!=null) {
		session.setAttribute("principal", principal); // header.jsp에 jstl문법 부분에 연결 되는 것.
	}
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바 오브젝트를 JSON으로 변환하여 전송 (JACKSON)
    }


   //  Json 데이터를 받으려면 @RequestBody로 받아야함
    // 회원가입
    @PostMapping("/blog/api/user")
    public ResponseDto<Integer> save1(@RequestBody User user) {
        System.out.println("UserApiController : save 호출됨");
        user.setRole(RoleType.USER);
        userService.회원가입(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 자바 오브젝트를 JSON으로 변환하여 전송 (JACKSON)
    }
//
//    @PutMapping("/user")
//    public ResponseDto<Integer> update(@RequestBody User user) {
//
//        userService.회원수정(user);
//        // 여기서는 트랜잭션이 종료되기 때문에 DB값은 변경이 됐음
//        // 하지만 세션값은 변경되지 않은 상태이기 때문에 직접 세션 값을 변경해줘야함.
//        // 한마디로 DB는 회원수정이 이뤄졌지만, 실제 웹에서는 세션정보는 DB수정 전 세션이라는 뜻
//        // 해결하기 위해서 세션 정보를 직접 변경 해줘야함
//
//        // 세션등록
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
//    }


}
