/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import proyecto.utils.JsonUtils;
import proyecto.inventario.InventarioManager;
import proyecto.estructura.ABB;
import proyecto.estructura.Nodo;
import proyecto.interfaces.inventarioApp;
import proyecto.pojo.Eliminacion;
import proyecto.pojo.Producto;

import javax.swing.SwingUtilities;  // Import faltante para SwingUtilities

/**
 *
 * @author aleja
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            SwingUtilities.invokeLater(() -> {
        new inventarioApp().setVisible(true);
    });

    }
    
}
