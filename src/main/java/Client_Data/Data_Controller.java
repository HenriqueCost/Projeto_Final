package Client_Data;

import Modelo_de_dados.Dados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dados_produto")
@SpringBootApplication
public class Data_Controller {

    @GetMapping
    public List<Dados> List(){
    }
    public static void main(String[] args){
        SpringApplication.run(Data_Controller.class, args);
    }
}
