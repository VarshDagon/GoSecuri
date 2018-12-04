package Classes.Pointage;

import Classes.Inventory;
import Classes.Tools.*;

public class Arrivee extends Inventory {

    void compteur (boolean boolmousquetons,boolean boolgantinter,boolean boolceintureTactiques,boolean boolmetauxdetector,boolean boolsecureBrassards,
                   boolean boolflashlight,boolean boolbandeaux,boolean boolkevlar,boolean boolchemises,boolean boolblousons,boolean boolwindcoat,
                   boolean booltalkies,boolean booloreillettes,boolean booltasers){

        if (boolmousquetons){
            Mousquetons mousquetons = new Mousquetons();
            mousquetons.RetraitMousqueton();
        }

        if (boolgantinter){
            GantIntervention gantintervention = new GantIntervention();
            gantintervention.RetraitGant();
        }

        if (boolceintureTactiques){
            CeintureIntervention ceintureIntervention = new CeintureIntervention();
            ceintureIntervention.RetraitCeinture();
        }

        if (boolmetauxdetector){
            MetalDetector metalDetector = new MetalDetector();
            metalDetector.RetraitMetauxDetector();
        }

        if (boolsecureBrassards) {
            SecurityArm brassardSecu = new SecurityArm();
            brassardSecu.RetraitSecureBrassard();
        }

        if (boolflashlight){
            FlashLight flashLight = new FlashLight();
            flashLight.RetraitFlashLight();
        }

        if (boolbandeaux){
            Bandeau bandeau = new Bandeau();
            bandeau.RetraitBandeau();
        }

        if (boolkevlar){
            Kevlar kevlar = new Kevlar();
            kevlar.RetraitKevlar();
        }

        if (boolchemises){
            Chemises chemise = new Chemises();
            chemise.RetraitChemise();
        }

        if (boolblousons){
            Blouson blouson = new Blouson();
            blouson.RetraitBlouson();
        }

        if (boolwindcoat){
            Windcoat windcoat = new Windcoat();
            windcoat.RetraitWindCoat();
        }

        if (booltalkies){
            Talkie talkie = new Talkie();
            talkie.RetraitTalkie();
        }

        if (booloreillettes){
            Oreillette oreillette = new Oreillette();
            oreillette.RetraitOreillette();
        }

        if (booltasers){
            Taser taser = new Taser();
            taser.RetraitTaser();
        }
    }
}
