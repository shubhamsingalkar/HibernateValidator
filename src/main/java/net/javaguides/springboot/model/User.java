package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "users")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//username should not null or empty
	//username at least 2 characters
	
	@Column(name = "name", nullable = false)
	@NotEmpty
    @Size(min = 2, message = "username at least 2 characters")
	private String name;
	
	//email should be valid email format
	//email should not null or empty
	
	@Email
	@NotEmpty(message = "email should not be empty")
	private String email;
	
	//password should not be null or empty
	//password should have at least 8 characters
	@NotEmpty
	@Size (min = 8, message= "Password should have at least 8 characters")
	private String password;
	
	
	
	public User() {
	
	}
	
	public User(long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
