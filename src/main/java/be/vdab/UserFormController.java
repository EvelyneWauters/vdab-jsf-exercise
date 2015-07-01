package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Evelyne on 30/06/15.
 */
@Named
@RequestScoped
public class UserFormController {

    @Inject
    private UserRepository userRepository;

    User user;


    public User getUser()   {
        return user;
    }

    public void saveUser() {
        userRepository.createUser(user);
    }



}
