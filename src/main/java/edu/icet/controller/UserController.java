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
    public void addUsers(@RequestBody UsersDto user) {

        userService.addUsers(user);
    }

    @PutMapping("/Update")
    public void updateUsers(@RequestBody UsersDto user) {

        userService.updateUsers(user);
    }

    @DeleteMapping("/Delete-By-Id/{userId}")
    public void deleteUsers(@PathVariable Integer userId) {

        userService.deleteUsers(userId);
    }


    @GetMapping("/Search-By-Id/{userId}")
    public UsersDto searchByID(@PathVariable Integer userId) {

        return userService.searchByID(userId);
    }

    @GetMapping("/GetAll")
    public List<UsersDto> getAll() {

        return userService.getAll();
    }
}
