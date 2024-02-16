package com.backend.FAT_Backend.controller;

import com.backend.FAT_Backend.exception.ResourceNotFoundException;
import com.backend.FAT_Backend.model.Address;
import com.backend.FAT_Backend.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    @Autowired
    private AdressRepository aR;
    @GetMapping
    public List<Address> getAllAddresses() {
        return aR.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Address createAddress(@RequestBody Address address) {
        return aR.save(address);
    }
    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Integer id) {
        Optional<Address> address = aR.findById(id);
        if (address.isPresent()) {
            return address.get();
        } else {
            // Handle the case where employee with given id doesn't exist
            throw new ResourceNotFoundException("Employee with id " + id + " not found");
        }
    }
}
