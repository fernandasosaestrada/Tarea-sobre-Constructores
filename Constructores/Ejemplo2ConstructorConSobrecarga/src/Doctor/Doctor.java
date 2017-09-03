
package Doctor;

/**
 *
 * @author Fernanda
 * @date 01/09/17
 */
public class Doctor {

    private String especialidad; //Especialidad del objeto Doctor
    private int cedula;//Cedula del objeto Doctor

    //Constructores: cuando se cree un objeto Doctor se ejecutará el código que incluyamos en este constructor dependiendo si ingresamos su especialidad o la cedula
    public Doctor(int cedulaDoctor) { //CONSTRUCTOR 1
        especialidad = "";
        cedula = cedulaDoctor;
    }

    public Doctor(String especialidadDoctor) {   //CONSTRUCTOR 2
        especialidad = especialidadDoctor;
        cedula = 0;
    }
    
    //Método para obtener la cedula del objeto Doctor
    public int getCedula() {
        return cedula;
    }

    //Método para obtener la especialidad del objeto Doctor
    public String getEspecialidad() {
        return especialidad;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor(20192030);
        int Cedula = doc.getCedula();
        
        System.out.println( Cedula +"");

        /**
         *Cuando más de un constructor o método tienen el mismo nombre pero distintos 
         * parámetros decimos que el constructor o método está sobrecargado. 
         * La sobrecarga de constructores o métodos permite llevar a cabo una tarea de distintas maneras (por ejemplo crear un objeto 
         * Doctor con una cedula ya establecida o crearlo con una especialidad establecida).
         */
    }

}
