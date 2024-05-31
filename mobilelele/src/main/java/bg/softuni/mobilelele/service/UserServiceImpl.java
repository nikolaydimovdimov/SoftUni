package bg.softuni.mobilelele.service;

import bg.softuni.mobilelele.models.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDto userRegistrationDto) {
//        TODO
        System.out.println("The User received is: " + userRegistrationDto);
    }
}
