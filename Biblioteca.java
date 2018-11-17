/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro lib1=new Libro("El viento en los sauces", "Grahame",5,1);
        lib1.prestamo(1);
        lib1.devolucion(1, lib1);
        System.out.println(lib1.toString());
    }
    
}
