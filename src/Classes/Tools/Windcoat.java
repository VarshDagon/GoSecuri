package Classes.Tools;

public class Windcoat {

    private static int nbwindcoat = 30;
    private int mirrorwindcoat = nbwindcoat;

    public void AjoutWindCoat(){

        if (mirrorwindcoat < nbwindcoat){mirrorwindcoat +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de coupe-vent");
        }
    }

    public void RetraitWindCoat(){

        if (mirrorwindcoat > 0){mirrorwindcoat -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de coupe-vent");
        }
    }
}
