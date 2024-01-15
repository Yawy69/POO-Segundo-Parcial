/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package errorcalculadoramvc;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Yannick
 */
public class CalculadoraVista extends JFrame {
    private final JLabel label;
     private final JButton[] numberButtons;
    private final JButton[] operationButtons;
    private final JButton equalsButton;


    public CalculadoraVista() {
        // Configuración de la interfaz gráfica, inicialización de componentes, etc.
        
        // Configurar el label que mostrará los números y operaciones
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 204)));
        label.setOpaque(true);

        // Inicialización de los botones numéricos
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(Integer.toString(i));
        }

        // Inicialización de los botones de operación
        operationButtons = new JButton[4];
        operationButtons[0] = new JButton("C");
        operationButtons[1] = new JButton("+");
        operationButtons[2] = new JButton("-");
        operationButtons[3] = new JButton("*");

        // Configurar el botón "="
        equalsButton = new JButton("=");
        
        
    }
  public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public JButton[] getOperationButtons() {
        return operationButtons;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }
}