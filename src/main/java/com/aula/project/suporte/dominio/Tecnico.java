package com.aula.project.suporte.dominio;

import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {

    @OneToMany(mappedBy = "tecnico")
    private List<Chamados> chamados = new ArrayList<>();

    public Tecnico(String cpf, String phone, String email, String name, String endereco, int id, List<Chamados> chamados) {
        super(cpf, phone, email, name, endereco, id);
        addPerfil(Perfil.CLIENTE);
    }

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }
}
