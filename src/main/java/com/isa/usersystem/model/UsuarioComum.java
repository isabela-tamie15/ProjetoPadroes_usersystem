package com.isa.usersystem.model;

public class UsuarioComum implements Usuario {

    //Declaração dos atributos COMUM
    private String nome;
    private String cpf;
    private String telefone;
    private String email; //opcional por conta do builder

    //Construtor COMUM
    public UsuarioComum(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    //Implementação dos 5 metodos da interface Usuario apenas
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getTipo() {
        return "COMUM"; //não retorna variável pois seu valor é imutável para todos COMUMs, um return de String basta
    }                   //não precisa de set

    @Override //@Override para comprovar que o metodo vem da superclasse, no caso a interface Usuario
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
