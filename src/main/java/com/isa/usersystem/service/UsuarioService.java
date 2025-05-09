package com.isa.usersystem.service;

import com.isa.usersystem.model.*;
import com.isa.usersystem.repository.UsuarioSingletonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    //Os 3 métodos devem constar nas classes Repository, Service e Controller para funcionarem corretamente
    public String cadastrarUsuario(String nome, String cpf, String tipo, String telefone, String email) {
        UsuarioBuilder builder = new UsuarioBuilder()
                .setNome(nome)
                .setCpf(cpf)
                .setTelefone(telefone)
                .setEmail(email);

        UsuarioFactory factory;
        if ("COMUM".equalsIgnoreCase(tipo)) {
            factory = new UsuarioComumFactory();
        } else {
            factory = new UsuarioAdministradorFactory();
        }

        Usuario usuario = factory.criarUsuario(builder);
        UsuarioSingletonRepository.getInstance().adicionarUsuario(usuario);

        return "Usuário cadastrado com sucesso!";
    }

    public List<Usuario> listarUsuarios() {
        return UsuarioSingletonRepository.getInstance().listarUsuarios();
    }

    public boolean deletarUsuario(String cpf) {
        return UsuarioSingletonRepository.getInstance().deletarUsuarioPorCPF(cpf);
    }
}

//controller chama service que chama repository (assim não viola o mvc)