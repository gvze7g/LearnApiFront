package IntegracionBackFront.backfront.Controller.Products;

import IntegracionBackFront.backfront.Services.Products.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductoController {

    @Autowired
    private ProductoService service;
}
