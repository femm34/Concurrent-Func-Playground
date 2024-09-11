package org.example;

public class mySQLRepository implements ProductRepository {
    @Override
    public void findAllProducts() {
        System.out.println("All products found");
    }
}
