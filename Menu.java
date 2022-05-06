import java.util.*;
import java.io.*;
public class Menu {
    
    
    public static void menuInicial(){
        User usuariosUser;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           0.Salir
                           1.Login
                           2.Registrarme
                           
                           """);
        System.out.println("\n ¿Que opción desea realizar?");
        String opcion = sc.nextLine().toLowerCase();

        switch(opcion){

            case "salir":
                break;
            case "login":
                System.out.println("Ingrese su nombre de usuario");
                String usuarioRegistrado = sc.nextLine();
                System.out.println("Ingrese su contraseña");
                String contraseñaRegistrada = sc.nextLine();
                String usuarioCompleto = usuarioRegistrado+"-"+contraseñaRegistrada;
                Procesos.validarUsuario(usuarioCompleto);
                break;
            case "registrarme":
                System.out.println("\n Ingrese su nombre de usuario");
                String usuario = sc.nextLine().toLowerCase();
                System.out.println("\n Ingrese su contraseña");
                String contraseña = sc.nextLine();
                usuariosUser = new User(usuario,contraseña);
                Entradas.registrarse(usuariosUser);
                Menu.menuInicial();
                break;
            default:
                System.out.println("\n Opción ingresada es incorrecta");
                Menu.menuInicial();
        }
    }

    public static void MenuPrincipal(){
        Publicaciones obj_publicacion;
        Comentarios obj_Comentario;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           \n
                           MENU:
                           0.Salir
                           1.Realizar una publicación de tu testimonio
                           2.Ver todas las publicaciones
                           3.Realizar un comentario a una publicación
                           4.Ver comentarios de una publicación
                           5.Ver publicaciones de cierta categoria
                           """);
        System.out.println("\n Ingrese el número de la opción que desea realizar");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){

            case 0:
                Menu.menuInicial();
                break;
            case 1:
                System.out.println("Ingrese su nombre de usuario");
                String nombreUsuario = sc.nextLine();
                System.out.println("""
                                \n
                                CATEGORIAS: 
                               
                                1.Salud
                                2.Genero
                                3.Edad
                                4.Salario
                                5.Discriminación
                                6.Inequidad
                                7.Mobbing
                                8.Bossing
                                9.Acoso Perverso
                                """);
                System.out.println("\n Ingrese la categoria a la cual está enfocada su publicación");
                String categoria = sc.nextLine().toLowerCase();
                System.out.println("Ingrese su publicación");
                String publicacion = sc.nextLine();
                obj_publicacion = new Publicaciones(nombreUsuario,categoria,publicacion);
                Entradas.publicar(obj_publicacion);
                break;
            case 2:
                Salidas.verPublicaciones();
                Menu.MenuPrincipal();
                break;
            case 3:
                System.out.println("PUBLICACIONES: \n");
                Salidas.verPublicaciones();
                System.out.println("\n Ingrese el número de la publicación que quiere comentar");
                String numeroPublicacion = sc.nextLine();
                System.out.println("Escriba su comentario");
                String comentario = sc.nextLine();
                obj_Comentario = new Comentarios(numeroPublicacion,comentario);
                Entradas.comentar(obj_Comentario);
                break;
            case 4:
                System.out.println("PUBLICACIONES:");
                Salidas.verPublicaciones();
                System.out.println("Ingrese el numero de la publicacion que quiere ver sus comentarios");
                String publicacionComentarios = sc.nextLine();
                Salidas.verComentarios(publicacionComentarios);
                Menu.MenuPrincipal();
                break;
            case 5:
                Boolean verificacion = false;
                System.out.println("""
                        CATEGORIAS: 
                
                        1.Salud
                        2.Genero
                        3.Edad
                        4.Salario
                        5.Discriminación
                        6.Inequidad
                        7.Mobbing
                        8.Bossing
                        9.Acoso Perverso
                        """);
                System.out.println("Ingrese el nombre de la categoria de la cual quiere ver las publicaciones");
                String categoriaSeleccionada = sc.nextLine().toLowerCase();
                Procesos.validarPublicacionCategoria(verificacion, categoriaSeleccionada);
                Menu.MenuPrincipal();
                break;
            default:
                System.out.println("Opción seleccionada incorrecta");
                MenuPrincipal();
                break;
        }
    }
}