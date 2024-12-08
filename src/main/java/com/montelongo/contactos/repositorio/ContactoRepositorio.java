package com.montelongo.contactos.repositorio;

import com.montelongo.contactos.modelo.contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactoRepositorio extends JpaRepository<contacto, Integer> {
}
