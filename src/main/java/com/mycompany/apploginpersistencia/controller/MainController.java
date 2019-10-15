
package com.mycompany.apploginpersistencia.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author celso.fontes
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        String mensagem = request.getParameter("mensagem");
        model.addAttribute("mensagem", mensagem);
        return "index";
    }
    
}
