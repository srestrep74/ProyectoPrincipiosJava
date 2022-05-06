public class User{

    private String usuario;
    private String contraseña;

    public User(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String getContraseña(){
        return this.contraseña;
    }


}