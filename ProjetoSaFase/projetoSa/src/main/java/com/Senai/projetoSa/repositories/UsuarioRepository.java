package com.Senai.projetoSa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Senai.projetoSa.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
    
}
