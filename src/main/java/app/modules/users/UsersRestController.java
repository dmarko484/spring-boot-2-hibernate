package app.modules.users;


import app.modules.users.models.User;
import app.modules.users.repos.UsersRepository;
import app.modules.users.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersRestController {

    UsersService usersService;

    public UsersRestController(UsersService usersService) {
        this.usersService = usersService;
    }



    @GetMapping("/new")
    public User newUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email){

        User user = new User(firstName, lastName, email);
        user=usersService.getUsersRepository().save(user);


        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return usersService.getUsersRepository().findAll();
    }




}
