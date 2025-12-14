package com.alejandrogreco.crud_chocolateria.repository;

import com.alejandrogreco.crud_chocolateria.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
}
