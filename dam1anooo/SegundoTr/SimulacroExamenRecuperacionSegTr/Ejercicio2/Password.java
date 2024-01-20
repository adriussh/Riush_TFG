package PrimerAnyo.SegundoTr.SimulacroExamenRecuperacionSegTr.Ejercicio2;

public class Password {
    private final static int LONG_DEFECTO=8;
    /*atributos*/

    private int longitud=LONG_DEFECTO;
    private String contrasena;

    //contructores
    //Por defecto
    public Password() {
    }

    //Parametrizado
    public Password(int longitud) throws LongitudIncorrecta {
        if (longitud<LONG_DEFECTO){
            throw new LongitudIncorrecta("Se necesita una contraseña con longitud minima de 8");
        }
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    //getter's and setter's
    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws LongitudIncorrecta, ContrasenaIncorrecta {
        if (longitud<LONG_DEFECTO){
            throw new LongitudIncorrecta("Se necesita una contraseña con longitud minima de 8 AAAAAAAAAA");
        }
        this.longitud = longitud;
        this.contrasena=generarPassword();
        if (!esFuerte()){
            throw new ContrasenaIncorrecta("La contraseña generada no es totalmente segura jeje");
        }
    }

    //Metodos
    private String generarPassword() {
        String password_generada=null;
        for (int i=0; i<longitud;i++){
            int eleccion= (int) Math.floor(Math.random()*3+1);
            if (eleccion==1){
                //minusculas
                char minuscula = (char) ((int)Math.floor(Math.random()*(123-97)+97));
                password_generada=password_generada+minuscula;
            } else {
                if (eleccion==2){
                    //mayusculas
                    char mayuscula = (char) ((int)Math.floor((Math.random()*(91-65)+65)));
                    password_generada=password_generada+mayuscula;
                }
                else {
                    // 3 numeros
                    char numero = (char) ((int)Math.floor((Math.random()*(58-48)+48)));
                    password_generada=password_generada+numero;

                }
            }
        }
        return password_generada;
    }

    public boolean esFuerte(){
        boolean resultado=false;
        int cuentanumeros=0;
        int cuentamayusculas=0;
        int cuentaminusculas=0;
        if (cuentanumeros>=5&&cuentaminusculas>=1&&cuentamayusculas>=2){
            resultado=true;
        }
        for (int i=0;i<contrasena.length();i++){
            if (contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122){
                cuentaminusculas++;
            }
            else {
                if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90){
                    cuentamayusculas++;
                }
                else{
                    cuentanumeros++;
                }
            }
        }
        return resultado;
    }
}
