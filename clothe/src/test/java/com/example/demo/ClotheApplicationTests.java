package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Clothe;
import com.example.demo.repository.ClotheRepository;





@SpringBootTest
class ClotheApplicationTests {
	
	@Autowired
	private ClotheRepository clotheRepository;
	
	@Test
	public void testCreateClothe() {
	Clothe clo = new Clothe("jean","black",0.2); 
	clotheRepository.save(clo);
	}

}
