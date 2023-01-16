package com.bit.blog55.test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private int id;
    private String username;
    private String password;
    private String email;


//    @Builder
//    public Member(int id, String username, String password, String email) {
//
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//    }



}
