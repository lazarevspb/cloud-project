package ru.lazarev.cloud.project.product.service.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.lazarev.cloud.project.product.service.model.Product;
import ru.lazarev.cloud.project.product.service.services.ProductsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:12000")
public class ProductsController {
    private final ProductsService productsService;

    @GetMapping
    public List<Product> findAll() {
        return  productsService.findAll();
    }
}
