package com.example.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Test;

@RestController
public class MainController {

	@PostMapping(value = "/test")
	public @ResponseBody String test(final @Valid @RequestBody Test test) {

		return null;
	}

}
