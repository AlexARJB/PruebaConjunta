package es.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Jornada {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int numJor;
		

		private String fecha;
		private int temporada;
		
		@OneToMany(mappedBy="jornada")
		private ArrayList<Partidos> partidos;

	public Jornada() {}

	public Jornada(int numJ, String fecha, int temporada) {
		numJ = this.numJor;
		fecha = this.fecha;
		temporada = this.temporada;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	public int getNumJ() {
		return numJor;
	}

	public void setNumJ(int numJ) {
		this.numJor = numJ;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Jornada [numJor=" + numJor + ", fecha=" + fecha + ", temporada=" + temporada + "]";
	}
	
}
