package edu.fatec.lp2.exercicio1.Mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = conteudo.length();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        this.tamanho = conteudo.length();

        System.out.println("Mensagem enviada: " + conteudo);
        return this;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
