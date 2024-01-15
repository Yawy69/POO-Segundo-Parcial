/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package errorcalculadoramvc;

/**
 *
 * @author Yannick
 */
public class CalculadoraModelo {
    private int num1;
    private int num2;
    private String signo;

    public void setNumero1(int num1) {
        this.num1 = num1;
    }

    public void setNumero2(int num2) {
        this.num2 = num2;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int realizarOperacion() {
        switch (signo) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Error: División por cero");
                }
            default:
                throw new IllegalArgumentException("Signo no válido");
        }
    }

    void realizarCalculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}