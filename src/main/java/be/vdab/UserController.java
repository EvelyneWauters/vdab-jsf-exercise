package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelyne on 30/06/15.
 */

@Named
@RequestScoped
public class UserController {
    private User user = new User();

    @Inject
    private UserRepository userRepository;

    public User returnUser(int id) {
        return userRepository.findById(id);
    }

    public List<User> returnAllUsers()  {
        return userRepository.findAll();
    }



    public User getUser()   {
        return user;
    }

    public String saveUser() {

        userRepository.createUser(user);
        return "users";
    }

    public String removeUser(Integer id)  {
        userRepository.remove(id);
        return "users";
    }

}
