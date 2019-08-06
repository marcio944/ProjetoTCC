package com.aplicativo.lenovouser.meuaplicativo.Models;

public class PontuacaoModel {

    private String idPontuacao;
    private String topico;
    private int pontos;

    public String getIdPontuacao() {
        return idPontuacao;
    }

    public void setIdPontuacao(String idPontuacao) {
        this.idPontuacao = idPontuacao;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
