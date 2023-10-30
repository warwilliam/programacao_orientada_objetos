package com.war.firstSpring.controller;


import com.war.firstSpring.resources.impl.AddressDao;
import com.war.firstSpring.model.Address;
import com.war.firstSpring.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService = new AddressService(
           new AddressDao());


    @PostMapping
    public ResponseEntity<Address> register(@RequestBody Address address) throws Exception {
        return  ResponseEntity.ok(addressService.save(address));
    }

    @GetMapping
    public ResponseEntity<List<Address>> searchAll() throws Exception {
        return ResponseEntity.ok(addressService.tekaAllAddress());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> searchById(@PathVariable Integer id) throws Exception {
        return ResponseEntity.ok(addressService.searchById(id).orElse(null));
    }

    @PutMapping
    public ResponseEntity<Address> update(@RequestBody Address address) throws Exception {
        ResponseEntity<Address> response = null;

        if (address.getId() != null && addressService.searchById(address.getId()).isPresent()){
            response = ResponseEntity.ok(addressService.update(address));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) throws Exception {
        ResponseEntity<String> response = null;

        if (addressService.searchById(id).isPresent()){
            addressService.deleteById(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Address deletado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

}
