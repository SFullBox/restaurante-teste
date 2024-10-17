package com.restaurante.almoco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurante")
public class RestauranteController {

	@Autowired
    private RestauranteRepository restauranteRepository;

    @PostMapping
    public ResponseEntity<Restaurante> criarRestaurante(@RequestBody Restaurante restaurante) {
        Restaurante novoRestaurante = restauranteRepository.save(restaurante);
        return ResponseEntity.status(201).body(novoRestaurante);
    }

    @GetMapping
    public List<Restaurante> listarRestaurantes() {
        return restauranteRepository.findAll();
    }
}
