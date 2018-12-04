package Classes.Tools;

public class Talkie {

    private final static int nbtalkie = 20;
    private static int mirrortalkie = nbtalkie;

    public void AjoutTalkie(){

        if (mirrortalkie < nbtalkie){mirrortalkie +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de talkies walkies");
        }
    }

    public void RetraitTalkie(){

        if (mirrortalkie > 0){mirrortalkie -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de talkies walkies");
        }
    }
}
