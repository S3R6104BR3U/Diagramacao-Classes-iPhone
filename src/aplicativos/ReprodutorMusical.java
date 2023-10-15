package aplicativos;
public class ReprodutorMusical {
    private int volume = 0;

    public void selecionar() {
        System.out.println("Música ou Filme selecionado");
    }

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausado");
    }

    public void aumentarVolume() {
        if (volume == 5 ) {
            System.out.println("Volume Maximo");   
        } else {
            System.out.println("Volume: " + ++volume);
        }
        
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println("Volume Minimo");
        } else {
            System.out.println("Volume: " + --volume);
        }
        
    }

    
}
