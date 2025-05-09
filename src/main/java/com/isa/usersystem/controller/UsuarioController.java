package com.isa.usersystem.controller;

import com.isa.usersystem.controller.dto.UsuarioDTO;
import com.isa.usersystem.model.Usuario;
import com.isa.usersystem.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Não usar o RestController para conseguir usar o thymeleaf, e porque o frontend não é separado do beckend
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Listagem
    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        return "index";
    }

    // Formulário de cadastro
    @GetMapping("/cadastrar") //Aciona esse metodo ao apertar o botão Cadastrar Novo
    public String mostrarFormulario(Model model) {
        return "formulariocadastrar"; //não tem a linha modelAttribute pois não apresenta dados do backend para o frontend
    }

    // Processamento do cadastro
    @PostMapping("/cadastrar")         //parâmetro DTO facilita manipular dados entre diferentes pacotes, evitei o problema de Usuario ser interface ou classe abstrata
    public String processarFormulario(@ModelAttribute UsuarioDTO usuarioDTO) {
        usuarioService.cadastrarUsuario(
                usuarioDTO.getNome(),
                usuarioDTO.getCpf(),
                usuarioDTO.getTipo(),
                usuarioDTO.getTelefone(),
                usuarioDTO.getEmail()
        );
        return "redirect:/usuarios"; // Redirecionamento garantido
    }

    // Exclusão
    @PostMapping("/deletar/{cpf}")
    public String deletarUsuario(@PathVariable String cpf) {
        usuarioService.deletarUsuario(cpf);
        return "redirect:/usuarios";
    }
}