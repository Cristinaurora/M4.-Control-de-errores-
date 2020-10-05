import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) { 
		
		int billete5= 5;
		int billete10= 10;
		int billete20= 20;
		int billete50= 50;
		int billete100= 100;
		int billete200= 200;
		int billete500= 500;
			
		int[] preciototal= {billete5, billete10, billete20, 
				billete50, billete100, billete200, billete500}; 
		
		int preuototal= 25;
		
		String[] nombreplatos = new String[4];

		float[] precioplatos= new float[4];
		
		ArrayList menu = new ArrayList();
		
		menu.add("Taco");
		menu.add("Torta");
		menu.add("Tamal");
		menu.add("Tinga");

		// FIN DE LA FASE 1
		
		HashMap<String, Integer> platos = new HashMap<String, Integer>();

	    for (int i=0; i<4; i++) {

			int precio;
			String platillo; 
			
			Scanner menus= new Scanner (System.in); 
			System.out.println ("Ingrese el platillo " + i + " de 4:" );
			platillo= menus.nextLine(); 
		
			System.out. println ("Ingrese el precio" + i + " de 4:");
			precio= menus.nextInt();
			
			platos.put(platillo, precio);
	    
	    }
	    
	    // Mostrar
		System.out.println ("el menú:" );

	    for (String i : platos.keySet()) {

	        System.out.println(i + ":"+platos.get(i));
	        
	    }
	    	    
	    // Escoger 
	  
	    int seguirEscogiendo = 1;
	    List<String> platillosPedidos = new ArrayList<String>();
	    
	    while (seguirEscogiendo == 1) {

	    	try {
		    	Scanner decidir = new Scanner (System.in); 
				System.out.println ("Introduce platillo a escoger:" );
				platillosPedidos.add(decidir.nextLine());
				
				System.out.println ("¿Quieres seguir escogiendo? 1:Sí 0:No" );
				seguirEscogiendo = decidir.nextInt();
	    	}
	    	catch(Exception e) {
				System.out.println ("El producto seleccionado no existe" );
				seguirEscogiendo = 0;
	    	}

	    }
	    
	    float precioTotal = 0;	    
	    for (int i = 0; i < platillosPedidos.size(); i++) {
	    	
	    	try {

		    	precioTotal += platos.get(platillosPedidos.get(i));
	            System.out.println(platillosPedidos.get(i));
	    	}
	    	catch(Exception e) {
				System.out.println ("El producto seleccionado no existe" );
	    	}

        }
	    
	    System.out.println("total: " + precioTotal);

	    
	}
}
