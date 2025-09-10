package com.blog.blogFinal.service;

import com.blog.blogFinal.model.Posteo;

import java.util.List;

public interface IservicePosteo {
    List<Posteo> obtenerTodos();
    Posteo obtenerPorId(Long id);
    void guardarPersona(Posteo posteo);
}
