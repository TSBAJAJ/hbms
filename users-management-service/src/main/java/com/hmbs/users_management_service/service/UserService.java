package com.hmbs.users_management_service.service;

import com.hmbs.users_management_service.dto.UserDto;
import com.hmbs.users_management_service.entity.User;
import com.hmbs.users_management_service.mapper.UserMapper;
import com.hmbs.users_management_service.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<User> users() {
        User user = new User();
        user.setId(1L);
        user.setFirstName("tanveer");

        return List.of(user);
    }

    @Transactional
    public UserDto register(UserDto userDto) {
        log.info("userdto: " + userDto);
        long currentTimeMillis = System.currentTimeMillis();

        User user;
        if (userDto.getId() != null && userDto.getId() > 0) {
            // Update existing user
            user = userRepository.findById(userDto.getId())
                    .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userDto.getId()));
            user.setUpdatedOn(currentTimeMillis);
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
        } else {
            // Create new user
            userDto.setCreatedOn(currentTimeMillis);
            userDto.setUpdatedOn(currentTimeMillis);
            user = userMapper.toEntity(userDto);
        }
        user = userRepository.save(user);

        log.info("user entity: " + user);
        return userMapper.toDto(user);
    }
}
