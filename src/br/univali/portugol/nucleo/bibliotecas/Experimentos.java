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
//            referencia = "Sem referência",
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
//            referencia = "Sem referência",
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
            descricao = "Rotaciona o agente n graus para a esquerda",
            parametros =
            {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade em graus para rotacionar"),
            },
            retorno = "Sem retorno",
//            referencia = "Sem referência",
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
//            referencia = "Sem referência",
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
//            referencia = "Sem referência",
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
                @DocumentacaoParametro(nome = "nome_atributo", descricao = "Define a identificação do atributo.")
            },
            retorno = "Sem retorno",
//            referencia = "Sem referência",
            autores = 
                    {
                        @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
                    }
    )
    public void criar_atributo(String nome_atributo) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.adicionarAtributoAgentes(nome_atributo);
    }
    
    @DocumentacaoFuncao(
            descricao = "Permite controlar a média de uma característica de um agente. Por exemplo, "
                    + "exibir em um monitor a média de energia ou velocidade dos agentes.",
            parametros = {
                @DocumentacaoParametro(nome = "nome_atributo", descricao = "Define a identificação do atributo.")
            },
            retorno = "Retorna o valor da média de um determinado atributo",
//            referencia = "Sem referência",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public double media(String nome_atributo) throws ErroExecucaoBiblioteca, InterruptedException{
        return ambiente.media(nome_atributo);
    }
    
    @DocumentacaoFuncao(
            descricao = "Define um valor a um determinado atributo",
            parametros = {
                @DocumentacaoParametro(nome = "nome_atributo", descricao = "Nome do atributo que terá o valor atribuído"),
                @DocumentacaoParametro(nome = "valor", descricao = "Novo valor do atributo")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void definir_valor_atributo(String nome_atributo, String valor ) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().definir_valor_atributo(nome_atributo, valor);
    }
    
    @DocumentacaoFuncao(
            descricao = "Mata o agente atual da simulação e o remove do ambiente de simulação",
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void morrer() throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.matarAgente();
    }
    
    @DocumentacaoFuncao(
            descricao = "Retorna a coordenada X do agente atual",
            retorno = "Coordenada X do agente",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public double retornar_coordenadaX() throws ErroExecucaoBiblioteca, InterruptedException{
        return ambiente.getAgenteAtual().retornar_coordenada_X();
    }
    
    @DocumentacaoFuncao(
            descricao = "Retorna a coordenada Y do agente atual",
            retorno = "Coordeanda Y do agente",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public double retornar_coordenadaY() throws ErroExecucaoBiblioteca, InterruptedException{
        return ambiente.getAgenteAtual().retornar_coordenada_Y();
    }
    
    @DocumentacaoFuncao(
            descricao = "Move o agente n passos(verificar explicação para os passos) para a frente",
            parametros = {
                @DocumentacaoParametro(nome = "quantidade", descricao = "Quantidade de passos para mover")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void mover_frente(int quantidade) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().mover_frente(quantidade);
    }
    
    @DocumentacaoFuncao(
            descricao = "Faz com que o agente retorne n passos",
            parametros = {
                @DocumentacaoParametro(nome = "quantidade", descricao = "Quantidade de passos para retornar")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void voltar(int quantidade) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().voltar(quantidade);
    }
    
    @DocumentacaoFuncao(
            descricao = "Gira o agente n graus para a esquerda",
            parametros = {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade de graus para o giro")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void girar_esquerda(int graus) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().girar_esquerda(graus);
    }
    
    @DocumentacaoFuncao(
            descricao = "Gira o agente n graus para a direita",
            parametros = {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade de graus para o giro")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void girar_direita(int graus) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().girar_direita(graus);
    }

    @DocumentacaoFuncao(
            descricao = "Move o agente de acordo com a quantidade de graus passada por parâmetro. "
                    + "É considerado um posicionamento da tela, ou seja, é igual para todos os agentes.",
            parametros = {
                @DocumentacaoParametro(nome = "graus", descricao = "Quantidade de graus para o giro")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void definir_orientacao(int graus) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().definir_orientacao(graus);
    }
    
    
    @DocumentacaoFuncao(
            descricao = "Move o agente para uma determinada coordenada X e Y.",
            parametros = {
                @DocumentacaoParametro(nome = "coordenadaX", descricao = "Qual a coordenada X para pular"),
                @DocumentacaoParametro(nome = "coordenadaY", descricao = "Qual a coordenada Y para pular"),
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void pular_para_XY(double coordenadaX, double coordenadaY) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().pular_para_XY(coordenadaX, coordenadaY);
    }
    
    @DocumentacaoFuncao(
            descricao = "Define uma cor ao agente",
            parametros = {
                @DocumentacaoParametro(nome = "cor", descricao = "Cor para o agente. Utilize a biblioteca Gráficos que já possui "
                        + "cores pré-definidas")
            },
            retorno = "Sem retorno",
            autores = {
                @Autor(nome = "Douglas Breda", email = "bredadouglas@gmail.com")
            }
    )
    public void definir_cor_agente(int cor) throws ErroExecucaoBiblioteca, InterruptedException{
        ambiente.getAgenteAtual().definir_cor_agente(cor);
    }
    
}
