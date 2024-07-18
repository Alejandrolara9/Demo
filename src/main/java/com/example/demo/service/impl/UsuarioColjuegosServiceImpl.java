package com.example.demo.service.impl;

import com.example.demo.model.UsuarioColjuegos;
import com.example.demo.repository.UsuarioColjuegosRepository;
import com.example.demo.service.UsuarioColjuegosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioColjuegosServiceImpl implements UsuarioColjuegosService {

    private final UsuarioColjuegosRepository repository;

    public List<UsuarioColjuegos> findAll() {
        return repository.findAll();
    }

    public Optional<UsuarioColjuegos> findById(Long id) {
        return repository.findById(id);
    }

    public UsuarioColjuegos save(UsuarioColjuegos usuario) {
        return repository.save(usuario);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
