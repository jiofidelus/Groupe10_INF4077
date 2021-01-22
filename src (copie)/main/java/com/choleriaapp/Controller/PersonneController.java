package com.choleriaapp.Controller;
import java.util.List;
import java.util.Optional;

import com.choleriaapp.entity.Personne;
import com.choleriaapp.repository.PersonneRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {
	private PersonneRepository personnerepo;
	PersonneController(PersonneRepository personnerepo){
		this.personnerepo = personnerepo;
	}
	//@GetMapping(path="/personnes/type/{type}")
//	@RequestMapping("/personnes/type/{type}")
//	public Personne getbytype(@PathVariable String type){
//		return personnerepo.findByTelephone(type);
//	}
//public String getmedecin() {
//	return "merci beaucoup";
//}
	
//	@RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
//	@ResponseBody
//	Personne getBookById(@PathVariable final Integer bookId) {
//		return this.personnerepo.getPersonneById(bookId);
//		}
}
