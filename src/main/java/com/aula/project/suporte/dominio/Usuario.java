package com.aula.project.suporte.dominio;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario extends Pessoa{


    public Usuario(int id, String endereco, String name, String email, String phone, String cpf) {
        super(id, endereco, name, email, phone, cpf);
    }
}
