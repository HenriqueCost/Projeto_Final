package Modelo_de_dados;

import Client_Data.Data_Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dados {
    private Long id;
    private String nome;

    public static void main(String[] args){
        SpringApplication.run(Dados.class, args);
    }
}
}

