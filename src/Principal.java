import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;
/*
Integrantes:
LUIS QUIROZ BURGA
EDUARDO COLLANTES BAZAN
CRISTIAN JORDAN
 */


public class Principal {
    final int MAX = 15;
    static Scanner lector =new Scanner(System.in);
    static Cafetin [] cafetin;
    static private ProductoElaborado[] productoElaborado;
    static private ProductoSellado[] productoSellado;
    static Lote [] lote;
    
    public static void main(String[] args) throws IOException {
        do {
            menuPrincipal();
        } while (true);  
    } 
   
    static void ingresoCafetin(){
        int id , sector ; String nombre , pabellon,sede;
        int n;
        
        System.out.print("Ingrese numero de cafetines: ");
        n=lector.nextInt();
        cafetin= new Cafetin[n];
        for (int i = 0; i < cafetin.length; i++) {
            System.out.println("cafetin numero "+(i+1));
            System.out.print("Ingrese el id: ");
            id= lector.nextInt();
            System.out.print("Ingrese el nombre: ");
            nombre= lector.next();
            System.out.print("Ingrese el pabellon: ");
            pabellon= lector.next();
            System.out.print("Ingrese el sector: ");
            sector= lector.nextInt();
            System.out.print("Ingrese ubicacion de sede: ");
            sede= lector.next();
            cafetin[i]=new Cafetin(id, nombre, pabellon, sector, sede);
        }
        
    }
    
    static void imprimirCafetines(){

        for (Cafetin c : cafetin) {
            System.out.println(c.toString());
        }
    }
    
    static void guardarCafetin() throws IOException{
        String nombre;
        System.out.print("Ingrese el nombre con el que desea guardar: ");
        nombre= lector.next();
        String ruta = "C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Cafeteria/"+nombre +".txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
        bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < cafetin.length; i++) {
                bw.write("cafetin "+(i+1));
                bw.newLine();
                bw.write(cafetin[i].toString());
                bw.newLine();
                }   
        }else{
        bw = new BufferedWriter(new FileWriter(archivo));
                for (int i = 0; i < cafetin.length; i++) {
                bw.write("cafetin "+(i+1));
                bw.newLine();
                bw.write(cafetin[i].toString());
                bw.newLine();
            }   
        }
        bw.close();      
    }
   
    static void modificarCafeteria(){
        
        //pendiente
    }
        
    static void eliminarArchivoCafetin(){
        
        String nombre;
        System.out.print("Ingrese el nombre archivo que desea eliminar : ");
        nombre= lector.next();
        File fichero = new File("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Cafeteria/"+nombre +".txt");

            if (fichero.delete())
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            else
                System.out.println("ERROR: el fichero no existe");

    }
    
    static void buscarArchivoCafetin() throws IOException{
       
        String nombre;
        System.out.print("Ingrese el nombre del archivo que desea buscar: ");
        nombre= lector.next();
        File objetofile = new File ("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Cafeteria/"+nombre +".txt");
            Desktop.getDesktop().open(objetofile); 
    }
   
    static void menuCafeteria() throws IOException{
        System.out.println("MENU CAFETIN: ");
        System.out.println("opciones: ");
        System.out.println("1) Ingresar datos: ");
        System.out.println("2) Mostrar cafeterias: ");
        System.out.println("3) Guarda cafeteria: ");
        System.out.println("4) modificar datos cafeteria: ");
        System.out.println("5) eliminar cafeteria: ");
        System.out.println("6) buscar archivo: ");
        System.out.println("7) Regresar menu principal: ");
        System.out.println("Ingrese Opción: ");
        int op = lector.nextInt();
        
        switch (op) {
            case 1:
                ingresoCafetin();
                break;
            case 2:
                imprimirCafetines();
                break;
            case 3:
                guardarCafetin();
                break;
            case 4:
                modificarCafeteria();
                break;
            case 5:
                eliminarArchivoCafetin();
                break;
            case 6:
                buscarArchivoCafetin();
                break;
            case 7:
                menuPrincipal();
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
                break;
        }
    }
    
     //PRODUCTOS :::::::::
    
    static void ingresoProductoElaborado(){
      
        int n,id,num;String nombre; double precioUnitario;
        System.out.print("Ingrese numero de productos elaborados: ");
        n=lector.nextInt();
        productoElaborado = new ProductoElaborado[n]; 
            for (int i = 0; i < productoElaborado.length; i++) {
                System.out.println("Producto numero "+(i+1));
                System.out.print("Ingrese el id: ");
                id= lector.nextInt();
                System.out.print("Ingrese el nombre: ");
                nombre= lector.next();
                System.out.print("Ingrese el precio unitario: ");
                precioUnitario= lector.nextDouble();
                System.out.print("Ingredientes: ");
            //en desarrollo
            }                
    }
    
    static void ingresoProductoSellado(){
        
        int id,stock;String nombre,marca;double precioUnitario;
        System.out.print("Ingrese numero de productos sellados: ");
                int n=lector.nextInt();
                productoSellado = new ProductoSellado[n];
                    for (int i = 0; i < productoSellado.length; i++) {
                            System.out.println("Producto numero "+(i+1));
                            System.out.print("Ingrese el id: ");
                            id= lector.nextInt();
                            System.out.print("Ingrese el nombre: ");
                            nombre= lector.next();
                            System.out.print("Ingrese el precio unitario: ");
                            precioUnitario= lector.nextDouble();
                            System.out.print("Ingrese marca: ");
                            marca= lector.next();
                            System.out.print("Ingrese Stock: ");
                            stock= lector.nextInt();
                            productoSellado[i] = new ProductoSellado(id, nombre, precioUnitario, marca, stock) ;
                            
                    }
    }
    
     //PRODUCTOS SELLADO:::::::::
                    
    static void menuProducto() throws IOException{
        
        int c;
        System.out.print("Ingrese tipo de producto: \n");
        System.out.print("1)producto elaborado en desarrollo: \n");
        System.out.print("2)producto sellado: \n");
        c=lector.nextInt();
        
        switch (c) {
            case 1:
            {
               //ingresoProductoElaborado();en desarollo
                                    
                break;
            }
            case 2:
            {
                
                do {
                    menuProductoSellado();
                } while (true);
                
            
            }
            default:
            {
                System.out.println("OPCION NO VALIDA!!");
            }
        }
        
    }
    
    static void imprimirProductoSellado(){

         for (ProductoSellado p : productoSellado) {
             System.out.println(p.toString());
            }
    }
    
    static void guardarProductoSellado() throws IOException{
            String nombre;
            System.out.print("Ingrese el nombre con el que desea guardar: ");
            nombre= lector.next();
            String ruta = "C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\ProductoElaborado/"+nombre +".txt";
            File archivo = new File(ruta);
            BufferedWriter bw;
            if(archivo.exists()){
            bw = new BufferedWriter(new FileWriter(archivo));
                for (int i = 0; i < productoSellado.length; i++) {
                    bw.write("Producto Sellado "+(i+1));
                    bw.newLine();
                    bw.write(productoSellado[i].toString());
                    bw.newLine();
                    }   
            }else{
            bw = new BufferedWriter(new FileWriter(archivo));
                    for (int i = 0; i < productoSellado.length; i++) {
                    bw.write("productoSellado "+(i+1));
                    bw.newLine();
                    bw.write(productoSellado[i].toString());
                    bw.newLine();
                }   
            }
            bw.close();      
        }
    
    static void modificarProductoSellado(){
        
        //pendiente
    }
    
    static void eliminarArchivoProductoSellado(){
        
        String nombre;
        System.out.print("Ingrese el nombre archivo que desea eliminar : ");
        nombre= lector.next();
        File fichero = new File("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\ProductoElaborado/"+nombre +".txt");

            if (fichero.delete())
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            else
                System.out.println("ERROR: el fichero no existe");

    }
    
    static void buscarArchivoProductoSellado() throws IOException{
       
        String nombre;
        System.out.print("Ingrese el nombre del archivo que desea buscar: ");
        nombre= lector.next();
          
      

        File objetofile = new File ("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\ProductoElaborado/"+nombre +".txt");
            Desktop.getDesktop().open(objetofile);

        
        
    }
    
    
    static void menuProductoSellado() throws IOException{
        System.out.println("MENU PRODUCTO SELLADO: ");
        System.out.println("opciones: ");
        System.out.println("1) Ingresar datos: ");
        System.out.println("2) Mostrar Productos Sellados: ");
        System.out.println("3) Guarda Productos Sellados: ");
        System.out.println("4) modificar datos de Productos Sellados: ");
        System.out.println("5) eliminar archivo de Productos Sellados: ");
        System.out.println("6) buscar archivo de Productos Sellados: ");
        System.out.println("7) regresar menu principal: ");
        System.out.println("Ingrese Opción: ");
        int op = lector.nextInt();
        
        switch (op) {
            case 1:
                ingresoProductoSellado();
                break;
            case 2:
                imprimirProductoSellado();
                break;
            case 3:
                guardarProductoSellado();
                break;
            case 4:
                modificarProductoSellado();
                break;
            case 5:
                eliminarArchivoProductoSellado();
                break;
             case 6:
                buscarArchivoProductoSellado();
                break;
             case 7:
                menuPrincipal();
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
                break;
        }
    }
    
    //LOTE:::::::::
    
    static void ingresoLote(){
        int id , lotee;
        int n;int a,m,d;
        
        System.out.print("Ingrese numero de lotes: ");
        n=lector.nextInt();
        lote = new Lote[n];
        for (int i = 0; i < lote.length; i++) {
            System.out.println("lote numero "+(i+1));
            System.out.print("Ingrese el id: ");
            id= lector.nextInt();
            System.out.print("Ingrese el lote: ");
            lotee= lector.nextInt();
            System.out.println("Fecha de Vencimiento : ");
            System.out.println("Ingrese dia");
            d=lector.nextInt();
            System.out.println("Ingrese mes");
            m=lector.nextInt();
            System.out.println("Ingrese año");
            a=lector.nextInt();
            Calendar fecha= Calendar.getInstance();
            fecha.set(a, m, d);
            lote[i]=new Lote(id, lotee, fecha);
        }
        
    }
    
    static void imprimirLote(){

        for (Lote t : lote) {
            System.out.println(t.toString());
        }
    }
    
    static void guardarLote() throws IOException{
        String nombre;
        System.out.print("Ingrese el nombre con el que desea guardar: ");
        nombre= lector.next();
        String ruta = "C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Lote/"+nombre +".txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
        bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < lote.length; i++) {
                bw.write("lote "+(i+1));
                bw.newLine();
                bw.write(lote[i].toString());
                bw.newLine();
                }   
        }else{
        bw = new BufferedWriter(new FileWriter(archivo));
                for (int i = 0; i < lote.length; i++) {
                bw.write("lote "+(i+1));
                bw.newLine();
                bw.write(lote[i].toString());
                bw.newLine();
            }   
        }
        bw.close();      
    }
    
    static void modificarLote(){
        
        //pendiente
    }
    
    static void eliminarArchivoLote(){
        
        String nombre;
        System.out.print("Ingrese el nombre archivo que desea eliminar : ");
        nombre= lector.next();
        File fichero = new File("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Lote/"+nombre +".txt");

            if (fichero.delete())
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            else
                System.out.println("ERROR: el fichero no existe");

    }
    
    static void buscarArchivoCLote() throws IOException{
       
        String nombre;
        System.out.print("Ingrese el nombre del archivo que desea buscar: ");
        nombre= lector.next();
          
      

        File objetofile = new File ("C:\\Users\\Luis Quiroz\\Desktop\\CafeteriaUPN\\prueba ficheros\\Lote/"+nombre +".txt");
            Desktop.getDesktop().open(objetofile);

        
        
    }
    
    static void menuLote() throws IOException{
        System.out.println("MENU LOTE: ");
        System.out.println("opciones: ");
        System.out.println("1) Ingresar datos: ");
        System.out.println("2) Mostrar lotes: ");
        System.out.println("3) Guarda lotes: ");
        System.out.println("4) modificar datos de lotes: ");
        System.out.println("5) eliminar lote: ");
        System.out.println("6) buscar archivo de lote: ");
        System.out.println("7) Regresar menu principal: ");
        System.out.println("Ingrese Opción: ");
        int op = lector.nextInt();
        
        switch (op) {
            case 1:
                ingresoLote();
                break;
            case 2:
                imprimirLote();
                break;
            case 3:
                guardarLote();
                break;
            case 4:
                modificarLote();
                break;
            case 5:
                eliminarArchivoLote();
                break;
            case 6:
                buscarArchivoCLote();
                break;
            case 7:
                menuPrincipal();
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
                break;
        }
    }

    //MENU PRINCIPAL:::::::::
    
    static void menuPrincipal() throws IOException{
        System.out.println("menu Principal: ");
        System.out.println("opciones: ");
        System.out.println("1) Productos: ");
        System.out.println("2) Lote: ");
        System.out.println("3) Cafetin: ");
        System.out.println("4) Empleados: ");
        System.out.println("5) Cliente: ");
        System.out.println("6) puesto: ");
        System.out.println("7) pedido: ");
        System.out.println("8) Ubicacion Entrega: ");
        System.out.println("Ingrese Opción: ");
        int op = lector.nextInt();
        
        switch (op) {
            case 1:
                menuProducto();
                break;
            case 2:
                menuLote();
                break;
            case 3:
                menuCafeteria();
                break;
            case 4:
                
                break;
            case 5:
                
                break;
             case 6:
               
                break;
             case 7:
               
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
                break;
        }
    }  
    
}
    
    
    
 
