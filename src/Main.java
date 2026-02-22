import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Libro> LibroList = new ArrayList<>();
        int op;
        String buscar;
        String LibroP;
        boolean encontrado;
        System.out.println("Bienvenido (•◡•) /");

        do {
            System.out.println("\nPor favor eliga una de las siguientes opciones:");
            System.out.println(" 1. Para agregar un nuevo libro \n 2. Libros disponibles \n 3. Buscar libro por titulo \n 4. Sacar libro \n 5. Salir");
            op = teclado.nextInt();
            switch (op) {
                case 1://agregar libro
                    Libro(teclado, LibroList);
                    break;
                case 2://lista de libros
                    System.out.println("Lista de libros: \n");
                    for (Libro L : LibroList) {
                        System.out.println(L.mostrarInfo());
                    }
                    break;
                case 3://Buscar libro
                    System.out.println("Nombre del libro deseas buscar?:");
                    buscar = teclado.next();
                    for (Libro L : LibroList) {
                        if (buscar.equalsIgnoreCase(L.getTitulo())) {//equalsIgnoreCase:independiente de qeu el usuario escriva en minusculas o mayusculas pueda buscar el libro
                            System.out.println(L);
                            break;
                        } else {
                            System.out.println("El libro no se encontro o no esta bien escrito \nPor favor intentelo de nuevo");
                            break;
                        }
                    }
                    break;
                case 4://Prestar libro
                    System.out.println("Ingrese el titulo del libro que desea sacar prestado: ");
                    teclado.nextLine();
                    LibroP= teclado.nextLine();

                    encontrado=false;//Para que empience en falso
                    for (Libro L : LibroList) {
                        if (LibroP.equalsIgnoreCase(L.getTitulo())) {//equalsIgnoreCase:independiente de que el usuario escriva en minusculas o mayusculas pueda buscar el libro
                            L.prestarLibro();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Libro no encontrado ");
                    }break;

                case 5://salir
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");

            }
        } while (op != 5);
    }

    private static void Libro (Scanner teclado, List<Libro>LibroList){
        teclado.nextLine();
        System.out.println("Escriba el titulo del libro:");
        String Titulo = teclado.nextLine();
        System.out.println("Escriba el nombre del Autor:");
        String Autor = teclado.nextLine();
        System.out.println("Cantidad de ejemplares:");
        int CantidadE= teclado.nextInt();

        Libro libro= new Libro(Titulo, Autor, CantidadE);
        LibroList.add(libro);
        System.out.println("--Libro registrado...");
    }
}
