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
import com.example.examenfinal_backend.repository.BillRepository;
import com.example.examenfinal_backend.repository.UsersRepository;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/bill")
public class MovimientoController {

    @Autowired
	BillRepository billRepository;

    @GetMapping
	public List<Bill> getBillAll() {

		return billRepository.findAll();
	}
    @GetMapping("/{user_id}")
	public Bill getBillbyUser_id(@PathVariable Integer user_id) {
		
		Optional<Bill> bill = billRepository.findById(user_id);
		
		if (user_id.isPresent()) {
			return user_id.get();
		}
		
		return null;

	}

    @PostMapping
	public Bill postBill(@RequestBody Bill bill) {
		
		billRepository.save(bill);
		
		return bill;
		

	}

}
