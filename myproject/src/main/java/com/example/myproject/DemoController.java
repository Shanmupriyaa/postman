package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.entity.Details;
import com.example.myproject.repository.DetailsRepository;

@RestController
public class DemoController {
	@Autowired
	private DetailsRepository detailsRepository;
@PostMapping("/test")
public Details addDetails(@RequestBody Details details) {
	detailsRepository.save(details);
	return details;
	
}
}
