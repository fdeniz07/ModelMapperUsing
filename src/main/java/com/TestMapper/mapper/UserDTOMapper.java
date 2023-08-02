package com.TestMapper.mapper;

import com.TestMapper.dto.UserDTO;
import com.TestMapper.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertUserToUserDTO(User user){

        UserDTO userDTO = modelMapper.map(user,UserDTO.class);
        userDTO.setFullName(user.getFirstName() + " " + user.getLastName());
        return  userDTO;
    }

    public User convertUserDTOToUser(UserDTO userDTO){

       User user = modelMapper.map(userDTO,User.class);
        return user;
    }
}
