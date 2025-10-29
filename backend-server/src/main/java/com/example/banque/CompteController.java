package com.example.banque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comptes") // Base path relative to context-path /banque
public class CompteController {

    @Autowired
    private CompteRepository compteRepository;

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    @PostMapping
    public Compte createCompte(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }
}
