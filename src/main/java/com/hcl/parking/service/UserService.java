package com.hcl.parking.service;

import com.hcl.parking.dto.LoginDetailsDto;
import com.hcl.parking.dto.LoginDto;
import com.hcl.parking.dto.UserDetailsDto;
import com.hcl.parking.dto.UserDto;

public interface UserService {
	public UserDetailsDto register(UserDto userDto);
	public LoginDetailsDto login(LoginDto loginDto);
}
