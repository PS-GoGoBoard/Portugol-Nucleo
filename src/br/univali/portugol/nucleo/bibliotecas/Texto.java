package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.Autor;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoFuncao;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoParametro;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.PropriedadesBiblioteca;

/**
 *
 * @author Luiz Fernando Noschang
 */
@PropriedadesBiblioteca(tipo = TipoBiblioteca.COMPARTILHADA)
@DocumentacaoBiblioteca(descricao = "Esta biblioteca contém funções para manipulação de texto (dados do tipo <tipo>cadeia</tipo>)", versao = "1.0")
public final class Texto extends Biblioteca
{
    @DocumentacaoFuncao
    (
        descricao = "Conta o número de caracteres existentes em uma <tipo>cadeia</tipo>",
        parametros = 
        {
            @DocumentacaoParametro(nome = "cadeia", descricao = "um valor qualquer do tipo <tipo>cadeia</tipo>")
        },
        retorno = "o número de caracteres na <tipo>cadeia</tipo>",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br")
        }        
    )    
    public Integer numero_caracteres(String cadeia) throws ErroExecucaoBiblioteca
    {
        return cadeia.length();
    }
    
    @DocumentacaoFuncao
    (
        descricao = "Transforma os caracteres de uma <tipo>cadeia</tipo> em caracteres maiúsculos",
        parametros = 
        {
            @DocumentacaoParametro(nome = "cad", descricao = "um valor qualquer do tipo <tipo>cadeia</tipo>")
        },
        retorno = "a <tipo>cadeia</tipo> com os caracteres transformados",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br")
        }        
    )    
    public String caracteres_maiusculos(String cad) throws ErroExecucaoBiblioteca
    {
        return cad.toUpperCase();
    }    
    
    @DocumentacaoFuncao
    (
        descricao = "Transforma os caracteres de uma <tipo>cadeia</tipo> em caracteres minúsculos",
        parametros = 
        {
            @DocumentacaoParametro(nome = "cad", descricao = "um valor qualquer do tipo <tipo>cadeia</tipo>")
        },
        retorno = "a <tipo>cadeia</tipo> com os caracteres transformados",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br")
        }        
    )    
    public String caracteres_minusculos(String cad) throws ErroExecucaoBiblioteca
    {
        return cad.toLowerCase();
    }

    @DocumentacaoFuncao
    (
        descricao = "Pesquisa por um determinado texto em uma <tipo>cadeia</tipo> e substitui todas as ocorrências por um texto alternativo",
        parametros = 
        {
            @DocumentacaoParametro(nome = "cad", descricao = "a <tipo>cadeia</tipo> que será pesquisada"),
            @DocumentacaoParametro(nome = "texto_pesquisa", descricao = "o texto que será pesquisado na <tipo>cadeia</tipo>"),
            @DocumentacaoParametro(nome = "texto_substituto", descricao = "o texto pelo qual as ocorrências serão substituídas")
        },
        retorno = "a <tipo>cadeia</tipo> resultante da substituição",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br")
        }        
    )    
    public String substituir(String cad, String texto_pesquisa, String texto_substituto) throws ErroExecucaoBiblioteca
    {
        return cad.replace(texto_pesquisa, texto_substituto);
    }

    @DocumentacaoFuncao
    (
        descricao = 
            
              "Concatena o <tipo>caracter</tipo> informado, à esquerda da <tipo>cadeia</tipo>, até que a "
            + "<tipo>cadeia</tipo> fique do <param>tamanho</param> indicado.\n\n"
            
            + "Se o tamanho da <tipo>cadeia</tipo> for maior ou igual ao <param>tamanho</param> informado, "
            + "nada é feito", 
        
        parametros = 
        {
            @DocumentacaoParametro(nome = "car", descricao = "o <tipo>caracter</tipo> que será concatenado á esquerda da <tipo>cadeia</tipo>"),
            @DocumentacaoParametro(nome = "tamanho", descricao = "o tamanho final da <tipo>cadeia</tipo>"),
            @DocumentacaoParametro(nome = "cad", descricao = "a <tipo>cadeia</tipo> que será transformada")
        },
        retorno = "a <tipo>cadeia</tipo> transformada",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br"),
            @Autor(nome = "Fillipi Domingos Pelz", email = "fillipi@univali.br")
        }
    )    
    public String preencher_a_esquerda(Character car, Integer tamanho, String cad) throws ErroExecucaoBiblioteca
    {
        if (cad.length() < tamanho)
        {
            StringBuilder sb = new StringBuilder();
            
            int diferenca = tamanho - cad.length();
            
            for (int i = 1; i <= diferenca; i++)
            {
                sb.append(car);
            }
            
            cad = sb.append(cad).toString();
        }
        
        return cad;
    }    
    
    @DocumentacaoFuncao
    (
        descricao = 
            
              "Obtém um <tipo>caracter</tipo> da <tipo>cadeia</tipo> a partir de seu <param>índice</param>.\n\n"
            
            + "O <param>índice</param> deve estar entre 0 e o número de caracteres da <tipo>cadeia</tipo>", 
        
        parametros = 
        {
            @DocumentacaoParametro(nome = "cad", descricao = "a <tipo>cadeia</tipo> da qual será obtido o caracater"),
            @DocumentacaoParametro(nome = "indice", descricao = "o indice do caracter que se deseja obter")            
        },
        retorno = "o <tipo>caracater</tipo> no <param>índice</param> informado",
        autores = 
        {
            @Autor(nome = "Luiz Fernando Noschang", email = "noschang@univali.br")
        }
    )    
    public Character obter_caracter(String cad, Integer indice) throws ErroExecucaoBiblioteca
    {
        if (indice < 0)
        {
            throw new ErroExecucaoBiblioteca(String.format("O índice do caracter (%d) é menor que 0", indice));
        }
        else if (indice > cad.length() - 1)
        {
            throw new ErroExecucaoBiblioteca(String.format("O índice do caracter (%d) é maior que o número de caracteres na cadeia (%d)", indice, cad.length()));
        }
        else
        {
            return cad.charAt(indice);
        }
    }    
}