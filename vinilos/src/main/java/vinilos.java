/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonzalo
 */
public class vinilos {
    public static void main(String[] args) {
        
        String vinilos[][] = new String[100][3];
       
        llenarMatriz(vinilos);
        
        agregarVinilo(vinilos, "Twenty One Pilots", "Scaled and Icy", "2021");
        agregarVinilo(vinilos, "Bad Bunny", "YHLQMDLG", "2020");
        agregarVinilo(vinilos, "The Weekend", "After Hours", "2020");
        agregarVinilo(vinilos, "Dua Lipa", "Future Nostalgia", "2020");
        agregarVinilo(vinilos, "Linkin Park", "Meteora", "2003");
        agregarVinilo(vinilos, "Borgore", "#NEWGOREORDER", "2014");
        agregarVinilo(vinilos, "G-Eazy", "These Things Happen", "2014");
        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "AC-DC", "Black in Black", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the Beast", "1982");
        
        verificador(vinilos);

        buscarColeccion(vinilos, "Iron Maiden");
        buscarColeccion(vinilos, "Meteora");
        buscarColeccion(vinilos, "Kiss");

        mostrarMatriz(vinilos);

    }

    public static String[][] agregarVinilo(String coleccion[][], String alb, String art, String año) {
        int filavacia = 0;
        for (int i = 0; i < coleccion.length; i++) {
            String fila = coleccion[i][0];
            if (fila == "-") {
                filavacia = i;
                break;

            }
        }
        
        String[] datos = new String[3];
        datos[0] = alb;
        datos[1] = art;
        datos[2] = año;

        for (int j = 0; j < coleccion[filavacia].length; j++) {
            coleccion[filavacia][j] = datos[j];

        }

        return coleccion;

    }

    public static void mostrarMatriz(String[][] matriz) {
        int comp=0;
        System.out.println("\n Su coleccion seria la siguiente \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != "-") {
                    System.out.print(matriz[i][j] + "\t ");
                    comp=0;
                }else{
                comp=1;
                }
                

            }
            if (comp==0) {
                System.out.println();
            }
            
        }
    }

    public static void buscarColeccion(String[][] matriz, String busqueda) {
        int resp = 0;
        System.out.println("Buscar en la coleccion: "+ busqueda);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == busqueda) {
                    System.out.println("Su busqueda si esta en la coleccion");
                    
                    resp = 1;
                     System.out.println();
                    break;
                }

            }
            if (resp==1) {
                break;
                
            }
        }
        if (resp == 0) {
            System.out.println("Su busqueda no esta en la coleccion");
            System.out.println();

        }

    }

    public static void verificador(String[][] coleccion) {
        int filavacia = 0;
        
        for (int i = 0; i < coleccion.length; i++) {
            String fila = coleccion[i][0];
            if (fila == "-") {
                filavacia += 1;
                

            }
        }
        int filaocupada = coleccion.length-filavacia;
        System.out.println("Existen "+filaocupada+" vinilos en la coleccion");
        System.out.println("Existen "+filavacia+" espacios para nuevos vinilos en la coleccion");
        System.out.println();
    }
        public static String[][] llenarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "-";

            }
        }
        return matriz;
    }
    
}
