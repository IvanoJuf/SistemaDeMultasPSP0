package multa_pagos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLVistaPagosController implements Initializable {
    
    @FXML
    private Button btnpagar;
    
    @FXML
    private Label lbtitular;
        
    @FXML
    private Label lbtarjeta;
        
    @FXML
    private Label lbfolio;
      
    @FXML
    private Label lbcvv;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tftitular ;
        
    @FXML
    private TextField tftarjeta ;
        
    @FXML
    private TextField tfmes ;
        
    @FXML
    private TextField tfanio ;
           
    @FXML
    private TextField tfcvv ;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    private static boolean validarNombre(String nombre){
         return nombre.matches("^([A-ZÁÉÍÓÚ]+[ ]?|[a-záéíóú]+[ ]?){3}$");                
    }
    
    private static boolean validarTarjeta(String tarjeta){
        return tarjeta.matches("^([0-9]+[-]?){4}$");
    }
    
    private static boolean validarMes(String mes){
        return mes.matches("^[0][1-9]|[1][0-2]$");
    }
    
    private static boolean validarAnio(String anio){
        return anio.matches("^[2][1-9]$");
    }
    
    private static boolean validarCvv(String cvv){
        return cvv.matches("^[0-9]{3}$");
    }
    
    @FXML
    private void validarDatos(){
    
        if(validarNombre(tftitular.getText()) == true && validarTarjeta(tftarjeta.getText()) == true && 
           validarMes(tfmes.getText()) == true && validarAnio(tfanio.getText()) == true && validarCvv(tfcvv.getText()) == true){
            
            JOptionPane.showMessageDialog(null, "Procesando pago","Sistema de Pagos",JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Información incorrecta","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
