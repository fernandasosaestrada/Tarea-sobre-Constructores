/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ave;

/**
 *
 * @author Fernanda
 * @date 01/07/17
 */
public class Ave {

    public void volar() { //Metodod para que un objeto animal vuele
        System.out.println("Animal comiendo...");
    }
}

class Aguila extends Ave {

    @Override
    public void volar() { //Se crea un nuevo objeto de la clase Ave
        
        Aguila c = new Aguila(); //Se crea un nuevo objeto de la clase Aguila
        c.volar(); //El objeto aguila retorna lo que haya en el metodo volar
    }
}
