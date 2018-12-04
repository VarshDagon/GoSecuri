package Classes.Tools;

public class SecurityArm {

    private final static int nbsecurebrassard = 30;
    private static int mirrorsecurebrassard = nbsecurebrassard;

    public void AjoutSecureBrassard(){

        if (mirrorsecurebrassard < nbsecurebrassard){mirrorsecurebrassard +=1;}

        else{
            System.out.println("Erreur sur le nombre maximum de brassards de sécurité");
        }
    }

    public void RetraitSecureBrassard(){

        if (mirrorsecurebrassard > 0){mirrorsecurebrassard -=1;}
        else{
            System.out.println("Erreur sur le nombre minimum de brassards de sécurité");
        }
    }
}
