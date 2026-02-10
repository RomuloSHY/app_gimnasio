package com.proyecto.app_gimnasio.repository;

import com.proyecto.app_gimnasio.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
