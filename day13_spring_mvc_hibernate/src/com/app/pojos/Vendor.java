package com.app.pojos;
import javax.persistence.*;


@Entity
@Table(name="test_vendors")
public class Vendor {
	private Integer id;
	private String name="some nm", email="some email", pass, city, phoneNo;
	private String role;

	public Vendor() {
		System.out.println("in vendor constr");
	}

	public Vendor(Integer id, String name, String email, String pass, String city, String phoneNo, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.city = city;
		this.phoneNo = phoneNo;
		this.role = role;
	}
	

	public Vendor(String name, String email, String pass, String city, String phoneNo, String role) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.city = city;
		this.phoneNo = phoneNo;
		this.role = role;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=20)
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	@Column(length=20)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(length=10,name="phone_no")
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Column(length=20)
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", city=" + city
				+ ", phoneNo=" +phoneNo +", logged in as "+role;
	}

}
