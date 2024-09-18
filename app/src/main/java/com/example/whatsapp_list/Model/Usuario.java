package com.example.whatsapp_list.Model;

public class Usuario {
    private int foto;
    private String nome;
    private String mensagem;

    public Usuario(int foto, String mensagem, String nome) {
        this.foto = foto;
        this.mensagem = mensagem;
        this.nome = nome;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
