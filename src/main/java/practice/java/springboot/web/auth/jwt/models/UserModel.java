package practice.java.springboot.web.auth.jwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import practice.java.springboot.web.auth.jwt.utils.DateUtil;

@Entity
@Table(name="user")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserID")
	private int userID;
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Created")
	private int created;
	@Column(name="Modify")
	private int modify;
	@Column(name="Address")
	private String address;
	@Column(name="Status")
	private int status;
	
	public UserModel() {
		this.modify = DateUtil.DateMilis().intValue();
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(int created) {
		this.created = created;
	}
	public long getModify() {
		return modify;
	}
	public void setModify(int modify) {
		this.modify = modify;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
