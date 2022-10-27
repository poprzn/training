package main.java.ro.fasttrackit.university;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessLogicService {

    private final HumanRepository humanRepository;

    public BusinessLogicService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }


    public HumanEntity newHuman(Long id, String cnp, String lastname, String firstname) {
        HumanEntity newHuman = new HumanEntity();
        newHuman.setId(id);
        newHuman.setCnp(cnp);
        newHuman.setLastname(lastname);
        newHuman.setFirstname(firstname);
        return newHuman;
    }




}
