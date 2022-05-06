import java.io.*;
import java.util.Scanner;

public class Procesos {
    
    public static void validarUsuario(String usuarioCompleto){
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br  =null;
        String texto;
        try{
            fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\usuarios.txt");
            br = new BufferedReader(fr);
            String linea;
            
                try{
                    while((linea=br.readLine())!=null){
                        if(linea.contains(usuarioCompleto))
                            Menu.MenuPrincipal();
                        
                            
                    }
                }catch(IOException e){
                    System.err.println("Error found ");
                }
        }catch(FileNotFoundException e ){
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
            }
        }
    }

    public static void validarPublicacionCategoria(Boolean verificacion, String categoriaSeleccionada){
        File archivo = null;
                FileReader fr = null;
                BufferedReader br  =null;
                String texto;
                try{
                    fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\publicaciones.txt");
                    br = new BufferedReader(fr);
                    String linea;
            
                    try{
                        while((linea=br.readLine())!=null){
                            if(linea.contains(categoriaSeleccionada)){
                                verificacion = true;
                                Salidas.verPublicacionesCategoria(verificacion, categoriaSeleccionada);
                            }  
                        
                            
                        }
                    }catch(IOException e){
                        System.err.println("Error found ");
                    }
                }catch(FileNotFoundException e ){
                }finally{
                    try{
                        if(null != fr){
                            fr.close();
                        }
                    }catch(IOException e2){
                    }
                }
        }

        public static void validarUsuarioRepetido(String usuario, String contraseña){
            File archivo = null;
            FileReader fr = null;
            BufferedReader br  =null;
            String texto;
            try{
                fr = new FileReader("C:\\Users\\rpose\\OneDrive\\Documentos\\PROYECTO\\PoryectoPDS2.0-main\\usuarios.txt");
                br = new BufferedReader(fr);
                String linea;
            
                try{
                    while((linea=br.readLine())!=null){
                        if(linea.contains(usuario)){
                            System.out.println("\n El nombre de usuario ya se encuentra en uso \n");
                            Menu.menuInicial();
                        }else if(!linea.equals(usuario)){
                            Persistencia.guardarUsuario(usuario, contraseña);
                        }
                            
                        
                            
                    }
                }catch(IOException e){
                    System.err.println("Error found ");
                }
        }catch(FileNotFoundException e ){
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

