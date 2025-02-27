package com.aula.project.suporte.dominio;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario extends Pessoa{

    private Usuario usuario;

    public Usuario(){
        super();
    }

    private Usuario getInstance(){
        if(this.usuario == null){
            this.usuario = new Usuario();
        }
        return usuario;
    }

}
