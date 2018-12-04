package Classes.Tools;

public class GantIntervention {

    private final static int nbgantinter = 10;
    private static int mirrorgatinter = nbgantinter;

    public void AjoutGant(){

        if (mirrorgatinter < nbgantinter){mirrorgatinter +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de gants d'intervention chirurgicale");
        }
    }

    public void RetraitGant(){

        if (mirrorgatinter > 0){mirrorgatinter -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de gants d'intervention chirurgicale");
        }
    }
}
