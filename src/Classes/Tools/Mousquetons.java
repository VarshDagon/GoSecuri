package Classes.Tools;

public class Mousquetons {

    private static int nbmousqueton = 15;
    private int mirrormousqueton = nbmousqueton;

    public void AjoutMousqueton(){

        if (mirrormousqueton < nbmousqueton){mirrormousqueton +=1;}

        else(){
            System.out.println("Erreur sur le nombre maximum de mousquetaires");
        }
    }

    public void RetraitMousqueton(){

        if (mirrormousqueton > 0){mirrormousqueton -=1;}
        else(){
            System.out.println("Erreur sur le nombre minimum de mousquetaires");
        }
    }
}
