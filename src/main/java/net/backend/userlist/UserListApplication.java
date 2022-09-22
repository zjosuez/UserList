package net.backend.userlist;

import net.backend.userlist.model.User;
import net.backend.userlist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class UserListApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(UserListApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gamil.com"));
        this.userRepository.save(new User("Ronaldo", "Santos", "ronaldo@gamil.com"));
        this.userRepository.save(new User("Thiago", "Santorini", "thiago@gamil.com"));

    }
}
