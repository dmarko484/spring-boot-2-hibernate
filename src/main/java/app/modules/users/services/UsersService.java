package app.modules.users.services;

import app.modules.users.repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    UsersRepository usersRepository;

    @Autowired
    public UsersService( UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public UsersRepository getUsersRepository() {
        return usersRepository;

    }
}
