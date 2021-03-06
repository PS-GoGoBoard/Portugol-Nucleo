package br.univali.portugol.nucleo.bibliotecas.gogoboard;

import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Sensor
{
    private static GoGoDriver gogoDriver = new GoGoDriver();
    private int nome;
    private int valor;

    public Sensor(int nome)
    {
        this.nome = nome;
    }

    public int getNome()
    {
        return nome;
    }

    public void setNome(int nome)
    {
        this.nome = nome;
    }

    public int getValor() throws ErroExecucaoBiblioteca
    {
        System.err.println("Lendo Sensor\n");
        byte[] mensagem;
        do
        {
            mensagem = gogoDriver.receberMensagem(64);
        }
        while (mensagem[0] != 0);       // Evitar pegar valor zerado do sensor
        ByteBuffer bb = ByteBuffer.wrap(mensagem, (2 * (nome-1)) + 1, 2); // Nome-1 pois o sensor começa em 0 na mensagem
        bb.order(ByteOrder.BIG_ENDIAN);
        valor = bb.getShort();
        return valor;
    }
}
