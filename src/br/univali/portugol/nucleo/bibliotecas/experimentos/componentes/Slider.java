/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.portugol.nucleo.bibliotecas.experimentos.componentes;

import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Douglas
 */
public class Slider extends JPanel implements br.univali.portugol.nucleo.bibliotecas.experimentos.IComponenteSimulacao
{
    @Override
    public void definir_titulo(String titulo)
    {
        
    }   

    public Slider()
    {
        this.add(new JSlider());
    }
    
    
}
