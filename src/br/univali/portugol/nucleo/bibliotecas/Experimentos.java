/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import static br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca.COMPARTILHADA;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.Autor;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoFuncao;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoParametro;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.PropriedadesBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.experimentos.Ambiente;

@PropriedadesBiblioteca(tipo = COMPARTILHADA)
@DocumentacaoBiblioteca(
        descricao = "Esta biblioteca contém uma série de funcionalidades que permitem a criação de simulações de experimentos físicos ou naturais",
        versao = "1.0")
public final class Experimentos extends Biblioteca
{
    private Ambiente ambiente = null;
    
    
    public Experimentos()
    {
        inicializar();
    }
    
    private void inicializar(){
        ambiente = new Ambiente();
    }

    @DocumentacaoFuncao(
            descricao = "Cria n agentes para simulação",
            parametros =
            {
                @DocumentacaoParametro(nome = "numeroAgentes", descricao = "o número de agentes a ser criado"),
                @DocumentacaoParametro(nome = "aleatorio", descricao = "Os agentes serão criados em lugares aleatórios ou todos na mesma posição")
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void criar_agentes(int numeroAgentes, boolean aleatorio) throws ErroExecucaoBiblioteca, InterruptedException
    {
        ambiente.criar_agentes(numeroAgentes, aleatorio);
    }

    @DocumentacaoFuncao(
            descricao = "Move o agente n passos para frente",
            parametros =
            {
                @DocumentacaoParametro(nome = "quantidade", descricao = "quantidade de passos que o agente deverá andar"),
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void moverFrente(int quantidade) throws ErroExecucaoBiblioteca, InterruptedException
    {
        System.out.println("O agente se moveu " + quantidade + " passos.");
    }

    @DocumentacaoFuncao(
            descricao = "Volta n passos",
            parametros =
            {
                @DocumentacaoParametro(nome = "quantidade", descricao = "quantidade de passos que o agente deverá andar"),
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void voltar(int quantidade) throws ErroExecucaoBiblioteca, InterruptedException
    {
        System.out.println("O agente voltou " + quantidade + " passos.");
    }

    @DocumentacaoFuncao(
            descricao = "Rotaciona o agente n graus para a esquerda",
            parametros =
            {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade em graus para rotacionar"),
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void girarEsquerda(int graus) throws ErroExecucaoBiblioteca, InterruptedException
    {
        System.out.println("O agente girou " + graus + " graus à esquerda.");
    }

    @DocumentacaoFuncao(
            descricao = "Gira o agente n graus para a direita",
            parametros =
            {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade em graus para rotacionar"),
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void girarDireita(int graus) throws ErroExecucaoBiblioteca, InterruptedException
    {
        System.out.println("O agente girou " + graus + " graus à graus.");
    }

    @DocumentacaoFuncao(
            descricao = "Executa o método principal da simulação",
            //            parametros =
            //            {
            //                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade em graus para rotacionar"),
            //            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores =
            {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void executar_teste() throws ErroExecucaoBiblioteca, InterruptedException
    {
        //Verificar nome do método pois o nome "executar" conflita com algo dentro do núcleo   
    }
    
    @DocumentacaoFuncao(
            descricao = "Permite a criação de variáveis para controle e uso durante a simulação",
            parametros = {
                //Verificar se será criada a opção para passar um tipo ou valor default
                @DocumentacaoParametro(nome = "nomeAtributo", descricao = "Define a identificação do Atributo")
            },
            retorno = "Sem retorno",
            referencia = "Sem referência",
            autores = 
                    {
                        @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
                    }
    )
    public void criar_parametro(String nomeAtributo){
        ambiente.adicionarParametroAgentes(nomeAtributo);
    }

}
