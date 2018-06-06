package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Dog;

@RestController
public class DogController {

	@RequestMapping("/dog")
    public Dog getDog() {
        return new Dog("fido");
    }
}
