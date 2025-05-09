package com.isa.usersystem.model;

public abstract class UsuarioFactory {

    public abstract Usuario criarUsuario(UsuarioBuilder builder);

}

//Exercício pediu classe factory abstrata com metodo abstrato criarUsuario
//Por isso, o metodo abstrato será implementado na 1a subclasse concreta,
//no caso, UsuarioAdministradorFactory e UsuarioComumFactory extends UsuarioFactory