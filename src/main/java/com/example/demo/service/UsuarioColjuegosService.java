package com.example.demo.service;

import com.example.demo.model.UsuarioColjuegos;

import java.util.List;
import java.util.Optional;

public interface UsuarioColjuegosService {
    public List<UsuarioColjuegos> findAll();
    public Optional<UsuarioColjuegos> findById(Long id);
    public UsuarioColjuegos save(UsuarioColjuegos usuario);
    public void deleteById(Long id);
}
