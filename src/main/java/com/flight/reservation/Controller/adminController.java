package com.flight.reservation.Controller;



import com.flight.reservation.entities.adminModel;
import com.flight.reservation.repos.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class adminController {

    @Autowired
    AdminRepository adminRepository;

    @RequestMapping("/admin")
    public String admin()
    {
        return "admin";
    }

    @RequestMapping(value= "adminLogin", method = RequestMethod.POST)
    public String adminPanel(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap)
    {
        adminModel admin=adminRepository.findByEmail(email);
        if (admin.getPassword().equals(password))
        {
            return "adminpanel";
        }
        else
        {
            modelMap.addAttribute("msg","invalid details");
        }
        return "admin";
    }
}
