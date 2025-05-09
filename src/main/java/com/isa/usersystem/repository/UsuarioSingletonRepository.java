package com.isa.usersystem.repository;

import com.isa.usersystem.model.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsuarioSingletonRepository {

    private static UsuarioSingletonRepository instancia;
    private List<Usuario> usuarios = new ArrayList<>();

    private UsuarioSingletonRepository(){

    }

    public static UsuarioSingletonRepository getInstance() {
        if (instancia == null) {
            instancia = new UsuarioSingletonRepository(); //criar um objeto
        }
        return instancia;
    } //Padrão Singleton acaba aqui

    //Os 3 métodos devem constar nas classes Repository, Service e Controller para funcionarem corretamente
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return Collections.unmodifiableList(usuarios);
    }

    public boolean deletarUsuarioPorCPF(String cpf) {
        return usuarios.removeIf(usuario -> usuario.getCpf().equals(cpf));
    }

}

/* EXPLICANDO A FUNÇÃO LAMBDA DO DELETAR
 return usuarios.removeIf(usuario -> usuario.getCpf().equals(cpf));

 usuarios é a lista de objetos do tipo Usuario
 -> é o lambda, que define a condição de remoção
 removeIf(...) espera uma função que receba 1 elemento e retorne true ou false
 "Para cada usuario da lista, remova se o usuario.getCpf() for igual ao cpf informado"
*/

//controller chama service que chama repository (assim não viola o mvc)