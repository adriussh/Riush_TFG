package PrimerAnyo.SegundoTr.Sesion0202.EjerciciosIniciacionPOO.E1;

public class Planeta {

    //variable de clase - compartida por todos los objetos
    public static int contador=0;

    //atributos de objeto
    private String nombre;
    private int n_satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int dist_sol;
    private String tipo_planeta;
    private boolean visible_a_simple_vista;

    public Planeta(String jupiter, int n_satelites, double pow, double volumen, int diametro, int dist_sol, TipoPlaneta gaseoso, boolean visible_a_simple_vista){

    }

    //constructores
    public Planeta (String nombre, int n_satelites, double masa, double volumen, int diametro, int dist_sol, String tipo_planeta, boolean visible_a_simple_vista){
        this.nombre=nombre;
        this.n_satelites=n_satelites;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.dist_sol=dist_sol;
        this.tipo_planeta=tipo_planeta;
        this.visible_a_simple_vista=false;
        contador++;
    }
    // Calculo densidad
    public double densidaad() {
        double resultado=0;
        resultado = (masa/volumen);
        return resultado;
    }
    // Dentro o fuera del sistema solar
    public boolean esPlanetaExterior(){
        boolean esExterior=false;
        float limite = (float) (149597870*3.4);
        if (dist_sol>limite){
            esExterior=true;
        }
        return esExterior;
    }

    //polimorfismo de sobreescitura de metodos

    public String ToString(){

        return "Nombre: "+this.nombre+" Num satelites: "+this.n_satelites+" Su masa: "+this.masa+" Su volumen: "+this.volumen+" Su diametro: "+this.diametro+" DistanciaSol: "+this.dist_sol+" Visibilidad: "+this.visible_a_simple_vista;
    }

    public void imprimir(){
        System.out.println("El nombre del planeta "+this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_satelites() {
        return n_satelites;
    }

    public void setN_satelites(int n_satelites) {
        this.n_satelites = n_satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDist_sol() {
        return dist_sol;
    }

    public void setDist_sol(int dist_sol) {
        this.dist_sol = dist_sol;
    }

    public String getTipo_planeta() {
        return tipo_planeta;
    }

    public void setTipo_planeta(String tipo_planeta) {
        this.tipo_planeta = tipo_planeta;
    }

    public boolean isVisible_a_simple_vista() {
        return visible_a_simple_vista;
    }

    public void setVisible_a_simple_vista(boolean visible_a_simple_vista) {
        this.visible_a_simple_vista = visible_a_simple_vista;
    }

}
