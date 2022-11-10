/**
 * @author BORISKA MBILONGO
 * 			YOANN KEMMOGNE
 *          PASSI TCHAGOUE
 *          YOUSSAOU BOBOY	
 */
package main;



import java.io.IOException;
import java.util.Scanner;


import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author BORISKA MBILONGO
 * 			YOANN KEMMOGNE
 *          PASSI TCHAGOUE
 *          YOUSSAOU BOBOY
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
    	int level;
    	Scanner saisieUtilisateur = new Scanner(System.in);
    	System.out.println("A quel niveau voulez vous acceder?");
    	level = saisieUtilisateur.nextInt();

    	saisieUtilisateur.close();
    	
        final Model model = new Model(level);
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        
        view.setController(controller);

        
    	
        
    }
		
}
