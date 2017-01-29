/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author manolo
 */
public class ClaseFactorial {
    
    public static int calculoSinFactorial (int numeroCalcular) throws IllegalArgumentException {
        
        int factorial=1;
        
        if (numeroCalcular<1) 
            throw new IllegalArgumentException("El Numero debe de ser mayor o igual 1");
        
        for (int i=2;i<=numeroCalcular;i++){
            
            factorial = factorial * i;
        }
        
        return factorial;
        
    }
    
    public static int calculoConFactorial (int numeroCalcular) {
        
        if (numeroCalcular > 1) 
            return numeroCalcular * calculoConFactorial(numeroCalcular-1);
        else
            return 1;
    }
}
