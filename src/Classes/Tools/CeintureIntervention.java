package Classes.Tools;

public class CeintureIntervention {

    private static int nbceintureTactique = 20;
    private int mirrorceintureTactique = nbceintureTactique;

    public void AjoutCeinture(){

        if (mirrorceintureTactique < nbceintureTactique){mirrorceintureTactique +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de ceintures tactiques");
        }
    }

    public void RetraitCeinture(){

        if (mirrorceintureTactique > 0){mirrorceintureTactique -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de ceintures tactiques");
        }
    }
}
