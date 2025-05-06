package com.priyanka.Backend.service;


import com.priyanka.Backend.model.Product;
import com.priyanka.Backend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    public Product getProductById(int id) {

        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return productRepo.save(product);
    }

    public Product addOrUpdateProduct(Product product, MultipartFile imageFile) throws IOException {

        return addProduct(product,imageFile);
    }

    public void deleteProduct(int id) {

        productRepo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {

        return productRepo.searchProduct(keyword);
    }
}
