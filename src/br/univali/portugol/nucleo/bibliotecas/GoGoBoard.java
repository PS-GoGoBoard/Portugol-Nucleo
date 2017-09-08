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
import br.univali.portugol.nucleo.bibliotecas.gogoboard.GoGoDriver;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Led;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Motor;
import br.univali.portugol.nucleo.bibliotecas.gogoboard.Sensor;

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
    //private static GoGoDriver goGoDriver = new GoGoDriver();
    //private Boolean[] estadoMotores = new Boolean[4];
    private static Sensor sensor1 = new Sensor(1);
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
        return sensor1.getValor();
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
    public void ligar_motor(String motores) throws ErroExecucaoBiblioteca, InterruptedException
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
                    throw new AssertionError();
            }
            //goGoDriver.ligarMotor();
            System.out.println("Ligar motor: " + nomeMotor);
        }
        System.out.println("------------------\n");
    }
//
//    @DocumentacaoFuncao(
//            descricao = "Desligar os motores especificados or parametro",
//            parametros =
//            {
//                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
//            },
//            autores =
//            {
//                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
//            }
//    )
//    public void desligar_motor(String motores) throws ErroExecucaoBiblioteca, InterruptedException
//    {
//        motores = motores.toLowerCase();
//        for (char motor : motores.toCharArray())
//        {
//            switch (motor)
//            {
//                case 'a':
//                    goGoDriver.selecionarMotor(1);
//                    estadoMotores[0] = false;
//                    break;
//                case 'b':
//                    goGoDriver.selecionarMotor(2);
//                    estadoMotores[1] = false;
//                    break;
//                case 'c':
//                    goGoDriver.selecionarMotor(4);
//                    estadoMotores[2] = false;
//                    break;
//                case 'd':
//                    goGoDriver.selecionarMotor(8);
//                    estadoMotores[3] = false;
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//            goGoDriver.desligarMotor();
//            System.out.println("Desligar motor: " + motor);
//        }
//        System.out.println("------------------\n");
//    }

//    @DocumentacaoFuncao(
//            descricao = "Retorna o estado dos motores especificados or parametro",
//            parametros =
//            {
//                @DocumentacaoParametro(nome = "motores", descricao = "as letras correspondentes aos motores desejados \n Ex: \"abcd\"")
//            },
//            retorno = "Estado do(s) sensor(es)",
//            autores =
//            {
//                @Autor(nome = "Ailton Cardoso Jr", email = "ailtoncardosojr@edu.univali.br")
//            }
//    )
//    public boolean estado_motor(String motores) throws ErroExecucaoBiblioteca, InterruptedException
//    {
//        boolean estado = false;
//        motores = motores.toLowerCase();
//        for (char motor : motores.toCharArray())
//        {
//            switch (motor)
//            {
//                case 'a':
//                    estado = estadoMotores[0];
//                    break;
//                case 'b':
//                    estado = estadoMotores[1];
//                    break;
//                case 'c':
//                    estado = estadoMotores[2];
//                    break;
//                case 'd':
//                    estado = estadoMotores[3];
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        }
//        return estado;
//    }

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
