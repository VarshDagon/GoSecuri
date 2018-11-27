package Classes.Tools;

public class Blouson {

    private static int nbblouson = 30;
    private int mirrorblouson = nbblouson;

    public void AjoutBlouson(){

        if (mirrorblouson < nbblouson){mirrorblouson +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de blousons");
        }
    }

    public void RetraitBlouson(){

        if (mirrorblouson > 0){mirrorblouson -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de blousons");
        }
    }
}
