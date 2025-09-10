package com.blog.blogFinal.service;

import com.blog.blogFinal.model.Posteo;
import com.blog.blogFinal.repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo{
    private IposteoRepository posteoRepository;

    public PosteoService(IposteoRepository posteoRepository){
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> obtenerTodos() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo obtenerPorId(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void guardarPersona(Posteo posteo) {
        posteoRepository.save(posteo);
    }
}
