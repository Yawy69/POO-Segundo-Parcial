/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package errorcalculadoramvc;

/**
 *
 * @author Yannick
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CalculadoraControlador {
    private final CalculadoraVista vista;
    private final CalculadoraModelo modelo;

    public CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        configurarBotones();
    }

    private void configurarBotones() {
        // Configurar acciones para los botones de números
        for (JButton button : vista.getNumberButtons()) {
            button.addActionListener((ActionEvent e) -> {
             
                String buttonText = button.getText();
                
            });
        }

        
        for (JButton button : vista.getOperationButtons()) {
            button.addActionListener((ActionEvent e) -> {
                String buttonText = button.getText();
            });
        }

        
        vista.getEqualsButton().addActionListener((ActionEvent e) -> {
            modelo.realizarCalculo();
        });
    }
}