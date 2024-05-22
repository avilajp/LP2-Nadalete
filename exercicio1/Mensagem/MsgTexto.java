package edu.fatec.lp2.exercicio1.Mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = conteudo.length(); // Inicializa numChar com o comprimento do conteúdo
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        this.numChar = conteudo.length();

        System.out.println("Mensagem enviada: " + conteudo);
        return this;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
