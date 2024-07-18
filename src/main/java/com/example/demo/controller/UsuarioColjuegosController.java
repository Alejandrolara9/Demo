package com.example.demo.controller;

import com.example.demo.model.UsuarioColjuegos;
import com.example.demo.service.UsuarioColjuegosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioColjuegosController {

    private final UsuarioColjuegosService service;

    @GetMapping
    public List<UsuarioColjuegos> getAllUsuarios() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioColjuegos> getUsuarioById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuarioColjuegos createUsuario(@RequestBody UsuarioColjuegos usuario) {
        return service.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioColjuegos> updateUsuario(@PathVariable Long id, @RequestBody UsuarioColjuegos usuario) {
        return service.findById(id)
                .map(existingUsuario -> {
                    usuario.setId(existingUsuario.getId());
                    return ResponseEntity.ok(service.save(usuario));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
