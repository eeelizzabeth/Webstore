//This is your model. This file should only contain getters and setters, along with the variables your struct uses.
//DONT FORGET THE CONSTRUCTOR! Getters and setters must be setup to match the name exactly
//or else you will have many errors.
package edu.csumb.Webstore.model;
import java.util.HashMap;

public class User {
  //@Id
  private String username; //id
  private String password;
  private HashMap<String, Integer> proItems;
  //     (Product Id, number of items of that product)

  public User(String username, String password) {
    this.username = username;
    this.password = password;
    this.proItems = new HashMap<String, Integer>();
  }
  public User(String username, String password, HashMap<String, Integer> numItems) {
    this.username = username;
    this.password = password;
    this.proItems = numItems;
  }

  public String getUsername() {return this.username;}
  public String getPassword() {return this.password;}
  public HashMap<String, Integer> getNumItems() {return this.proItems;}

  public void setUsername(String username) {this.username = username;}
  public void setPassword(String password) {this.password = password;}
  public void setNumItems(String id, Integer num) {
    proItems.put(id, num);
  }
  public HashMap<String, Integer> copyCheckout() {
    HashMap<String, Integer> copy = proItems;
    this.proItems = new HashMap<String, Integer> ();
    return copy;
  }

}
