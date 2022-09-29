package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.service.EmpresaService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

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

    @GetMapping("/Empresas")
    public String prueba(Model model){
        List<EmpresaEntity> lista=this.service.listarEmpresas();
        model.addAttribute("lista",lista);
        return "Libros";
    }

    @GetMapping("/formEmpresa")
    public String mostrarFormulario(Model model){
        model.addAttribute("empresa",new EmpresaEntity());
        return "registrarEmpresa";
    }

    @PostMapping("/RegistrarLibro")
    public String agregarEmpresa(@ModelAttribute("empresa") EmpresaEntity empresa, Model model, RedirectAttributes attributes){
        if(service.agregarEmpresa(empresa)) {
            attributes.addFlashAttribute("mensajeOk","Empresa registrada exitosamente.");
        }else{
            attributes.addFlashAttribute("error","Error, la empresa no se registro.");
        }
        return "redirect:/Empresas";
    }

    @GetMapping("/editarEmpresa/{id}")
    public String pasarEmpresa(@PathVariable("id") long id, Model model){
        model.addAttribute("libro",service.buscarEmpresa1(id));
        return "editarEmpresa";
    }

    @GetMapping("/eliminarEmpresa/{id}")
    public String eliminarEmpresa(@PathVariable("id") Long id,Model model){
        service.eliminarEmpresa(id);
        return "redirect:/Empresas";
    }

    @PostMapping("/guardarEditado/{id}")
    public String actualizarEmpresa(@PathVariable("id") Long id, @ModelAttribute("empresa") EmpresaEntity empresa,Model model){
        EmpresaEntity emp=service.buscarEmpresa1(id);
        emp.setName(empresa.getName());
        emp.setId(empresa.getId());
        emp.setDocument(empresa.getDocument());
        emp.setAddress(empresa.getAddress());
        emp.setPhone(empresa.getPhone());
        service.actualizarEmpresa(emp);
        return "redirect:/Empresas";
    }
}
