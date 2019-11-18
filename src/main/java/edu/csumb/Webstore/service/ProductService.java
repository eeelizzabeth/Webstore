//The service file is where the heavy lifting is done.
//You will do all logic, all database access(Special database operations defined in the repository).
//Basically all your actual code is here!
package edu.csumb.Webstore.service;

// import java.util.ArrayList;
// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.Webstore.model.Product;
import edu.csumb.Webstore.repositories.ProductRepository;

//Remember to annotate what type of class this is!
@Service
public class ProductService
{
    //We need to autowire the database here. If you are stuck, look at ProductController!
    @Autowired
    ProductRepository productRespository;


    public Iterable<Product> getAllProducts()
    {
        return productRespository.findAll();
    }

    public Product getProductByID(String id)
    {
        return productRespository.findById(id).get();
    }

    public void addProduct(Product p)
    {
        productRespository.insert(p);
    }

    // public void updateProduct(Product p, Interger num)
    // {
    //     productRespository.
    // }

}
