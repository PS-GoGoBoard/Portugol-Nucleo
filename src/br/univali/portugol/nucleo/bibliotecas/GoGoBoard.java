package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.Autor;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoFuncao;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoParametro;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.PropriedadesBiblioteca;
import br.univali.portugol.nucleo.mensagens.ErroExecucao;

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
    @DocumentacaoFuncao(
            descricao = "Realiza a consulta do valor de um sensor",
            parametros = 
            {
                @DocumentacaoParametro(nome = "sensor", descricao = "o numero do sensor desejado")
            },
            retorno = "valor correspondente ao sensor",
            autores = 
                    {
                        @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
                    }
    )
    public int consultar_sensor(int sensor) throws ErroExecucaoBiblioteca,InterruptedException{
        return 0;
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
    public void ligar_motor(String motores) throws ErroExecucaoBiblioteca,InterruptedException{
        
    }
    
}
