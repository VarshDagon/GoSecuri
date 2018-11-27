package Classes.Tools;

public class Oreillette {

    private static int nboreillette = 10;
    private int mirrororeillette = nboreillette;

    public void AjoutOreillette(){

        if (mirrororeillette < nboreillette){mirrororeillette +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum d'oreillettes");
        }
    }

    public void RetraitOreillette(){

        if (mirrororeillette > 0){mirrororeillette -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum d'oreillettes");
        }
    }
}
