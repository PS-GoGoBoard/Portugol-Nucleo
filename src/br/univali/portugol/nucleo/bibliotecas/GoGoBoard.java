package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.Autor;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoFuncao;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.DocumentacaoParametro;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.PropriedadesBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.DCMotor;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Led;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Motor;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Sensor;
import java.util.ArrayList;
import java.util.List;

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
    private static List<Sensor> sensores = new ArrayList<Sensor>()
    {
        {
            add(new Sensor(0));
            add(new Sensor(1));
            add(new Sensor(2));
            add(new Sensor(3));
            add(new Sensor(4));
            add(new Sensor(5));
            add(new Sensor(6));
            add(new Sensor(7));
        }
    };
    
    private static Motor saidaA;
    private static Motor saidaB;
    private static Motor saidaC;
    private static Motor saidaD;

    private static Led ledUsuario = new Led();

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
    public int consultar_sensor(int numSensor) throws ErroExecucaoBiblioteca, InterruptedException
    {
        return sensores.get(numSensor - 1).getValor();
    }

    @DocumentacaoFuncao(
            descricao = "Ligar os motores especificados or parametro",
            parametros =
            {
                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
            },
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void ligar_motores(String motores) throws ErroExecucaoBiblioteca, InterruptedException
    {
        motores = motores.toLowerCase();
        for (char nomeMotor : motores.toCharArray())
        {
            switch (nomeMotor)
            {
                case 'a':
                    saidaA = new DCMotor(1);
                    ((DCMotor) saidaA).ligarMotor();
                    break;
                case 'b':
                    saidaB = new DCMotor(2);
                    ((DCMotor) saidaB).ligarMotor();
                    break;
                case 'c':
                    saidaC = new DCMotor(4);
                    ((DCMotor) saidaC).ligarMotor();
                    break;
                case 'd':
                    saidaD = new DCMotor(8);
                    ((DCMotor) saidaD).ligarMotor();
                    break;
                default:
                    throw new ErroExecucaoBiblioteca("Somente são aceitos motores A,B,C e D");
            }
            System.out.println("Ligar motor: " + nomeMotor);
        }
        System.out.println("------------------\n");
    }

    @DocumentacaoFuncao(
            descricao = "Desligar os motores especificados por parametro",
            parametros =
            {
                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
            },
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void desligar_motores(String motores) throws ErroExecucaoBiblioteca, InterruptedException
    {
        motores = motores.toLowerCase();
        for (char nomeMotor : motores.toCharArray())
        {
            switch (nomeMotor)
            {
                case 'a':
                    ((DCMotor) saidaA).desligarMotor();
                    break;
                case 'b':
                    ((DCMotor) saidaB).desligarMotor();
                    break;
                case 'c':
                    ((DCMotor) saidaC).desligarMotor();
                    break;
                case 'd':
                    ((DCMotor) saidaD).desligarMotor();
                    break;
                default:
                    throw new ErroExecucaoBiblioteca("Somente são aceitos motores A,B,C e D");
            }
            System.out.println("Desligar motor: " + nomeMotor);
        }
        System.out.println("------------------\n");
    }

    @DocumentacaoFuncao(
            descricao = "Retorna o estado dos motores especificados or parametro",
            parametros =
            {
                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
            },
            retorno = "Estado do(s) sensor(es)",
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public boolean estado_motores(String motores) throws ErroExecucaoBiblioteca, InterruptedException
    {
        //boolean estado = false;
        Motor motor;
        motores = motores.toLowerCase();
        for (char nomeMotor : motores.toCharArray())
        {
            switch (nomeMotor)
            {
                case 'a':
                    motor = saidaA;
                    //estado = saidaA.isLigado();
                    break;
                case 'b':
                    motor = saidaB;
                    //estado = saidaB.isLigado();
                    break;
                case 'c':
                    motor = saidaC;
                    //estado = saidaC.isLigado();
                    break;
                case 'd':
                    motor = saidaD;
                    //estado = saidaD.isLigado();
                    break;
                default:
                    throw new ErroExecucaoBiblioteca("Somente são aceitos motores A,B,C e D");
            }
            if (motor == null || !motor.isLigado())
            {
                return false;
            }
        }
        return true;
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
        //goGoDriver.beep();
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
        ledUsuario.ligar(ligar);
    }

    @DocumentacaoFuncao(
            descricao = "Exibir texto no painel de segimentos",
            parametros =
            {
                @DocumentacaoParametro(nome = "texto", descricao = "Valor textual de 4 digitos que vai ser exibido no display de seguimentos.\n Deve ser de até 4 digitos.zn Ex: GoGo")
            },
            autores =
            {
                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
            }
    )
    public void exibeTextoCurto(String texto) throws ErroExecucaoBiblioteca, InterruptedException
    {
        //goGoDriver.exibeTextoCurto(texto);
    }
}
