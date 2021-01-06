import java.util.Scanner;

public class Agenda_Objetos {
	
	public static int PintaMenu() {
		
		int menu;
		Scanner leermenu = new Scanner(System.in);
		System.out.println("para añadir usuarios pulse : 1");
		System.out.println("para buscar un usuario pulse : 2");
		System.out.println("para modificar los datos de un usuario pulse : 3");
		System.out.println("para buscar todos los usuarios pulse : 4");
		System.out.println("para borrar un usuario pulse : 5");
		System.out.println("para salir pulse : 6");
		System.out.println("¿Que desea hacer?");
		menu = leermenu.nextInt();
		return menu;
		
	}
	
	

	public static void main(String[] args) {
		
		int numusuario;
		String nombrebuscar;
		Scanner leerusuario = new Scanner(System.in);
		System.out.println("¿Cuantos usuarios vas a introducir?");
		numusuario = leerusuario.nextInt();
		Usuario usuario[] = new Usuario[numusuario];
		PintaMenu();
		while (PintaMenu() != 6) {
			if (PintaMenu()>0 && PintaMenu()<6) {
				switch (PintaMenu()) {
				case 1: {
					for (int i = 0; i < numusuario; i++) {
						System.out.println("dime el nombre del usuario" + (i+1));
						usuario[i] = usuario[i].setNombre(nombre);
						System.out.println("dime el numero del usuario" + (i+1));
						usuario[i] = usuario[i].setNumero(numero);	
					}
					PintaMenu();
				}
				case 2: {
					System.out.println("dime el nombre del usario que quieres buscar");
					Scanner leernombre = new Scanner(System.in);
					nombrebuscar = leernombre.next();
					for (int i = 0; i < numusuario; i++) {
						if (nombrebuscar.equals(usuario[i].getNombre())) {
							usuario[i].toString();
						}
					}
					PintaMenu();
				}
				case 3: {
					for (int i = 0; i < numusuario; i++) {
						System.out.println("dime el nombre del usario que quieres modificar");
						Scanner leernombre = new Scanner(System.in);
						nombrebuscar = leernombre.next();
						for (int j = 0; j < numusuario; j++) {
							if (nombrebuscar.equals(usuario[j].getNombre())) {
								System.out.println("dime el nuevo nombre del usuario");
								usuario[j].setNombre(null);
								System.out.println("dime el nuevo numero del usuario");
								usuario[j].setNumero(0);
								usuario[j].toString();
							}
						}
						PintaMenu();
					}
				}	
				case 4: {
					for (int i = 0; i < numusuario; i++) {
						
						for (int k = 0; k < numusuario; k++) {
								usuario[k].toString();
						}
						PintaMenu();
					}
				}
				case 5: {
					for (int i = 0; i < numusuario; i++) {
						System.out.println("dime el nombre del usario que quieres modificar");
						Scanner leernombre = new Scanner(System.in);
						nombrebuscar = leernombre.next();
						for (int l = 0; l < numusuario; l++) {
							if (nombrebuscar.equals(usuario[l].getNombre())) {
								System.out.println("dime el nuevo nombre del usuario");
								usuario[l].setNombre(null);
								System.out.println("dime el nuevo numero del usuario");
								usuario[l].setNumero(0);
								usuario[l].toString();
							}
						}
						PintaMenu();
					}
				}
			}

			
		}
	}

}
}
