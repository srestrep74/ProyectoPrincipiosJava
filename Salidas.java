
import java.io.*;
import java.util.Scanner;
public class Salidas {
    
    public static void verPublicaciones(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br  =null;
        
        try{
            fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\publicaciones.txt");
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                if (linea.length()>2 ) {
                    System.out.println("\n"+linea+"\n");
                }else{
                }
        }catch(IOException e ){
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
            }
        }
    }

    public static void verComentarios(String publicacionComentarios){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br  =null;
        
        
        try{
            fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\comentarios.txt");
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                if (linea.contains(publicacionComentarios)) {
                    System.out.println("\n COMENTARIOS:");
                    System.out.println("\n"+linea);
                }
        }catch(IOException e ){
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
            }
        }
    }

    public static void verPublicacionesCategoria(Boolean verificacion, String categoriaSeleccionada){
        if(verificacion == true){
            File archivo = null;
             FileReader fr = null;
            BufferedReader br  =null;
             String texto;
        
            try{
                fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\publicaciones.txt");
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null)
                    if(linea.contains(categoriaSeleccionada)){
                        System.out.println(linea);
                    }else{
                    }
            }catch(IOException e ){
            }finally{
                try{
                    if(null != fr){
                        fr.close();
                    }
                }catch(IOException e2){
                }
            }
        }
    }
}
