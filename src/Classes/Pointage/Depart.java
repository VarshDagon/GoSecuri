package Classes.Pointage;

import Classes.Inventory;
import Classes.Tools.*;

public class Depart extends Inventory {

    void compteur (boolean boolmousquetons,boolean boolgantinter,boolean boolceintureTactiques,boolean boolmetauxdetector,boolean boolsecureBrassards,
                   boolean boolflashlight,boolean boolbandeaux,boolean boolkevlar,boolean boolchemises,boolean boolblousons,boolean boolwindcoat,
                   boolean booltalkies,boolean booloreillettes,boolean booltasers){

        if (boolmousquetons){
            Mousquetons mousquetons = new Mousquetons();
            mousquetons.AjoutMousqueton();
        }

        if (boolgantinter){
            GantIntervention gantintervention = new GantIntervention();
            gantintervention.AjoutGant();
        }

        if (boolceintureTactiques){
            CeintureIntervention ceintureIntervention = new CeintureIntervention();
            ceintureIntervention.AjoutCeinture();
        }

        if (boolmetauxdetector){
            MetalDetector metalDetector = new MetalDetector();
            metalDetector.AjoutMetauxDetector();
        }

        if (boolsecureBrassards) {
            SecurityArm brassardSecu = new SecurityArm();
            brassardSecu.AjoutSecureBrassard();
        }

        if (boolflashlight){
            FlashLight flashLight = new FlashLight();
            flashLight.AjoutFlashLight();
        }

        if (boolbandeaux){
            Bandeau bandeau = new Bandeau();
            bandeau.AjoutBandeau();
        }

        if (boolkevlar){
            Kevlar kevlar = new Kevlar();
            kevlar.AjoutKevlar();
        }

        if (boolchemises){
            Chemises chemise = new Chemises();
            chemise.AjoutChemises();
        }

        if (boolblousons){
            Blouson blouson = new Blouson();
            blouson.AjoutBlouson();
        }

        if (boolwindcoat){
            Windcoat windcoat = new Windcoat();
            windcoat.AjoutWindCoat();
        }

        if (booltalkies){
            Talkie talkie = new Talkie();
            talkie.AjoutTalkie();
        }

        if (booloreillettes){
            Oreillette oreillette = new Oreillette();
            oreillette.AjoutOreillette();
        }

        if (booltasers){
            Taser taser = new Taser();
            taser.AjoutTaser();
        }
    }
}