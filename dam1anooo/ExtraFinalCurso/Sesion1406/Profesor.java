package PrimerAnyo.ExtraFinalCurso.Sesion1406;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Profesor extends Funcionario{
    protected String ies;
    protected boolean activo;
    protected Grado grado;

    public Profesor(int id, Categoria categoria, Nivel nivel, int anyo_experiencia, String fecha_contrato, String ies, boolean activo, Grado grado) throws AccionIncorrecta {
        super(id, categoria, nivel, anyo_experiencia, fecha_contrato);
        this.ies = ies;
        this.activo = activo;
        this.grado = grado;
        this.salario = calcular_salario();
    }

    public String getIes() {
        return ies;
    }

    public void setIes(String ies) {
        this.ies = ies;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
        this.salario=calcular_salario();
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "ies='" + ies + '\'' +
                ", activo=" + activo +
                ", grado=" + grado +
                ", id=" + id +
                ", categoria=" + categoria +
                ", nivel=" + nivel +
                ", anyo_experiencia=" + anyo_experiencia +
                ", fecha_contrato='" + fecha_contrato + '\'' +
                ", salario=" + salario +
                "} ";
    }

    public double calcular_salario() {
        double totalSalario = 0;
        LocalDate dBefore = LocalDate.parse(this.fecha_contrato, DateTimeFormatter.ISO_DATE);
        String fecha = String.valueOf(LocalDateTime.now().getYear());
        if (LocalDateTime.now().getMonthValue() >= 10) {
            fecha += LocalDateTime.now().getMonthValue();
        } else {
            fecha += "-0" + LocalDateTime.now().getMonthValue();
        }
        fecha += "-" + LocalDateTime.now().getDayOfMonth();

        LocalDate dAfter = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        long dias = ChronoUnit.DAYS.between(dBefore, dAfter);
        int nivelInt = 0;
        switch (this.categoria) {
            case A -> {
                switch (this.nivel) {
                    case uno: {
                        nivelInt = 1;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case dos: {
                        nivelInt = 2;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case tres: {
                        nivelInt = 3;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 1000 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                }
            }
            case B -> {
                switch (this.nivel) {
                    case uno: {
                        nivelInt = 1;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case dos: {
                        nivelInt = 2;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case tres: {
                        nivelInt = 3;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 800 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                }
            }
            case C -> {
                switch (this.nivel) {
                    case uno: {
                        nivelInt = 1;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case dos: {
                        nivelInt = 2;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                    case tres: {
                        nivelInt = 3;
                        switch (this.grado) {
                            case BASICO ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 500;
                            case MEDIO -> totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 200;
                            case SUPERIOR ->
                                    totalSalario = 600 * this.anyo_experiencia + 800 * nivelInt + dias * 50 + 100;
                        }
                    }
                }
            }
        }
        return totalSalario;
    }
}
