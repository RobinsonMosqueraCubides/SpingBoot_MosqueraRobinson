package controller;
import model.Product;
import service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class hola {
    @GetMapping
    public String testEndpoint() {
        return "Test endpoint is working!";
    }
}
