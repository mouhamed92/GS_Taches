package tn.isims.tacheservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isims.tacheservice.dao.UserRepository;
import tn.isims.tacheservice.entities.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository ;

    @PostMapping("createusers")
    public User create(@RequestBody User user){
        return userRepository.save(user) ;
    }

    @GetMapping("allusers")
    public List<User> search(){
        return userRepository.findAll();
    }

    @GetMapping("users/{id}")
    public User searchOne(@PathVariable long id){
        return userRepository.findById(id).get();
    }

    @PutMapping("update/{id}")
    public User update(@PathVariable long id,@RequestBody User user){

        User usr = userRepository.findById(id).get();
        usr.setName(user.getName());
        usr.setPrenom(user.getPrenom());
        userRepository.save(usr);
        return userRepository.findById(id).get();
    }

}
