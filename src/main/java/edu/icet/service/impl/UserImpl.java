package edu.icet.service.impl;

import edu.icet.dto.UsersDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {

    final UserRepository userrepository;
    final ModelMapper modelMapper;


    @Override
    public void addUsers(UsersDto user) {
        UserEntity userEntity=modelMapper.map(user, UserEntity.class);
        userrepository.save(userEntity);
    }

    @Override
    public void updateUsers(UsersDto user) {
        UserEntity userEntity=modelMapper.map(user, UserEntity.class);
        userrepository.save(userEntity);

    }

    @Override
    public void deleteUsers(Integer userId) {

        userrepository.deleteById(userId);
    }

    @Override
    public UsersDto searchByID(Integer userId) {
        UserEntity userEntity=userrepository.findById(userId).get();
        UsersDto usersDto= modelMapper.map(userEntity, UsersDto.class);
        return usersDto;
    }

    @Override
    public List<UsersDto> getAll() {
        List<UserEntity> userEntities=userrepository.findAll();
        ArrayList<UsersDto> usersDtoArrayList=new ArrayList<>();
        userEntities.forEach(userEntity -> {
            UsersDto usersDto=modelMapper.map(userEntity, UsersDto.class);
            usersDtoArrayList.add(usersDto);
        });
        return  usersDtoArrayList;
    }
}
