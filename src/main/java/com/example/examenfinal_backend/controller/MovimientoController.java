package com.example.examenfinal_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examenfinal_backend.entities.Bill;
import com.example.examenfinal_backend.entities.Users;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class MovimientoController {
    @GetMapping("/{username}")
	public Users getUseriasbyUsarname(@PathVariable String usarname) {
		
		Optional<Users> users = usersRepository.findById(usarname);
		
		if (usarname.isPresent()) {
			return usarname.get();
		}
		
		return null;

	}
    
}
