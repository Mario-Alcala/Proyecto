/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.io.FileNotFoundException;
import java.util.List;
import proyecto.utils.ProductosUtils;
import proyecto.inventario.InventarioManager;


import proyecto.pojo.Eliminacion;
import proyecto.pojo.Producto;

import javax.swing.SwingUtilities;  // Import faltante para SwingUtilities
import proyecto.ABB_Productos.Estructura.ABB;
import proyecto.InterfazGrafica.PrincipalView;
import proyecto.persistencia.productoPersistencia;



/**
 *
 * @author aleja
 */
public class Proyecto {
    public static ABB arbol = new ABB();
    public static InventarioManager inventario = new InventarioManager();
    
    public static final String DATA_FOLDER = "data/";
    
    public static final String ARCHIVO1 = "Productos.json";
    public static final String ARCHIVO2 = "productosEliminados.json";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        
        List<Producto> productoGuardado = productoPersistencia.cargarJson(ARCHIVO1);
        
        for(Producto p : productoGuardado){
            arbol.insertar(p);
        }
        
        
        
        
        
        
        
        
        
        FlatGradiantoDeepOceanIJTheme.setup();
       new PrincipalView().setVisible(true);
       
        

    }
    
}
