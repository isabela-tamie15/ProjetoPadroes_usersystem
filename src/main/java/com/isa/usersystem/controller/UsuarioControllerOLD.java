/*
package com.isa.usersystem.controller;

import com.isa.usersystem.model.Usuario;
import com.isa.usersystem.service.UsuarioService;
import org.springframework.http.HttpStatus; //usa esse ou 404 no status de deletar
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/usuarios") //nome da lista
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // 2 métodos novos para exibir a index e o formulário cadastrar

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        return "index";
    }

    @GetMapping("/form")
    public String mostrarFormulario() {
        return "formulariocadastrar";
    }


    //Os 3 métodos devem constar nas classes Repository, Service e Controller para funcionarem corretamente

    @PostMapping("/add")
    public ResponseEntity<String> cadastrarUsuario(
            @RequestParam String nome,
            @RequestParam String cpf,
            @RequestParam String tipo,
            @RequestParam String telefone,
            @RequestParam(required = false) String email
    ) {
        String resposta = usuarioService.cadastrarUsuario(nome, cpf, tipo, telefone, email);
        return ResponseEntity.ok(resposta);
    } //ANTIGO

    @PostMapping("/add")
    public String cadastrarUsuario(
            @RequestParam String nome,
            @RequestParam String cpf,
            @RequestParam String tipo,
            @RequestParam String telefone,
            @RequestParam(required = false) String email
    ) {
        usuarioService.cadastrarUsuario(nome, cpf, tipo, telefone, email);
        return "redirect:/usuarios";
    } //sugestão deep seek


    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> consultarTodos() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @DeleteMapping("/del/{cpf}")
    public ResponseEntity<String> deletarUsuario(@PathVariable String cpf) {
        boolean removido = usuarioService.deletarUsuario(cpf);
        if (removido) {
            return ResponseEntity.ok("Usuário deletado com sucesso.");
        } else {
            return ResponseEntity.status(404).body("Usuário não encontrado.");
        }
    } //no parâmetro do status pode ser (HttpStatus.NOT_FOUND) ou (404), ambos deletam
}

//@PathVariable permite que o valor 33344433344 (cpf) da URL seja capturado e passado para o metodo como argumento

//controller chama service que chama repository (assim não viola o mvc)

 */