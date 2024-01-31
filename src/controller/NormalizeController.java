/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Normalize;
import view.NormalizeView;

/**
 *
 * @author ACER
 */
public class NormalizeController {
    private Normalize model;
    private NormalizeView view;

    public NormalizeController(Normalize model, NormalizeView view) {
        this.model = model;
        this.view = view;
    }

    public void normalizeText(String inputFile, String outputFile) {
        model = new Normalize(inputFile, outputFile);
        model.normalizeText();
        view.displayMessage("Normalized document has been written to " + outputFile);
    }
}
