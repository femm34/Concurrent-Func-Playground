package org.example;

public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getAllUsers(){
        this.userRepository.findAllUsers();
    };
}
