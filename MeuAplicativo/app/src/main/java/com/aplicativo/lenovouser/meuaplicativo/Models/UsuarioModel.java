package com.aplicativo.lenovouser.meuaplicativo.Models;

public class UsuarioModel {

    private  String id;
    private String email;
    private String senha;
    private String email_senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail_senha() {
        return email_senha;
    }

    public void setEmail_senha(String email_senha) {
        this.email_senha = email_senha;
    }
}
