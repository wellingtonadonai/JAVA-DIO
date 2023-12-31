public class SistemaTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void mudarCanal (int novoCanal){
    canal = novoCanal;
}

public void aumentarCanal(){
    canal++;
    System.out.println("trocando canal para:" + canal);

}

public void diminuirCanal(){
    canal--;
}

public void aumentarVolume(){
    volume++;
}

public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para:" + volume);
}


public void ligar(){
    ligada=true;
}
public void desligar(){
    ligada=false;
}

}