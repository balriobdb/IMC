/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author mauricio.freitas1
 */
public class Calculadora {

    double imc;
    private String status;

    public String Calculadora(double vp, double va) {
        imc = vp / (va*va) {
        imc = vp / (va*va);

        if (imc < 17) {
            this.setStatus("Muito abaixo do peso");
        } else if (imc <= 18.49) {
            this.setStatus("Abaixo do peso");
        } else if (imc <= 24.99) {
            this.setStatus("Peso normal");
        } else if (imc <= 29.99) {
            this.setStatus("Acima do peso");
        } else if (imc <= 34.99) {
            this.setStatus("Obesidade I");
        } else if (imc <= 39.99) {
            this.setStatus("Obesidade II (severa)");
        } else if (imc >= 40) {
            this.setStatus("Obesidade III (mórbida)");
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    

}
