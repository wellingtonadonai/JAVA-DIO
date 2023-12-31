
public class Usuario {

    public static void main(String[] args) throws Exception {

        SistemaTv sistemaTv = new SistemaTv();

        sistemaTv.diminuirVolume();
        sistemaTv.diminuirVolume();
        sistemaTv.diminuirVolume();
        sistemaTv.aumentarVolume();

        System.out.println("Tv ligada? " + sistemaTv.ligada);
        System.out.println("Canal atual? :" + sistemaTv.canal);
        System.out.println("Volume atual? :" + sistemaTv.volume);

        sistemaTv.ligar();
        System.out.println("Novo status => Tv ligada? " + sistemaTv.ligada);

        





}

}
