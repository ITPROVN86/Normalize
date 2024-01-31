
import common.common;
import controller.NormalizeController;
import model.Normalize;
import view.NormalizeView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        Normalize model = new Normalize(common.INPUT, common.OUTPUT);
        NormalizeView view = new NormalizeView();
        new NormalizeController(model, view).normalizeText(model.getInputFile(), model.getOutputFile()); 
    }
}
