package GICCAFE.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomepageController {
    @GetMapping(path = "/giccafe/homepage")
   public Object obj(){
    return new ModelAndView("homepage");
   }
    
}
