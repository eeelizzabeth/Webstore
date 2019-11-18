//The controller file determines where someone can access your service.
//The controller shouldn't be doing any logic, and you should NEVER import the database into controller.
//Use the service for any logic, or even one line functions. 99 % of the time, the controller should only have
//the return statement, and nothing else!

package edu.csumb.Webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.Webstore.model.User;
import edu.csumb.Webstore.service.UserService;
import io.swagger.annotations.ApiOperation;
import edu.csumb.Webstore.model.CartContent;

@RestController
public class UserController
{

    //This is autowiring(Telling spring to just connect to the dang service automatically) for us.
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST, value="/users/add")
    @ApiOperation(value = "Add new user to the database!")
    public void addUser(@RequestBody User u)
    {
        userService.addUser(u);
    }

    // @RequestMapping(method = RequestMethod.POST, value="/auth/checkAuth")
    // @ApiOperation(value = "Authenticate the username and password!")
    // public Boolean checkAuth(@RequestBody User user)
    // {
    //     return userService.checkAuth(user.getUsername(), user.getPassword());
    // }

    // @RequestMapping(method = RequestMethod.POST, value = "/users/addProduct")
    // @ApiOperation(value = "Add to product and quantity to user cart!")
    // public void addToCart(@RequestBody CartContent cartContent)
    // {
    //     userService.addItem(cartContent.getUsername(), cartContent.getProductId(), cartContent.getCount());
    // }

    // @RequestMapping(method = RequestMethod.PUT, value = "/changeQuantity")
    // public void changeQuantity(@RequestBody CartContent cartContent) 
    // {
    //     userService.changeNumItems(cartContent.getUsername(), cartContent.getProductId(), cartContent.getCount());
    // }

}
