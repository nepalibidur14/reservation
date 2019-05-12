package com.flight.reservation.Controller;

import com.flight.reservation.entities.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.flight.reservation.repos.UserRepository;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("showReg")
    public String showRegPage()
    {
        return "login/registerUser";
    }

    @RequestMapping("login")
    public String showLoginPage()
    {
        return "login/login";
    }

    @RequestMapping(value = "registerUser", method=RequestMethod.POST)
    public String saveUser(@ModelAttribute("userModel") userModel user)
    {
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping(value = "login" ,method= RequestMethod.POST)
    public String login(@RequestParam("email")String email, @RequestParam("password")String password, ModelMap modelMap)
    {
      userModel user=userRepository.findByEmail(email);
      if (user.getPassword().equals(password))
      {
          return "findFlight";
      }
      else
      {
          modelMap.addAttribute("msg","invalid details");
      }
      return "login/login";
    }
}
