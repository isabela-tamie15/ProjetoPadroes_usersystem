package com.isa.usersystem.controller.dto;
//crio o pacote DTO dentro da controller para facilitar o recebimento de dados dos metodos das controller

public class UsuarioDTO {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public String getCpf() { //Cpf minúsculo dá menos erro no thymeleaf, e já cria getters e setters automático
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    //precisei de sets também para não dar erro no thymeleaf
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
