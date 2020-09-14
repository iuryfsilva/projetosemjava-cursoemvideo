/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenhoviacodeexe2.pkg18deitel;

/**
 *
 * @author Iury Silva
 */
public class DesenhoViaCodeExe218Deitel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int controleX = 1; controleX < 5; controleX++){
            for(int controleY = 0; controleY < controleX; controleY++){
                if(controleX == 1 || controleX == 4){
                    System.out.println("*********           ***           *       *");
                    break;
                }else{
                    System.out.println("*");
                }
            }
            System.out.println(" ");
        } 
        
        
        System.out.println("*********           ***           *   *");
        System.out.println("*       *         *     *        ***   *");
        System.out.println("*       *        *       *      *****   *");
        System.out.println("*       *        *       *        *   *");
        System.out.println("*       *        *       *        *   *");
        System.out.println("*       *        *       *        *   *");
        System.out.println("*       *        *       *        *   *");
        System.out.println("*       *        *       *      *****   *");
        System.out.println("*       *         *     *        ***   *");
        System.out.println("*********           ***           *   *");
    
        System.out.println("*\n**\n***\n****\n*****");
        
    }
      
}
