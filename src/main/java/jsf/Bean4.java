/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Tokiniaina
 */
@Named(value = "bean4")
@RequestScoped
public class Bean4 {

   private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage_4?nb=" + nombre + "&;faces-redirect=true";
    } 
    
    public String afficherValeurFormulaire(){
        return "formulaire_4?nb="+ nombre + "&;faces-redirect=true";
    }
}
