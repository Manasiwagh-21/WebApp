package com.onlinetutorialspoint.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.onlinetutorialspoint.constents.CafeConstant;
import com.onlinetutorialspoint.model.Person;
import com.onlinetutorialspoint.model.User;
import com.onlinetutorialspoint.service.PersonService;
import com.onlinetutorialspoint.service.UserService;
import com.onlinetutorialspoint.utils.CafeUtils;
@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class PersonController {
	
	/*
	 * @Autowired UserService userService;
	 */
	
//	@Autowired(required=true)
//	PersonService personService;
//	
//	//User user;
//	
//	 @GetMapping("/person") 
//	 public List<Person> getallPerson() { 
//		 return personService.getallPerson();
//	 }
			  
			  
	
	/*
	 * @GetMapping("/person") public List<Person> getallPerson() { return
	 * personService.getallPerson(); }
	 * 
	 * @GetMapping("/person/{personId}") public Person getPersonById(@PathVariable
	 * Long id) {
	 * 
	 * return null; //return personService.getPersonById(Long.parseLong(id));
	 * 
	 * }
	 * 
	 * @PostMapping("/person") public boolean saveOrUpdatePerson(@RequestBody Person
	 * person) {
	 * 
	 * 
	 * return personService.saveOrUpdatePerson(person);
	 * 
	 * }
	 * 
	 * public boolean deletePerson(Long id) { return false;
	 * 
	 * }
	 */
		
	
	/*
	 * @RequestMapping(value = "/signup")
	 * 
	 * @ResponseBody public ResponseEntity<String> signup(Map<String, String>
	 * requestMap) {
	 * 
	 * try { return userService.signup(requestMap); }catch (Exception ex) {
	 * ex.printStackTrace(); } return
	 * CafeUtils.getResponseEntity(CafeConstant.SOMETHING_WENT_WRONG,HttpStatus.
	 * INTERNAL_SERVER_ERROR); }
	 */
	
}


/*@Controller
@RequestMapping(value = "/person")
public class PersonController {
	@Autowired
	private PersonDAO personDao;

	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Person person = new Person();
			person.setId(id);
			personDao.delete(person);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "Person succesfully deleted!";
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public String create(String name, String city) {
		try {
			Person person = new Person();
			person.setName(name);
			person.setCity(city);
			personDao.savePerson(person);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "Person succesfully saved!";
	}
	@RequestMapping(value = "/allPersons")
	@ResponseBody
	public List<Person> getAllPersons() {
		try {
			return personDao.getAllPersons();
		} catch (Exception ex) {
			return null;
		}
	}
}*/
