package com.Senai.projetoSa.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity(name = "usuario")
public class UsuarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name= "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "telefone")
    private String telefone;

    @Column(name= "cep")
    private String cep;

    @Column(name = "tipo_usuario")
    private String  tipo;

    

    @OneToMany(mappedBy= "usuario")
    private List<TrabalhadoSolicitadoEntity> trabalhoSolicitado;



}
