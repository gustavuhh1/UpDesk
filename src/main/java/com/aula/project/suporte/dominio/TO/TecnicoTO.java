package com.aula.project.suporte.dominio.TO;

import com.aula.project.suporte.dominio.Tecnico;
import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.annotation.Nonnull;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNullFields;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TecnicoTO {
    protected Integer id;
    protected String name;
    protected String cpf;
    protected String email;
    protected String password;
    protected Set<Perfil> perfil = new HashSet<>();

    public TecnicoTO(Tecnico obj) {
        super();
        this.id = obj.getId();
        this.name = obj.getName();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.password = obj.getPassword();

//        this.perfil = obj.getPerfil().stream()
//                .map(x -> x.getCodigo()).collect();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(Set<Perfil> perfil) {
        this.perfil = perfil;
    }
}
