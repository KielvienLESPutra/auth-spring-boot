package practice.java.springboot.web.auth.jwt.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import practice.java.springboot.web.auth.jwt.constants.Constanst;
import practice.java.springboot.web.auth.jwt.models.UserModel;
import practice.java.springboot.web.auth.jwt.repositories.UserRepository;
import practice.java.springboot.web.auth.jwt.utils.CommonUtil;
import practice.java.springboot.web.auth.jwt.utils.DateUtil;
import practice.java.springboot.web.auth.jwt.utils.EncryptDecrypt;

@Service
public class UserManagementService {
	private Logger log = LoggerFactory.getLogger(UserManagementService.class);
	
	@Autowired
	private UserRepository userRepo;
	
	public boolean createNewUser(UserModel user) {
		boolean flagCheckExist = checkDataUser(user.getUsername(), user.getEmail());
		boolean flagCheckFormat = CommonUtil.checkFormatEmail(user.getEmail());
		if(flagCheckExist == true && flagCheckFormat == true) {
			UserModel userSave = new UserModel();
			userSave.setUsername(user.getName());
			userSave.setPassword(EncryptDecrypt.EncryptData(user.getPassword()));
			userSave.setName(user.getName());
			userSave.setStatus(Constanst.STATUS_ACTIVE);
			userSave.setAddress(user.getAddress());
			userSave.setEmail(user.getAddress());
			userSave.setCreated(DateUtil.DateMilis().intValue());
			log.info("Success");
			userRepo.save(user);
			return true;
		}
		return false;
	}
	
	private boolean checkDataUser(String username, String email) {
		List<UserModel> listUser = userRepo.getDataExist(username, email);
		if(null == listUser || listUser.isEmpty() || 0 <= listUser.size() ) {
			return true;
		}
		return false;
	}
}
