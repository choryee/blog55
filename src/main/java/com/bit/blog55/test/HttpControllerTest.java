package com.bit.blog55.test;


import org.springframework.web.bind.annotation.*;


//13강.
@RestController //사용자가 요청시, data을 가지고 응답할 때 사용. @Controller는 html파일로 응답할 때 사용.
public class HttpControllerTest { //이 Controller는 서버가 클의 요청에 대답하는 것이다.

    private static final String TAG="HttpControllerTest:";

//    @GetMapping("/http/lombok")
//    public String lombokTest() {
//        //Member m=new Member(1, "kim","1234","email");
//        //위와 달리, 변수값을 넣고 싶은 것만 넣을 수 있다.
//        Member m=Member.builder().username("Lee").password("456").email("go@nate.com").build();
//        System.out.println(TAG+":getter:"+m.getId());
//        m.setId(500);
//        System.out.println(TAG+":setter:"+m.getId());
//        return "lombok test completed=>>"+m.getEmail();
//    }

    //----------------------------------------------------------------
    // http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(@RequestParam int id, @RequestParam String username) {
        return "get 요청: id="+id+"  "+"username:"+username;
    }

    // http://localhost:8080/http/post. post는 기존 정보에 추가하라는 것.
	@PostMapping("/http/post")
	public String postTest(Member m) {
		return "post 요청:"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}


    // http://localhost:8080/http/post. post는 기존 삽입insert에 추가하라는 것.
//	@PostMapping("/http/post")
//	public String postTest(@RequestBody String text) {
//		return "post 요청=>"+text;
//	}


//    @PostMapping("/http/post")
//    public String postTest(@RequestBody Member m) { //messageconverter가 자동으로 매핑해줌.
//        return "post 요청:"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
//    }


    // http://localhost:8080/http/put. put는 기존 정보에 업데이트하라는 것.
    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청=>";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청=>";
    }


}

