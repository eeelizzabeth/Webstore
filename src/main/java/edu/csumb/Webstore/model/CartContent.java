package edu.csumb.Webstore.model;

public class CartContent {
    String username;
    String password;
    Integer count;
    String productId;

    public CartContent(String username, String password, Integer count)
    {
        this.username = username;
        this.password = password;
        this.count = count;
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public Integer getCount() {return count;}
    public String getProductId() {return productId;}

    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
    public void setCount(Integer count) {this.count = count;}
    public void setProductId(String productId) {this.productId = productId;}
}