package com.sringboot.auth.service;

import com.sringboot.auth.model.Role;
import com.sringboot.auth.model.User;
import com.sringboot.auth.repository.RoleRepository;
import com.sringboot.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User registerNewUser(User user){
        return userRepository.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole=new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role");
        roleRepository.save(adminRole);

        Role userRole=new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default Role for newly created record");
        roleRepository.save(userRole);

        User adminUser=new User();
        adminUser.setUserFirstName("Admin");
        adminUser.setUserLastName("Admin");
        adminUser.setUserName("Admin123");
        adminUser.setUserPassword("Admin@pass");
        Set<Role> adminRoles =new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User user=new User();
        user.setUserFirstName("Vishwa");
        user.setUserLastName("Deshan");
        user.setUserName("Vishwa123");
        user.setUserPassword("Vishwa@pass");
        Set<Role> userRoles =new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userRepository.save(user);
    }
}
