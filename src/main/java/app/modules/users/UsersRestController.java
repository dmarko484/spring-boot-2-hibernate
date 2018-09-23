package app.modules.users;


import app.modules.users.models.Profile;
import app.modules.users.models.User;
import app.modules.users.services.ProfileService;
import app.modules.users.services.UsersService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersRestController {

    // @PersistenceContext
    private EntityManager em;
    private UsersService usersService;
    private ProfileService profileService;




    @Autowired
    public UsersRestController(EntityManager em, UsersService usersService, ProfileService profileService) {
        this.em=em;
        this.usersService = usersService;
        this.profileService=profileService;
    }

    @RequestMapping("/all2")
    public List<User> getAllUsers2(){

        return usersService.getRepository().findAll();
    }

    @ApiOperation(value = "Číselníky", nickname = "cp", notes = "Vrací číselníkové položky potřebné pro tvorbu UI")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "all", value = "1 = zahrne i komerční sazby", required = false, dataType = "string", paramType = "query", defaultValue="", example = ""),
            @ApiImplicitParam(name = "token", value = "autentizační token", required = false, dataType = "string", paramType = "query", defaultValue="", example="")

    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = User.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            //   @ApiResponse(code = 403, message = "Forbidden"),
            //  @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @GetMapping("/new")
    public User newUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email){
        User user = new User(firstName, lastName, email);
        user=usersService.getRepository().save(user);

        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){

       return usersService.getRepository().findAll();
    }

    @GetMapping("/all-em")
    public List<User> getAllUsersFromEm(){

        return em.createQuery("select e from User e",User.class).getResultList();
    }

    @GetMapping("/create")
    public List create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String edu){
        User user = new User(firstName, lastName, email);
        user=usersService.getRepository().save(user);

        Profile p= new Profile();
        p.setEducation(edu);
        p.setUser(user);
        p=profileService.getRepository().save(p);

        return Arrays.asList(user,p);
    }



}
