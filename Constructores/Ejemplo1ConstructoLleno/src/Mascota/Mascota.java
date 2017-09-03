/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascota;

/**
 *
 * @author Fernanda
 * @date 01/09/17
 */
public class Mascota {

    private String especie; //El tipo de especie que es el objeto mascota
    private String raza; //Raza del objeto mascota
    private int edad; //Edad de cada objeto mascota
    private String color; //Color de cadaobjeto mascota

    //Constructor: cuando se cree un objeto Mascota se ejecutará el código que incluyamos en el constructor
    public Mascota(String valorEspecie, String valorRaza, int valorEdad, String valorColor) {
        especie = valorEspecie;
        raza = valorRaza;
        edad = valorEdad;
        color = valorColor;
    } //Cierre del constructor

    //Método para obtener la raza del objeto mascota
    public String getRaza() {
        return raza;
    } //Cierre del método

    //Método para obtener la especie del objeto Mascota
    public String getEspecie() {
        return especie;
    } //Cierre del método

    //Método para obtener el color del objeto mascota
    public String getColor() {
        return color;
    } //Cierre del método  

    //Método para obtener la edad del objeto Mascota
    public int getEdad() {
        return edad;
    } //Cierre del método

    public static void main(String[] args) {
        Mascota ma = new Mascota("Gato", "Siames", 1, "Color"); //Se crea un nuevo objeto mascota con sus parametros

        String Especie = ma.getEspecie(); //se obtienen los valores
        String Raza = ma.getRaza();
        int Edad = ma.getEdad();
        String Color = ma.getColor();

        System.out.println("La mascota es: " + Especie + " " + Raza + " " + Edad + " " + Color); //se despliegan los valores
    }

    /**
     * Los constructores de una clase son fragmentos de código que sirven para
     * inicializar un objeto a un estado determinado. Una clase puede carecer de
     * constructor pero esto no es lo más habitual. Normalmente todas nuestras
     * clases llevarán constructor.
      */
  }
