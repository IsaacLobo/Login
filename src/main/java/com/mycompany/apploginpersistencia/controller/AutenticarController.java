
package com.mycompany.apploginpersistencia.controller;

import com.mycompany.apploginpersistencia.dao.LoginRepository;
import com.mycompany.apploginpersistencia.modelo.Login;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutenticarController {
      private LoginRepository repository;
    Login login;
public AutenticarController(LoginRepository repository) {
    this.repository = repository;
}
    @RequestMapping(value = "usuario/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            ModelMap modelMap) {        
         List<Login> logins = this.repository.findAll();
        for(Login list: logins){
            if(list.getEmail().equalsIgnoreCase(username)&& list.getSenha().equalsIgnoreCase(password)){
                session.setAttribute("username", username);
                return "usuario/sucesso";
            }            
        
       
        }
        return "redirect:../?mensagem="+" Login Inválido!! ";
}
}
