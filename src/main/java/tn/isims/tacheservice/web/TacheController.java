package tn.isims.tacheservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.isims.tacheservice.dao.TacheRepository;
import tn.isims.tacheservice.entities.Tache;

@RestController
public class TacheController {

    @Autowired
    TacheRepository tacheRepository ;

    @PostMapping("createtaches")
    public Tache create(@RequestBody Tache tache){
        return tacheRepository.save(tache);
    }
}
