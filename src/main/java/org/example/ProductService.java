package org.example;

public class ProductService implements ProductRepository{
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @Override
    public void findAllProducts(){
        productRepository.findAllProducts();
    };
}
