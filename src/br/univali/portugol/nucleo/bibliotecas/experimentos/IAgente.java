/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.portugol.nucleo.bibliotecas.experimentos;

import java.util.List;

/**
 *
 * @author Douglas
 */
public interface IAgente
{
    public double retornar_coordenada_X();
    
    public double retornar_coordenada_Y();
    
    public void mover_frente(int quantidade);
    
    public void voltar(int quantidade);
    
    public void girar_esquerda(int graus);
    
    public void girar_direita(int graus);
    
    public void definir_orientacao(int graus);
    
    public void pular_para_XY(double coordenadaX, double coordenadaY);
    
    public void morrer();
    
    public void criar_parametro(String nome_atributo);
    
    public void definir_valor_atributo(String nome_atributo, String valor);
    
    public void definir_cor_agente(int cor);
    
    public String retornar_atributo_cadeia(String nome_atributo);
    
    public char retornar_atributo_caracter(String nome_atributo);
    
    public int retornar_atributo_inteiro(String nome_atributo);
    
    public boolean retornar_atributo_logico(String nome_atributo);
    
    public double retornar_atributo_real(String nome_atributo);
    
    public int retornar_cor_agente();
    
    public int retornar_orientacao();
    
    public boolean ir_ate(double coordenadaX, double coordenadaY);
    
    public int retornar_id();
}
