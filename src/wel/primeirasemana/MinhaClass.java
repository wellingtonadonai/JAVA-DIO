package primeirasemana;

public class MinhaClass {

    public static void main(String[] args) {
        String primeiroNome = "gleison";

        String segundoNome = "Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }

}
