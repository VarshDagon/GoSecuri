package Classes.Tools;

public class GantIntervention {

    private static int nbgantinter = 10;
    private int mirrorgatinter = nbgantinter;

    public void AjoutGant(){

        if (mirrorgatinter < nbgantinter){mirrorgatinter +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de gants d'intervention chirurgicale");
        }
    }

    public void RetraitGant(){

        if (mirrorgatinter > 0){mirrorgatinter -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de gants d'intervention chirurgicale");
        }
    }
}
