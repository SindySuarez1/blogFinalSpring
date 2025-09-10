package com.blog.blogFinal.repository;

import com.blog.blogFinal.model.Posteo;

import java.util.List;

public interface IposteoRepository {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}
