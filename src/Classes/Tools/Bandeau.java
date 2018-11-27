package Classes.Tools;

public class Bandeau {

    private static int nbbandeau = 5;
    private int mirrorbandau = nbbandeau;

    public void AjoutBandeau(){

        if (mirrorbandau < nbbandeau){mirrorbandau +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de bandeaux");
        }
    }

    public void RetraitBandeau(){

        if (mirrorbandau > 0){mirrorbandau -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de bandeaux");
        }
    }
}