public class Publicaciones {
    
    private String nombreUsuario;
    private String categoria;
    private String publicacion;

    public Publicaciones(String nombreUsuario, String categoria, String publicacion){
        this.nombreUsuario = nombreUsuario;
        this.categoria = categoria;
        this.publicacion = publicacion;
    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario(){
        return this.nombreUsuario;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setPublicacion(String publicacion){
        this.publicacion = publicacion;
    }

    public String getPublicacion(){
        return this.publicacion;
    }
}
