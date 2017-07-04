package cz.jcu.uai.javapract;

import cz.jcu.uai.javapract.Comparator;
import cz.jcu.uai.javapract.GUI;
import cz.jcu.uai.javapract.Parser;
import cz.jcu.uai.javapract.Stag;

/**
 * Created by Drml on 4.7.2017.
 */
public class Controler {

    private Stag stag;
    private Parser $parser;
    private Comparator $comparator;
    private GUI $gui;

    private String fileLocation;

    public Controler(Stag stag, Parser $parser, Comparator $comparator, GUI $gui, String fileLocation)
    {
        this.stag = stag;
        this.$parser = $parser;
        this.$comparator = $comparator;
        this.$gui = $gui;
        this.fileLocation = fileLocation;
    }

    public void run(){
        // TODO: implement
    }
}
