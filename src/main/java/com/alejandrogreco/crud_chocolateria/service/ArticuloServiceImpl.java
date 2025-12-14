package com.alejandrogreco.crud_chocolateria.service;

import com.alejandrogreco.crud_chocolateria.model.Articulo;
import com.alejandrogreco.crud_chocolateria.repository.ArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    private final ArticuloRepository articuloRepository;

    public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> listarArticulos() {
        return articuloRepository.findAll();
    }

    public Optional<Articulo> obtenerArticuloPorId(Long id) {
        Objects.requireNonNull(id, "El id no puede ser null");
        return articuloRepository.findById(id);
    }

    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public Articulo actualizarArticulo(Long id, Articulo articulo) {
        articulo.setId(id);
        return articuloRepository.save(articulo);
    }

    public void eliminarArticulo(Long id) {
        Objects.requireNonNull(id, "El id no puede ser null");
        articuloRepository.deleteById(id);
    }
}
