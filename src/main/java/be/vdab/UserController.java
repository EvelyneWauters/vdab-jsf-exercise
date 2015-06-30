package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelyne on 30/06/15.
 */

@Named
public class UserController {
    @Inject
    private UserRepository userRepository;

    public User returnUser(int id) {
        return userRepository.findById(id);
    }


}
