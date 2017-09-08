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

    public void ligarMotor() throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        byte[] mensagem = new byte[64];
        mensagem[2] = 2;
        mensagem[3] = 0;
        mensagem[4] = 1;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        setLigado(true);
    }

    public void desligarMotor() throws ErroExecucaoBiblioteca
    {
        selecionarMotor();
        byte[] mensagem = new byte[64];
        mensagem[2] = 2;
        mensagem[3] = 0;
        mensagem[4] = 0;
        GoGoDriver.obterInstancia().enviarMensagem(mensagem);
        setLigado(false);
    }
}