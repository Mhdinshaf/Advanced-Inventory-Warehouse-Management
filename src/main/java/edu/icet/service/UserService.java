package edu.icet.service;

import edu.icet.dto.UsersDto;

import java.util.List;

public interface UserService {
    void addUsers(UsersDto user);
    void updateUsers(UsersDto user);
    void deleteUsers(Integer  userId);
    UsersDto searchByID(Integer userId);
    List<UsersDto> getAll();
}
