package com.example.myBank.service.impl;

import com.example.myBank.common.CommonResponse;
import com.example.myBank.dto.UserDto;
import com.example.myBank.entity.User;
import com.example.myBank.exception.UserServiceException;
import com.example.myBank.repository.UserRepository;
import com.example.myBank.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.logging.Logger;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CommonResponse registerUser(UserDto userDto) {
        try {
            log.info("User registration service method called");
            log.info("User details : " + userDto.toString());
            ModelMapper modelMapper = new ModelMapper();
            User user = modelMapper.map(userDto, User.class);
            checkIfUserExists(user);
            userRepository.save(user);
            return new CommonResponse("User registered successfully", true);
        } catch (DataIntegrityViolationException e) {
            throw new UserServiceException("Failed to register user due to data integrity violation.");
        } catch (Exception e) {
            throw new UserServiceException("An unexpected error occurred while registering the user.");
        }
    }

    @Override
    public CommonResponse updateUser(UserDto userDto) {
        try {
            if (!userRepository.existsById(userDto.getId())) {
                throw new UserServiceException("User not found");
            }
            ModelMapper modelMapper = new ModelMapper();
            User user = modelMapper.map(userDto, User.class);
            userRepository.save(user);
            return new CommonResponse("User updated successfully", true);
        } catch (DataIntegrityViolationException e) {
            throw new UserServiceException("Failed to update user due to data integrity violation.");
        } catch (Exception e) {
            throw new UserServiceException("An unexpected error occurred while updating the user.");
        }
    }

    @Override
    public CommonResponse deleteUser(int id) {
        try {
            if (!userRepository.existsById(id)) {
                throw new UserServiceException("User not found");
            }
            userRepository.deleteById(id);
            return new CommonResponse("User deleted successfully", true);
        } catch (DataIntegrityViolationException e) {
            throw new UserServiceException("Failed to delete user due to data integrity violation.");
        } catch (Exception e) {
            throw new UserServiceException("An unexpected error occurred while deleting the user.");
        }
    }

    @Override
    public CommonResponse getUser(int id) {
        try {
            if (!userRepository.existsById(id)) {
                throw new UserServiceException("User not found");
            }
            User user = userRepository.findById(id).get();
            return new CommonResponse("User retrieved successfully", true, user);
        } catch (DataIntegrityViolationException e) {
            throw new UserServiceException("Failed to retrieve user due to data integrity violation.");
        } catch (Exception e) {
            throw new UserServiceException("An unexpected error occurred while retrieving the user.");
        }
    }

    @Override
    public CommonResponse getAllUsers() {
        try {
            return new CommonResponse("Users retrieved successfully", true, userRepository.findAll());
        } catch (DataIntegrityViolationException e) {
            throw new UserServiceException("Failed to retrieve users due to data integrity violation.");
        } catch (Exception e) {
            throw new UserServiceException("An unexpected error occurred while retrieving the users.");
        }
    }

    private void checkIfUserExists(User user) {
        if (userRepository.existsById(user.getId())) {
            throw new UserServiceException("Username already exists");
        }
    }
}
