package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Mensagem.Mensagem;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem mensagem;

    public Whatsapp(Contatinho[] contatos) {
        this.contatos = contatos;
    }


    public void enviarMensagem(String horaEnvio, String conteudo, int destinatarioIndex) {
        if (destinatarioIndex >= 0 && destinatarioIndex < contatos.length) {
            Contatinho destinatario = contatos[destinatarioIndex];
            this.mensagem = new Mensagem(destinatario, horaEnvio, conteudo) {

                @Override
                public Mensagem sendMessage(String conteudo) {

                    System.out.println("Mensagem enviada para " + getDestinatario().getNome() + ": " + conteudo);
                    return this;
                }
            };

            this.mensagem.sendMessage(conteudo);
        } else {
            System.out.println("Destinatário não encontrado.");
        }
    }

}
