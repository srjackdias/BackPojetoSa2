package com.Senai.projetoSa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity(name = "trabalho_solicitado")
public class TrabalhadoSolicitadoEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "id_trabalhoSolicitado")
    private Long id_trabalhoSolicitado;  

    @Column(name = "id_cliente")
     private Long id_cliente;  

     @Column(name = "id_trabalhador")
     private Long id_trabalhador;  
    
    @Column(name = "tipo")
    private String tipo;


    @Column(name = "valor")
    private String valor;


    @Column(name = "localização")
    private String localização;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private  UsuarioEntity usuario;
   
    
}
