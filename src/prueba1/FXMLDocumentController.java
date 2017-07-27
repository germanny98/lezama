/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author germanny.lezama
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label l1,l2;
    @FXML
    private TextField tex1,tex2;
    
    
            
    
    
    LinkedList<Estudiante> listaE;
    @FXML 
   private void baceptar(ActionEvent event){
       String nombre = tex1.getText();
        String codigo = tex2.getText();
        
      Estudiante objE = new Estudiante (nombre, codigo);
       boolean guardar=listaE.add(objE);
       if (guardar){
       tex1.setText("");
        tex2.setText("");
       
       }
       
      
       
       
   }
    @FXML
    private void bam(ActionEvent event){
        String mostrar="";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>();
    }    
   
}
