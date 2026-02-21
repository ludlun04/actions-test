package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {

  private final CatRepository catRepository;

  @PutMapping
  public ResponseEntity<String> PutCat(@RequestBody String name) {
      Cat cat = new Cat();
      cat.setName(name);
      catRepository.save(cat);
      return ResponseEntity.status(HttpStatus.CREATED).body(cat.getId().toString());
  }

  @GetMapping
  public ResponseEntity<String> GetCats() {
      return ResponseEntity.ok(Integer.toString(catRepository.findAll().size()));
  }
}
