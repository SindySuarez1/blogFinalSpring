package com.blog.blogFinal.controller;

import com.blog.blogFinal.model.Posteo;
import com.blog.blogFinal.service.PosteoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/posteo")

public class PosteoController {
    private PosteoService posteoService;

    public PosteoController(PosteoService posteoService){
        this.posteoService = posteoService;
    }
    @GetMapping
    public List<Posteo> obtenerTodos() {
        return posteoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Posteo obtenerPorId(@PathVariable Long id) {
        return posteoService.obtenerPorId(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> guardarPersona(@RequestBody Posteo posteo) {
        posteoService.guardarPersona(posteo);
        return ResponseEntity.ok("Posteo agregado con exito");
    }
}
