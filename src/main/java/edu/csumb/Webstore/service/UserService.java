//The service file is where the heavy lifting is done.
//You will do all logic, all database access(Special database operations defined in the repository).
//Basically all your actual code is here!
package edu.csumb.Webstore.service;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.Webstore.model.User;
import edu.csumb.Webstore.repositories.UserRepository;

//Remember to annotate what type of class this is!
@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  ProductService productService;

  public void addUser(User u)
  {
    userRepository.insert(u);
  }

  public Boolean checkAuth(String userId, String password)
  {
    Iterable<User> users = userRepository.findAll();
    for(User u : users)
    {
      if(u.getUsername().equals(userId) && u.getPassword().equals(password))
      {
        return true;
      }
    }
    return false;
  }

  public User getUserID(String id)
  {
    return userRepository.findById(id).get();
  }

  public Iterable<User> getAllItems() 
  {
    return userRepository.findAll();
  }
  public void addItem(String id, String productId, Integer num) {
    User u = userRepository.findById(id).get();
    //HashMap<String, Integer> tempItems = u.getNumItems();
    if(u.getNumItems().containsKey(productId))
    {
      u.setNumItems(productId, u.getNumItems().get(productId)+num);
    } else {
      u.setNumItems(productId, num);
    }
  }
  public void changeNumItems(String id, String productId, Integer num)
  {
    User u = userRepository.findById(id).get();
    HashMap <String, Integer> tempCart = u.getNumItems();

    if(tempCart.get(productId) == 0)
    {
      tempCart.remove(productId);
    } else {
      tempCart.put(productId, num);
      userRepository.deleteById(id);
    }
  }
  // public void checkout(String userId) {
  //   User u = userRepository.findById(userId).get();

  //   HashMap<String, Integer> copyCart = u.copyCheckout();
    
  //   for(Map.Entry m: copyCart.entrySet())
  //   {
  //     String product = (String)m.getKey();
  //     Product p = productService.getProductByID(product);
  //     int numItems = (Integer)m.getValue();

  //     p.changeStock(m.getValue()*-1);

  //     productService.updateProduct(p);
  //   }
  // }




}
