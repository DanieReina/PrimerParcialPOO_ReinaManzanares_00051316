import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    static ArrayList<Articulo> listaDeArticulos = new ArrayList<Articulo>();
    private static String nuevoNombre;

    public static void main(String[] args) {
        menuPrincipal();

    }

    static void menuPrincipal(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            mostrarMenuPrincipal();

            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 4) {
                    System.out.println("Hasta pronto...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarArticulo();
                        break;
                    case 3:
                        mostrarInventario();
                        break;
                    default:
                        System.out.println("\nPor favor, ingrese una opcion valida.\n");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("\nPor favor, ingrese una opcion valida.\n");
            }
        }

    }

    private static void agregarArticulo(){
        int tipoArticulo = obtenerTipoArticulo();
        Articulo articulo = null;
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el nombre del articulo:");
        String nombre = sn.nextLine();
        System.out.println("Ingrese el modelo del articulo:");
        String modelo = sn.nextLine();
        System.out.println("Ingrese la descripcion del articulo: ");
        String descripcion = sn.nextLine();
        System.out.println("Ingrese el precio del articulo: ");
        double precio = sn.nextDouble();

        articulo = new Articulo(nombre, modelo, descripcion, precio) {
            @Override
            public double obtenerPrecio(double precio) {
                return 0;
            }

            @Override
            public String obtenerDescripcion(String descripcion) {
                return null;
            }


        };
        switch (tipoArticulo){
            case 1:
                System.out.println("Ingrese la marca del celular: ");
                String marca = sn.nextLine();
                System.out.println("Ingrese la resolucion de la camara: ");
                String resolutionCamara = sn.nextLine();
                articulo = new Celular(nombre, modelo, descripcion, resolutionCamara, marca );

                break;
            case 2:
                System.out.println("Ingrese el nombre del procesador: ");
                String procesador = sn.nextLine();
                System.out.println("Ingrese tarjeta gracifa que posee la laptop: ");
                String tarjetaGrafica = sn.nextLine();
                System.out.println("Ingrese la capacidad de almacenamiento del la Laptop en GB: ");
                String capacidadAlmacenamientoGB = sn.nextLine();
                articulo = new Laptop(nombre, modelo, descripcion, procesador, tarjetaGrafica, capacidadAlmacenamientoGB );
                break;

        }

        //Agregando el articulo a la lista
        listaDeArticulos.add(articulo);
    }


    private static int obtenerTipoArticulo() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de articulo:\n"
                        + "\t1. Celular\n"
                        + "\t2. Laptop\n"

                );
                System.out.print("Opcion > ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 2) return opcion;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
            sn.nextLine();
        }

    }

    private static void modificarArticulo() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Articulo a modificar:");
        String nombre = sn.nextLine();

        //Recorriendo la lista de articulos
        for (int i = 0; i < listaDeArticulos.size(); i++) {

            if (listaDeArticulos.get(i).getNombre().equals(nombre)){

                System.out.print("\nIngrese el nuevo nombre :"+listaDeArticulos.get(i).getNombre()+ ":");
                float nuevoSalario = sn.nextFloat();

                //Se reasigna el salario
                listaDeArticulos.get(i).setNombre(nuevoNombre);

                //Se imprime
                System.out.println("\nNombre de"+listaDeArticulos.get(i).getNombre()+" actualizado exitosamente...\n");


                return;
            }
        }
    }

    private static void mostrarInventario() {

        System.out.println("\n#\t| Nombre\t\t| Modelo\t\t\t| Descripcion");

        //Recorriendo la lista
        for (int i = 0; i < listaDeArticulos.size(); i++) {

            Articulo art = listaDeArticulos.get(i);
            //Imprimiendo los datos
            System.out.println((i+1)+"\t| "+art.getNombre()+"\t| "+art.getModelo()+"\t| "+art.descripcion);
        }
        System.out.println("\n");
    }
    static void mostrarMenuPrincipal(){
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar Articulo\n"
                + "\t2. Modificar Articulp\n"
                + "\t3. Mostrar Inventario\n"
                + "\t4. Salir\n"
        );
        System.out.print("Opcion : ");
    }
    }
