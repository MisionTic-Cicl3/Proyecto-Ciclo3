package com.proyecto.mintic.controller;

import com.proyecto.mintic.service.EmpresaService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class vistaEmpresa {

EmpresaService service;

    public vistaEmpresa(EmpresaService service) {
        this.service = service;
    }
@GetMapping("/")
public String index(Model model, @AuthenticationPrincipal OidcUser principal){
    return "index";
}




}
