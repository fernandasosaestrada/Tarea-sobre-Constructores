
package Automoviles;

/**
 *
 * @author Fernanda
 * @ date 01/09/17
 */
public class Automovil {

    public Automovil() { //Creamos un constructor que se ejecute cada vez que se cree un objeto Automovil
        String Marca = ""; //Marca del objeto automovil
        int kilometraje = 0; //Kilometraje del objeto automovil
    }

    public static void main(String[] args) {

        Automovil auto = new Automovil();
        /*
         * No se requiere parámetros para la creación de este objeto y se
         * inicializan a unos valores por defecto (Marca cadena vacía y kilometraje
         * cero). 
         */

    }
    /*
    * En general un constructor no estará vacío, pero en algunos casos particulares puede estarlo.
    * Si el constructor carece de contenido los campos se inicializan con valor nulo o, si son tipos definidos en otra clase,
    *como se haya definido en el constructor de la otra clase. 
    *Excepto en casos controlados, evitaremos que existan constructores vacíos.
     */
}
