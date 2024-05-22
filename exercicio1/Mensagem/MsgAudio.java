package edu.fatec.lp2.exercicio1.Mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgAudio extends Mensagem {

    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, int duracao) {
        super(destinatario, horaEnvio, ""); // Conteudo vazio para áudio
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {

        System.out.println("Mensagem de áudio enviada.");
        return this;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
