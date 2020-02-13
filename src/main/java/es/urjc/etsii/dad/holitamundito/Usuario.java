package es.urjc.etsii.dad.holitamundito;

public class Usuario {

	private String nick;
	private String correo;
	private String nombre;
	private String apellidos;
	
	@ManyToMany(mappedBy="usuario")
	//PONER ALGO
	
	public Usuario() {
		
	}
	public Usuario(String nick, String correo, String nombre, String apellidos) {
		nick = this.nick;
		correo = this.correo;
		nombre = this.nombre;
		apellidos = this.apellidos;
	}
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "Usuario [nick=" + nick + ", correo=" + correo + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	

	
}
