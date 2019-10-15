
package com.mycompany.apploginpersistencia.controller;


import com.mycompany.apploginpersistencia.dao.LoginRepository;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.mycompany.apploginpersistencia.modelo.Login;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {
    
    
    private LoginRepository repository;
    
    public LoginController(LoginRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/usuario")
public String index(Model model) {
     List<Login> logins = this.repository.findAll();
        
        model.addAttribute("logins",logins);
        return "/usuario/index";
    }

@RequestMapping("/usuario/inserir")
    public String inserir(Model model){
        Login login = new Login();
        model.addAttribute("login", login);
        return "/usuario/inserir";
    }
    
    @RequestMapping(value = "/usuario/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("login") Login login, @RequestParam ("email") String email,
            BindingResult result,
            ModelMap model){
        
         List<Login> logins = this.repository.findAll();
        for(Login list: logins){
            if(list.getEmail().equals(email)){
                return "redirect:../?mensagem="+" Usuário cadastrado!! ";
            }
        }         
        
        
        model.addAttribute("logins", this.repository.findAll());
        model.addAttribute("mensagem", "Salvo com sucesso !");
        
        return "index";
       
    }   
    
    
}
