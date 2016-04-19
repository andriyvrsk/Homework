package com.logos.demo.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.logos.demo.dao.PersonDao;
import com.logos.demo.model.Person;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private PersonDao personDao;

	@RequestMapping(method = RequestMethod.GET)
	public String getAll(Model model, HttpServletRequest request) {

		model.addAttribute("context", request.getContextPath());
		model.addAttribute("personList", personDao.findAll());

		return "users";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestParam(name = "name") String name,
			@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		personDao.save(new Person(name, email, password));
		return "redirect:/users";
	}

}
