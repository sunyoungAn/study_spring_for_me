package com.example.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userIdx;
	
	@Column(length = 45)
	private String email;
	
	@Column(length = 100)
	private String password;
	
	@Column(length = 45)
	private String salt;
	
	@Column(length = 45)
	private String nickname;
	
	@Column(length = 45)
	private String repname;
	
	@Column(length = 45)
	private String coname;
	
	@Column(length = 200)
	private String img;
	
	private Float longitude;
	
	private Float latitude;

	@Column(length = 100)
	private String location;
	
	@Column(length = 45)
	private String phoneNumber;

}
