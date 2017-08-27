package br.univali.portugol.nucleo.bibliotecas.experimentos;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author Douglas
 */
public class BaseAgente extends JPanel implements IAgente 
{
    //Lista com os parâmetros do agente
    private Map<String, Object> listaParametros = null;
    private double coordenadaX = 0;
    private double coordenadaY = 0;
    private int id = 0;

    //Construtor padrão
    public BaseAgente(double coordenadaX, double coordenadaY, int id)
    {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.id = id;
        inicializar();
    }

    private void inicializar()
    {
        listaParametros = new HashMap<>();
    }

    private void adicionarParametroLista(String nome)
    {
        if (!listaParametros.containsKey(nome))
        {
            listaParametros.put(nome, "");
        }
    }

    @Override
    public void criar_parametro(String nome_atributo)
    {
        adicionarParametroLista(nome_atributo);
    }

    @Override
    public void definir_cor_agente(int cor)
    {
        
    }

    @Override
    public void definir_orientacao(int graus)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definir_valor_atributo(String nome_atributo, String valor)
    {
        if(verificarAtributoExiste(nome_atributo))
            listaParametros.replace(nome_atributo, valor);
    }

    @Override
    public void girar_direita(int graus)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void girar_esquerda(int graus)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void morrer()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ir_ate(double coordenadaX, double coordenadaY)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover_frente(int quantidade)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pular_para_XY(double coordenadaX, double coordenadaY)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String retornar_atributo_cadeia(String nome_atributo)
    {
        try
        {
            if (verificarAtributoExiste(nome_atributo))
            {
                return ((String) listaParametros.get(nome_atributo));
            }
            else
            {
                return "";
            }
        }
        catch (Exception ex)
        {
        }

        return "";
    }

    @Override
    public char retornar_atributo_caracter(String nome_atributo)
    {
        try
        {
            if (verificarAtributoExiste(nome_atributo))
            {
                return ((char) listaParametros.get(nome_atributo));
            }
            else
            {
                return ' ';
            }
        }
        catch (Exception ex)
        {
        }

        return ' ';
    }

    @Override
    public int retornar_atributo_inteiro(String nome_atributo)
    {
        try
        {
            if (verificarAtributoExiste(nome_atributo))
            {
                return ((int) listaParametros.get(nome_atributo));
            }
            else
            {
                return 0;
            }
        }
        catch (Exception ex)
        {
        }

        return 0;
    }

    @Override
    public boolean retornar_atributo_logico(String nome_atributo)
    {
        try
        {
            if (verificarAtributoExiste(nome_atributo))
            {
                return ((boolean) listaParametros.get(nome_atributo));
            }
            else
            {
                return false;
            }
        }
        catch (Exception ex)
        {
        }

        return false;
    }

    @Override
    public double retornar_atributo_real(String nome_atributo)
    {
        try
        {
            if (verificarAtributoExiste(nome_atributo))
            {
                return ((double) listaParametros.get(nome_atributo));
            }
            else
            {
                return 0;
            }
        }
        catch (Exception ex)
        {
        }

        return 0;
    }

    @Override
    public double retornar_coordenada_X()
    {
        return this.coordenadaX;
    }

    @Override
    public double retornar_coordenada_Y()
    {
        return this.coordenadaY;
    }

    @Override
    public int retornar_cor_agente()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int retornar_id()
    {
        return this.id;
    }

    @Override
    public int retornar_orientacao()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void voltar(int quantidade)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        //Cria aqui os desenhos (as formas)
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    private boolean verificarAtributoExiste(String nome)
    {
        return listaParametros.containsKey(nome);
    }
}
