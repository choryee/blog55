package com.bit.blog55.controller.api;

//import com.bit.blog44.config.auth.PrincipalDetail;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AdminApiController {
//
//    private final AdminService adminService;
//
//
//    // 관리자페이지에서 멤버 등급 바꾸기
//    @PutMapping("/admin/manage/member/edit/{id}")
//    public ResponseEntity<?> changeRole(@RequestBody User roleUser, @PathVariable("id") Integer id, @AuthenticationPrincipal PrincipalDetail principalDetail) {
//        User user = principalDetail.getUser();
//        if (user.getRole() == RoleType.ADMIN) {
//            System.out.println("컨트롤러 role = " + roleUser);
//            adminService.changeRole(id, roleUser);
//
//            return new ResponseEntity<>(1, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(1, HttpStatus.FORBIDDEN);
//        }
//
//    }
}
