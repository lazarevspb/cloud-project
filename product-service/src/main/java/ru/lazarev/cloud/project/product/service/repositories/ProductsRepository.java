package ru.lazarev.cloud.project.product.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lazarev.cloud.project.product.service.model.Product;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
}
