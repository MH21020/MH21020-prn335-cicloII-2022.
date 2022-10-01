package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control;

import java.util.ArrayList;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author Samuel
 */
public class BolsaTrabajo {

    ArrayList<Persona> persona = new ArrayList<>();

    public BolsaTrabajo() {

        persona.add(new Persona(1, "jose", "osorio", "mi casa", "M", "1999/09/06", true, "chepe", "No", "soltero/a"));
        persona.add(new Persona(2, "jose", "clemente", "su casa", "M", "2000/01/03", true, "armando", "No", "soltero/a"));
        persona.add(new Persona(3, "carlos", "roberto", "candelaria", "M", "2001/09/04", true, "carlitos", "No", "soltero/a"));
        persona.add(new Persona(4, "cristiano", "ronaldo", "soyapango", "M", "1985/02/05", true, "el bicho", "No", "casado/a"));
        persona.add(new Persona(5, "leonel", "messi", "apopa", "M", "1987/05/24", true, "la pulga", "No", "casado/a"));
        
    }

      public ArrayList<Persona> getPersona() {
        return persona;
    }
    public void agregarFiltrado(ArrayList<Persona> filtrado){
        this.persona=filtrado;
    }
    

    public Boolean AgregarPersona(int id_persona, String nombres, String apellidos, String direccion, String genero, String fecha_nacimiento, boolean jubilado, String conocido_por, String CapacidadesEspeciales, String EstadoCivil) {
        Persona 
        nPerson= new Persona();
        nPerson.setId_persona(id_persona);
        nPerson.setNombres(nombres);
        nPerson.setApellidos(apellidos);
        nPerson.setDireccion(direccion);
        nPerson.setGenero(genero);
        nPerson.setFecha_nacimiento(fecha_nacimiento);
        nPerson.setJubilado(jubilado);
        nPerson.setConocido_por(conocido_por);
        nPerson.setCapacidadesEspeciales(CapacidadesEspeciales);
        nPerson.setEstadoCivil(EstadoCivil);
        this.persona.add(nPerson);
        return true;
    }
    
    public ArrayList<Persona> BuscarPersonas( String nombre){
        ArrayList<Persona> filtrado= new ArrayList<Persona>();
        
        for (int i = 0; i < this.persona.size(); i++) {
            if (this.persona.get(i).getNombres().equals(nombre)) {
                filtrado.add(this.persona.get(i));
            }
        }
        return filtrado;
    }

}
