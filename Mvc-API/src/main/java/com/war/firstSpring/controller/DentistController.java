package com.war.firstSpring.controller;


import com.war.firstSpring.resources.impl.DentistDao;
import com.war.firstSpring.model.Dentist;
import com.war.firstSpring.service.DentistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    private DentistService dentistService = new DentistService(
            new DentistDao());

    @PostMapping
    public ResponseEntity<Dentist> register(@RequestBody Dentist dentist) throws Exception {
        return ResponseEntity.ok(dentistService.save(dentist));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentist> search(@PathVariable Integer id) throws Exception {
        return ResponseEntity.ok(dentistService.searchById(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Dentist>> searchAll() throws Exception {
        return ResponseEntity.ok(dentistService.searchAll());
    }

    @PutMapping
    public ResponseEntity<Dentist> update(@RequestBody Dentist dentist) throws Exception {

        ResponseEntity<Dentist> response = null;
        if (dentist.getId() != null && dentistService.searchById(dentist.getId()).isPresent()) {
            return ResponseEntity.ok(dentistService.update(dentist));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>  delete(@PathVariable Integer id) throws Exception {
        ResponseEntity<String> response = null;
        if (dentistService.searchById(id).isPresent()){
            dentistService.delete(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Dentista excluido");
        } else {
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return response;
    }
}
