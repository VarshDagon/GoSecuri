package Classes.Tools;

public class Kevlar {

    private static int nbkevlar = 12;
    private int mirrorkevlar = nbkevlar;

    public void AjoutKevlar(){

        if (mirrorkevlar < nbkevlar){mirrorkevlar +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de kevlar");
        }
    }

    public void RetraitKevlar(){

        if (mirrorkevlar > 0){mirrorkevlar -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de kevlar");
        }
    }
}
