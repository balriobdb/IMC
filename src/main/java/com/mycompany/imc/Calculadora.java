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

    private double va;
    private double vp;
    private double imc;
    private String status;

    public Calculadora(double va, double vp) {
        setVa(va);
        setVp(vp);
        setImc(vp / (va*va));
        if (imc < 17) {
            status = "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.49) {
            status = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            status = "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            status = "Acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            status = "Obesidade I";
        } else if (imc >= 35 && imc <= 39.99) {
            status = "Obesidade II  (Severa)";
        } else if (imc >= 40) {
            status = "Obesidade III (Mórbida)";
        }
    }

    public double getVa() {
        return va;
    }

    public void setVa(double va) {

        this.va  = va;
    }

    public double getVp() {
        return vp;
    }

    public void setVp(double vp) {

        this.vp = vp;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {

        this.imc = imc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
