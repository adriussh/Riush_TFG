package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio2;

public final class Programador {
    //atributos
    private String nombre;
    private String dni;
    private double salario_base;
    private int retencion;
    private double salario_neto;
    private String lenguaje_prog;
    private Categoria categoria;


    //constructores

    //por defecto
    public Programador() {
    }

    //parametrizado


    public Programador(String nombre, String dni, int retencion, String lenguaje_prog, String categoria) throws DniInvalido, RetencionIncorrecta {
        this.nombre = nombre.toLowerCase();
        if (!verificar_dni(dni.toUpperCase())) {
            throw new DniInvalido("El DNI es incorrecto");
        }
        this.dni = dni.toUpperCase();

        if (retencion < 0 || retencion > 50) {
            throw new RetencionIncorrecta("La retencion tiene que estar comprendida entre 0 y 50");
        }
        this.retencion = retencion;
        this.lenguaje_prog = lenguaje_prog.toUpperCase();
        if (!Categoria.junior.toString().equals(categoria.toLowerCase()) && !Categoria.senior.toString().equals(categoria.toLowerCase()) && !Categoria.jefe_proyecto.toString().equals(categoria.toLowerCase())) {
            throw new IllegalArgumentException("La categoria no es correcta");
        }
        this.categoria = Categoria.valueOf(categoria);
        if (Categoria.junior.toString().equals(categoria)) {
            this.salario_base = 18000;
        } else if (Categoria.senior.toString().equals(categoria)) {
            this.salario_base = 27000;
        } else {
            this.salario_base = 35000;
        }

        this.salario_neto = calcularsalarioneto();
    }

    private double calcularsalarioneto() {
        return salario_base - salario_base * (retencion / 100);
    }

    private boolean verificar_dni(String toUpperCase) {
        boolean esvalido = false;
        Integer numero = Integer.parseInt(dni.substring(0, dni.length() - 1));
        Integer resto = numero % 23;
        char letra_insertada = dni.charAt(dni.length() - 1);
        char letra_correcta = 0;
        char letra_supuesta = 0;

        switch (resto) {
            case 0:
                letra_supuesta = 'T';
                break;
            case 1:
                letra_supuesta = 'R';
                break;
            case 2:
                letra_supuesta = 'W';
                break;
            case 3:
                letra_supuesta = 'A';
                break;
            case 4:
                letra_supuesta = 'G';
                break;
            case 5:
                letra_supuesta = 'M';
                break;
            case 6:
                letra_supuesta = 'Y';
                break;
            case 7:
                letra_supuesta = 'F';
                break;
            case 8:
                letra_supuesta = 'P';
                break;
            case 9:
                letra_supuesta = 'D';
                break;
            case 10:
                letra_supuesta = 'X';
                break;
            case 11:
                letra_supuesta = 'B';
                break;
            case 12:
                letra_supuesta = 'N';
                break;
            case 13:
                letra_supuesta = 'J';
                break;
            case 14:
                letra_supuesta = 'Z';
                break;
            case 15:
                letra_supuesta = 'S';
                break;
            case 16:
                letra_supuesta = 'Q';
                break;
            case 17:
                letra_supuesta = 'V';
                break;
            case 18:
                letra_supuesta = 'H';
                break;
            case 19:
                letra_supuesta = 'L';
                break;
            case 20:
                letra_supuesta = 'C';
                break;
            case 21:
                letra_supuesta = 'K';
                break;
            case 22:
                letra_supuesta = 'E';
                break;
        }
        if (letra_insertada == letra_supuesta) {
            esvalido = true;
        }
        return esvalido;
    }

    //getter's y setter's

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniInvalido {
        if (!verificar_dni(dni)) {
            throw new DniInvalido("La letra del dni no conresponde con la numeracion");
        }
        this.dni = dni.toUpperCase();
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) throws RetencionIncorrecta {
        if (retencion < 0 || retencion > 50) {
            throw new RetencionIncorrecta("La retencion tiene que estar comprendida entre 0 y 50");
        }
        this.retencion = retencion;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public double getSalario_neto() {
        return salario_neto;
    }

    public String getLenguaje_prog() {
        return lenguaje_prog;
    }

    public void setLenguaje_prog(String lenguaje_prog) {
        this.lenguaje_prog = lenguaje_prog.toUpperCase();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (!Categoria.junior.toString().equals(categoria.toLowerCase()) && !Categoria.senior.toString().equals(categoria.toLowerCase()) && !Categoria.jefe_proyecto.toString().equals(categoria.toLowerCase())) {
            throw new IllegalArgumentException("La categoria no es correcta");
        }
        this.categoria = Categoria.valueOf(categoria.toLowerCase());
    }

    @Override
    public String toString() {
        return "El empleado "+nombre+" con dni "+dni+" con perfil "+categoria+" programando en "+lenguaje_prog+" tiene un salario base de "+salario_base+
                " que al aplicarle  la retencion "+retencion+" de "+retencion+" le supone un salario neto de "+salario_neto;
    }
}