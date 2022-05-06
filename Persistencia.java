import java.io.*;

public class Persistencia {
    
    private static File usuarios;
    private static File publicaciones;
    private static File comentarios;
    static int i = 0;

    public static void guardarUsuario(String usuario, String contraseña){
        
        usuarios = new File("usuarios.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        //ACA CREO EL ARCHIVO SINO EXISTE
        if (!usuarios.exists()) {
            try{
                usuarios.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creating the file");
            }
        }
        try{
            writer = new FileWriter("usuarios.txt",true);
            pw = new PrintWriter(writer);
            pw.println(usuario+"-"+contraseña);
            
        }catch(IOException exception){
                System.err.println("Error opening the file");
        }finally {
           try {
               //ACA CIERRO EL ARCHIVO
           if (null != writer)
              writer.close();
           } catch (IOException e2) {
           }
        }
    }

    public static void guardarPublicacion(String nombreUsuario, String categoria, String publicacion){
        i++;
        publicaciones = new File("publicaciones.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        //ACA CREO EL ARCHIVO SINO EXISTE
        if (!publicaciones.exists()) {
            try{
                publicaciones.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creating the file");
            }
        }
        try{
            writer = new FileWriter("publicaciones.txt",true);
            pw = new PrintWriter(writer);
            pw.println("\n"+i+".Usuario: "+nombreUsuario+"   Categoria:"+categoria+"   Testimonio:"+publicacion);
            
        }catch(IOException exception){
                System.err.println("Error opening the file");
        }finally {
           try {
               //ACA CIERRO EL ARCHIVO
           if (null != writer)
              writer.close();
           } catch (IOException e2) {
           }
        }
    }

    public static void guardarComentario(String numeroPublicacionString, String comentario){
        comentarios = new File("comentarios.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        //ACA CREO EL ARCHIVO SINO EXISTE
        if (!comentarios.exists()) {
            try{
                comentarios.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creating the file");
            }
        }
        try{
            writer = new FileWriter("comentarios.txt",true);
            pw = new PrintWriter(writer);
            pw.println(numeroPublicacionString+"."+comentario);
            
        }catch(IOException exception){
                System.err.println("Error opening the file");
        }finally {
           try {
               //ACA CIERRO EL ARCHIVO
           if (null != writer)
              writer.close();
           } catch (IOException e2) {
           }
        }
    }


}
