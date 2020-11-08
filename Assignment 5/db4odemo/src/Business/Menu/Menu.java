/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author shaojinnan
 */
public class Menu {

    private ArrayList<Dish> dishesList;

    public Menu() {
        dishesList = new ArrayList();
    }

    public ArrayList<Dish> getDishesCatalog() {
        return dishesList;
    }

}
