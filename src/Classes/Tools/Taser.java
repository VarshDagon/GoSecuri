package Classes.Tools;

public class Taser {

    private final static int nbtaser = 5;
    private static int mirrortaser = nbtaser;

    public void AjoutTaser(){

        if (mirrortaser < nbtaser){mirrortaser +=1;}
        else{
            System.out.println("Erreur sur le nombre maximum de tasers");
        }
    }

    public void RetraitTaser(){

        if (mirrortaser > 0){mirrortaser -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de tasers");
        }
    }
}
