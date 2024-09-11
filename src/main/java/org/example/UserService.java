package org.example;

public class UserService implements UserRepository {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void findAllUsers() {
        this.userRepository.findAllUsers();
    }
}
