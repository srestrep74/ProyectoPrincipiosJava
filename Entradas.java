public class Entradas {
    
    public static void registrarse(User usuario){
            String user = usuario.getUsuario();
            String contraseña = usuario.getContraseña();
            Persistencia.guardarUsuario(user, contraseña);
            System.out.println("\n Usuario registrado!\n");
            Menu.menuInicial();
        }
    

    public static void publicar(Publicaciones obj_Publicaciones){
        String nombreUsuario = obj_Publicaciones.getNombreUsuario();
        String categoria = obj_Publicaciones.getCategoria();
        String publicacion = obj_Publicaciones.getPublicacion();
        Persistencia.guardarPublicacion(nombreUsuario, categoria, publicacion);
        System.out.println("\nTu testimonio ha sido publicado!\n");
        Menu.MenuPrincipal();
    }

    public static void comentar(Comentarios obj_Comentario){
        String numeroPublicacion = obj_Comentario.getNumeroPublicacion();
        String comentario = obj_Comentario.getComentario();
        Persistencia.guardarComentario(numeroPublicacion,comentario);
        System.out.println("\n Comentario publicado!");
        Menu.MenuPrincipal();
    }
}
