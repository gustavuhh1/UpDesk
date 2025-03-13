package com.aula.project.suporte.dominio;


import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa{

   @OneToMany(mappedBy = "usuario_id")
    private List<Chamados> chamados = new ArrayList<>();

   public Cliente(){
       super();
       addPerfil(Perfil.CLIENTE);
   }

    public Cliente(List<Chamados> chamados) {
        this.chamados = chamados;
    }

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }
}
