import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto (Funcionario func)
    {
        System.out.println("======================================");
        System.out.println("Nome Funcionario: " + func.getNome());
        System.out.println("Data de registro do Ponto: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataRegistro));
        System.out.println("Entrada: " + DateTimeFormatter.ofPattern("HH:mm:ss").format(horaEntrada));
        System.out.println("Saida: " + DateTimeFormatter.ofPattern("HH:mm:ss").format(horaSaida));
        System.out.println("======================================");

    }

}
