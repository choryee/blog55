package com.bit.blog55.repository;

import com.bit.blog55.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    //select * from user where username=?; 52강
  //  Optional<User> findByUsername(String username); //findByUsername에서 Username는 대문자로 시작해야.

    //JPA naming 쿼리. 46강
//select * from user where username=? AND password=?;
User findByUsernameAndPassword(String username, String password); //49강에서 시큐리티하면서 주석함//

}

//public interface UserRepository extends JpaRepository<User, Integer>{

//네이티브 쿼리라 부름. 위와 동일.
//	@Query(value = "select * from user where username=? AND password=?;", nativeQuery = true)
//	User login(String username, String password);

//}





















