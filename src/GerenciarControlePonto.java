import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto
{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();

    gerente.setIdFunc(1);
    gerente.setNome("Jefferson");
    gerente.setLogin("palmeiras");
    gerente.setSenha("12345");
    gerente.setDocumento("CPF");
    gerente.setEmail("Jefferson@gmail.com");



    Secretaria sec = new Secretaria();

    sec.setIdFunc(18);
    sec.setNome("Linda");
    sec.setDocumento("CPF");
    sec.setEmail ("linda@hotmail.com");
    sec.setRamal(" X ");
    sec.setTelefone("999999999");

    Operador op = new Operador();

    op.setIdFunc (39);
    op.setNome ("Eduardo");
    op.setDocumento ("CPF");
    op.setEmail ("eduardo@hotmail.com");

    RegistroPonto regGerente = new RegistroPonto();
    RegistroPonto regSec = new RegistroPonto();
    RegistroPonto regOp = new RegistroPonto();

    regGerente.setDataRegistro(LocalDate.now());
    regGerente.setHoraEntrada(LocalDateTime.now());
    Thread.sleep(3000);
    regGerente.setHoraSaida(LocalDateTime.now());
    regGerente.apresentarRegistroPonto(gerente);
    Thread.sleep(1000);

    regSec.setDataRegistro(LocalDate.now());
    regSec.setHoraEntrada(LocalDateTime.now());
    Thread.sleep(3000);
    regSec.setHoraSaida(LocalDateTime.now());
    regSec.apresentarRegistroPonto(sec);
    Thread.sleep(1000);

    regOp.setDataRegistro(LocalDate.now());
    regOp.setHoraEntrada(LocalDateTime.now());
    Thread.sleep(3000);
    regOp.setHoraSaida(LocalDateTime.now());
    regOp.apresentarRegistroPonto(op);
    Thread.sleep(1000);



    }
}