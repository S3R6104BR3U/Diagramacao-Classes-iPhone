package aplicativos;
public class NavegadorInternet {
    private String url;

    public NavegadorInternet(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: Url - " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }
}
