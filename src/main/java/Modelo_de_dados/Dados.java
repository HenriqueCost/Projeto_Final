package Modelo_de_dados;

import Client_Data.Data_Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Objects;

@SpringBootApplication
@Entity
public class Dados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Dados dados = (Dados) obj;
            return getId().equals(dados.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public static void main(String[] args){
        SpringApplication.run(Dados.class, args);
    }
}


