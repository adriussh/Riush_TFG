package PrimerAnyo.SegundoTr.Sesion0901;

public class Persona {
        //atributos
        private String dni;
        private String nombre="Javier";
        private String apellidos;
        private int edad;

        //métodos
        public Persona() {
            apellidos = "Almendro";
        }

        public String getDni(){
            return dni;
        }

        public void setDni(String dni){
            this.dni = dni;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getApellidos(){
            return apellidos;
        }

        public void setApellidos(String apellidos){
            this.apellidos = apellidos;
        }

        public int getEdad(){
            return edad;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

}
