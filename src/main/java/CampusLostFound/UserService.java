package CampusLostFound;

import CampusLostFound.User;
import CampusLostFound.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {

        user.setRole("USER");

        return userRepository.save(user);
    }
}