package edu.icet.controller;

import edu.icet.dto.UsersDto;
import edu.icet.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/Add")
    public void addUsers(UsersDto user) {
        userService.addUsers(user);
    }

    @PutMapping("/Update")
    public void updateUsers(UsersDto user) {
        userService.updateUsers(user);
    }

    @DeleteMapping("/Delete-By-Id/{Id}")
    public void deleteUsers(Integer userId) {
        userService.deleteUsers(userId);
    }


    @GetMapping("/Search-By-Id/{Id}")
    public void searchByID(Integer userId) {
        userService.searchByID(userId);
    }

    @GetMapping("/GetAll")
    public List<UsersDto> getAll() {
        return userService.getAll();
    }
}
