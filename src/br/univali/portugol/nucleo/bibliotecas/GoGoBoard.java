package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.Autor;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoFuncao;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoParametro;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.PropriedadesBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.GoGoDriver;

/**
 *
 * @author Ailton Cardoso Jr
 */
@PropriedadesBiblioteca(tipo = TipoBiblioteca.COMPARTILHADA)
@DocumentacaoBiblioteca(
        descricao = "Esta biblioteca permite manipular a controladora GoGo board",
        versao = "0.01"
)
public final class GoGoBoard extends Biblioteca 
{   
    private static GoGoDriver goGoDriver = new GoGoDriver();
    
    @DocumentacaoFuncao(
            descricao = "Realiza a consulta do valor de um sensor",
            parametros =
            {
                @DocumentacaoParametro(nome = "sensor", descricao = "o numero do sensor desejado")
            },
            retorno = "Valor do sensor",
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public int consultar_sensor(int sensor) throws ErroExecucaoBiblioteca, InterruptedException
    {
        return goGoDriver.lerSensor(sensor);
    }

    @DocumentacaoFuncao(
            descricao = "Liga os motores especificados or parametro",
            parametros =
            {
                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
            },
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void ligar_motor(String motores) throws ErroExecucaoBiblioteca, InterruptedException
    {
        System.out.println("Ligar motor");
    }
    
    @DocumentacaoFuncao(
            descricao = "Acionar o beep",
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void acionar_beep() throws ErroExecucaoBiblioteca, InterruptedException
    {
        goGoDriver.beep();
    }

    @DocumentacaoFuncao(
            descricao = "Acender e apagar o LED do usuário",
            parametros =
            {
                @DocumentacaoParametro(nome = "ligar", descricao = "Valor lógico correspondente ao estado do LED \n Ex: \"ligar = verdadeiro\" = acende o LED \n Ex: \"ligar = falso\" = apaga o LED")
            },
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void acender_led(boolean ligar) throws ErroExecucaoBiblioteca, InterruptedException
    {
        goGoDriver.led(ligar);
    }
}
