//This is your model. This file should only contain getters and setters, along with the variables your struct uses.
//DONT FORGET THE CONSTRUCTOR! Getters and setters must be setup to match the name exactly
//or else you will have many errors.
package edu.csumb.Webstore.model;


public class Product
{
    private String id;
    private String name;
    private String description;
    private String imageURL;
    private Double price;
    private Integer stock;


    public Product(String id, String name, String description, String imageURL, Double price, Integer stock) {
      this.id = id;
      this.name = name;
      this.description = description;
      this.imageURL = imageURL;
      this.price = price;
      this.stock = stock;
    }

    public String getId() { return this.id; }
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public String getImageURL() { return this.imageURL; }
    public Double getPrice() { return this.price; }
    public Integer getStock() { return this.stock; }

    public void setId(String id) {this.id = id; }
    public void setName(String name) {this.name = name; }
    public void setDescription(String description) {this.description = description; }
    public void setImageURL(String imageURL) {this.imageURL = imageURL; }
    public void setPrice(Double price) {this.price = price; }
    public void setStock(Integer stock) {this.stock = stock; }

    public void changeStock(int s) {
      this.stock += s;
    }

}
