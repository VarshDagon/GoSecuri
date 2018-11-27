package Classes.Tools;

public class MetalDetector {

    private static int nbmetauxdetector = 25;
    private int mirrormetauxdetector = nbmetauxdetector;

    public void AjoutMetauxDetector(){

        if (mirrormetauxdetector < nbmetauxdetector){mirrormetauxdetector +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de détecteur de métaux");
        }
    }

    public void RetraitMetauxDetector(){

        if (mirrormetauxdetector > 0){mirrormetauxdetector -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de détecteur de métaux");
        }
    }
}
