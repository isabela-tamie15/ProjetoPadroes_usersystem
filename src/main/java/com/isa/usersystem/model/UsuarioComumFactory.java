package com.isa.usersystem.model;

//Essa classe herda de UsuarioFactory para implementar o metodo que lá é abstract
public class UsuarioComumFactory extends UsuarioFactory {

    //Essa é a estrutura completa do Factory, o new precisa estar dentro do metodo
    public Usuario criarUsuario(UsuarioBuilder builder) {
        return new UsuarioComum(
                builder.getNome(),
                builder.getCpf(),
                builder.getTelefone(),
                builder.getEmail()
        ); //parâmetros builder dentro do metodo da classe factory
    }
}

//setters builder ficam na classe Builder (UsuarioBuilder)
//getters builder ficam na classe Factory (UsuarioAdministradorFactory e UsuarioComumFactory)

