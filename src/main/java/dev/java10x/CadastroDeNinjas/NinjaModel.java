package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do DB
// Table com parametro nome ="" cria um nome para tabale
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // Spring entender que vamos usar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria strategia de camo gerar os id
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
