package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Set;
import java.util.HastSet;

@Entity
@Table(name="plataformas")

public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @ManyToMany(mappedBy = "plataformas") // Um para muitos / nome do relacionamento
    private Set<Jogo> jogos = new HastSet<> (); // Colocando coisas na classe Jogo, transformando em objeto

    public Set<Jogo> getJogos() {
        return jogos;
    }
    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
 
}
