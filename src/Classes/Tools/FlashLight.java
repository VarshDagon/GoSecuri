package Classes.Tools;

public class FlashLight {

    private static int nbflashlight = 5;
    private int mirrorflashlight = nbflashlight;

    public void AjoutFlashLight(){

        if (mirrorflashlight < nbflashlight){mirrorflashlight +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de lampes à huile");
        }
    }

    public void RetraitFlashLight(){

        if (mirrorflashlight > 0){mirrorflashlight -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de lampe à huile");
        }
    }
}
