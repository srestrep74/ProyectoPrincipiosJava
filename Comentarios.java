public class Comentarios {
    
    private String numeroPublicacion;
    private String comentario;

    public Comentarios(String numeroPublicacion, String comentario){
        this.numeroPublicacion = numeroPublicacion;
        this.comentario = comentario;
    }

    public void setNumeroPublicacion(String numeroPublicacion){
        this.numeroPublicacion = numeroPublicacion;
    }

    public String getNumeroPublicacion(){
        return this.numeroPublicacion;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return this.comentario;
    }

}
