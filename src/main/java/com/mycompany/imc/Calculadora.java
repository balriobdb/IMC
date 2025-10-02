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
        

    public Calculadora(double va, double vp) {
        setVa(va);
        setVp(vp);
        setImc(vp/(va*va));
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
}
