package com.aula.project.suporte.dominio;

import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public abstract class Pessoa {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "password")
    private String password;

    public Pessoa() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Pessoa(String cpf, String phone, String email, String name, String endereco, int id, String password) {
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.endereco = endereco;
        this.id = id;
    }

    private Set<Perfil> perfil = new HashSet<>();

    public Set<Perfil> getPerfil() {
        return this.perfil;
    }

    public void addPerfil(Perfil perfil) {
        this.perfil.add(perfil);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPerfil(Set<Perfil> perfil) {
        this.perfil = perfil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
