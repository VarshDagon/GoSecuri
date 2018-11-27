package Classes.Tools;

public class Chemises {

    private static int nbchemise = 30;
    private int mirrorchemise = nbchemise;

    public void AjoutChemises(){

        if (mirrorchemise < nbchemise){mirrorchemise +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de chemises");
        }
    }

    public void RetraitChemise(){

        if (mirrorchemise > 0){mirrorchemise -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de chemises");
        }
    }
}
