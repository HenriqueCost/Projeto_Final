package Client_Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados_produto")
public class Data_Controller {

    @GetMapping
    public String hello(){
        return "hello, world";
    }
}
