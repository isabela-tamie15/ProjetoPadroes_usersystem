package com.isa.usersystem.model;

public interface Usuario {

    //5 metodos a serem implementados nas classes concretas UsuarioComum e UsuarioAdministrador
    public String getNome();

    public String getCpf();

    public String getTipo();

    public String getTelefone();

    public String getEmail(); //opcional

}
