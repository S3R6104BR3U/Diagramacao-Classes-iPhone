package aplicativos;


public class AparelhoTelefonico {
    private String contato1;
    private String contato2;

    public AparelhoTelefonico(String contato1, String contato2) {
        this.contato1 = contato1;
        this.contato2 = contato2;
    }

    public String getContato1() {
        return contato1;
    }

    public String getContato2() {
        return contato2;
    }

    public void ligar(String contato) {
        System.out.println("Ligando para: " + contato);
    }

    public void atender() {
        System.out.println("Ligação Atendida");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
