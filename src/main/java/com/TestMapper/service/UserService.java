package com.TestMapper.service;

import com.TestMapper.dto.UserDTO;
import com.TestMapper.mapper.UserDTOMapper;
import com.TestMapper.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserDTOMapper userDTOMapper;
    public UserDTO getUser(){

        //Mock db call
        User user  = new User();
        user.setId("1234");
        user.setEmail("info@test.com");
        user.setFirstName("Max");
        user.setLastName("Musterman");
        user.setPassword("password");

        UserDTO userDTO = userDTOMapper.convertUserToUserDTO(user);

        return userDTO;
    }
}
