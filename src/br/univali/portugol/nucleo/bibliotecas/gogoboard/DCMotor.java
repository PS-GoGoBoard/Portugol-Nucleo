package br.univali.portugol.nucleo.bibliotecas.gogoboard;

import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class DCMotor extends Motor
{
    public DCMotor(int numMotor)
    {
        super(numMotor);
    }

    public void ligar() throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        byte[] mensagem = new byte[64];
        mensagem[2] = 2;
        mensagem[3] = 0;
        mensagem[4] = 1;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        setLigado(true);
    }

    public void desligar() throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        byte[] mensagem = new byte[64];
        mensagem[2] = 2;
        mensagem[3] = 0;
        mensagem[4] = 0;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        setLigado(false);
    }
    
    public void inverterDirecao() throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        byte[] mensagem = new byte[64];
        mensagem[2] = 4;
        mensagem[3] = 0;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        if (isDireita())
        {
            setDireita(false);
        }else{
            setDireita(true);
        }
    }

    public void definirDirecao(int direcao) throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        if (!isLigado())
        {
            ligar();
        }
        byte[] mensagem = new byte[64];
        mensagem[2] = 3;
        mensagem[3] = 0;
        mensagem[4] = (byte) direcao;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        if (direcao == 1)
        {
            setDireita(true);
        }else{
            setDireita(false);
        }
    }
}