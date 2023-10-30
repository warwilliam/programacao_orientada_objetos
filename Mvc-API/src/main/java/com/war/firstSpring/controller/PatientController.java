package com.war.firstSpring.controller;


import com.war.firstSpring.model.Patient;
import com.war.firstSpring.resources.config.ConfigJDBC;
import com.war.firstSpring.resources.impl.AddressDao;
import com.war.firstSpring.resources.impl.PatientDao;
import com.war.firstSpring.service.AddressService;
import com.war.firstSpring.service.PacientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class PatientController {



    private ConfigJDBC configJDBC;

   private PacientService pacientService = new PacientService(
            new PatientDao(new AddressDao()));

   private AddressService addressService = new AddressService(
           new AddressDao());

   @PostMapping()
   public ResponseEntity<Patient> save(@RequestBody Patient patient) throws Exception {
        return ResponseEntity.ok(pacientService.save(patient));
   }

   
    @GetMapping("/{id}")
    public ResponseEntity<Patient> searchById(@PathVariable Integer id) throws Exception {
       return ResponseEntity.ok(pacientService.searchById(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Patient>> searchAll() throws Exception {
       return  ResponseEntity.ok(pacientService.selectAll());
    }

    @PutMapping
    public ResponseEntity<Patient> update(@RequestBody Patient patient) throws Exception {
       ResponseEntity<Patient> response =null;
       if (patient.getId() != null && pacientService.searchById(patient.getId()).isPresent()){
           response = ResponseEntity.ok(pacientService.update(patient));
        } else {
           response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
       return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById (@PathVariable Integer id) throws Exception {
       ResponseEntity<String> response = null;

        Optional<Patient>  p = pacientService.searchById(id);
        Integer addressId = p.get().getAddress().getId();

       if (pacientService.searchById(id).isPresent()){
           pacientService.delete(id);
           addressService.deleteById(addressId);
           response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Paciente deletado");
       } else {
           response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
       return response;
    }


}
