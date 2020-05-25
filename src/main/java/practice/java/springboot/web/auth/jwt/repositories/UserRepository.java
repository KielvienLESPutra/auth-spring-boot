package practice.java.springboot.web.auth.jwt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import practice.java.springboot.web.auth.jwt.models.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer>{
	@Query(value="SELECT * FROM `USER` WHERE `Username` = :user OR `Email`= :email", 
			nativeQuery=true)
	List<UserModel> getDataExist(
			@Param("user") String username, 
			@Param("email") String email);
}
