import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {

        usarReprodutorMusical();

        System.out.println("===================");

        usarAparelhoTelefonico();

        System.out.println("===================");

        usarNavegadorInternet();

    }

    public static void usarReprodutorMusical() {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionar();
        reprodutorMusical.tocar();
        reprodutorMusical.aumentarVolume();
        reprodutorMusical.diminuirVolume();
        reprodutorMusical.pausar();
        reprodutorMusical.diminuirVolume();

        for (int cont = 1 ; cont <= 6 ; cont ++) {
            reprodutorMusical.aumentarVolume();
        }
    }

    public static void usarAparelhoTelefonico() {
        AparelhoTelefonico telefone = new AparelhoTelefonico("9999999999", "8888888888");

        telefone.ligar(telefone.getContato1());
        telefone.ligar(telefone.getContato2());
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
    }

    public static void usarNavegadorInternet() {
        NavegadorInternet navegador = new NavegadorInternet("dio.me");

        navegador.exibirPagina(navegador.getUrl());
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }



}
