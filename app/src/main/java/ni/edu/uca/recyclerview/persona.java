package ni.edu.uca.recyclerview;

/**
 * Created by Administrador on 09/11/2016.
 */

public class Persona {

    String mNombre;
    String mApellido;
    public Persona(String nombre, String apellido){
        this.mNombre = nombre;
        this.mApellido= apellido;
    }

    @Override
    public String toString() {
        return String.format("%s %s", mNombre, mApellido);
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmApellido() {
        return mApellido;
    }

    public void setmApellido(String mApellido) {
        this.mApellido = mApellido;
    }
}
