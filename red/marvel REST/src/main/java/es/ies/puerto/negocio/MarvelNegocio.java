package es.ies.puerto.negocio;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.mappers.IMapperPoder;
import es.ies.puerto.modelo.db.Db;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MarvelNegocio {
    Db db;
    public MarvelNegocio(){
        db = new Db();
    }
    public void agregarPersonaje(PersonajeDTO personajeDTO){
        db.agregarPersonaje(IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO));
    }
    public void agregarPoder(PoderDTO poderDTO){
        db.agregarPoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO,db.obtenerPersonajesByPoderDTO(poderDTO)));
    }
    public PersonajeDTO obtenerPersonajeById(String id){
        Personaje personaje = new Personaje(id);
        return IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(db.obtenerPersonaje(personaje));
    }

    public List<PersonajeDTO> obtenerPersonajes(){
        List<PersonajeDTO> personajeDTOs = null;
        List<Personaje> personajes = db.obtenerPersonajes();

        if (personajes!=null) {
            personajeDTOs = new ArrayList<>();
            for (Personaje personaje : personajes) {
                personajeDTOs.add(IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(personaje));
            }
        }   
        return personajeDTOs;
    }

    public PoderDTO obtenerPoderById(String id){
        Poder poder = new Poder(id);
        return IMapperPoder.INSTANCE.poderTOpoderDTO(db.obtenerPoder(poder));
    }

    public List<PoderDTO> obtenerPoderes(){
        List<PoderDTO> poderDTOs = null;
        List<Poder> poders = db.obtenerPoderes();

        if (poders!=null) {
            poderDTOs = new ArrayList<>();
            for (Poder poder : poders) {
                poderDTOs.add(IMapperPoder.INSTANCE.poderTOpoderDTO(poder));
            }
        }   
        return poderDTOs;
    }

    public void eliminarPersonaje(PersonajeDTO personajeDTO){
        db.eliminarPersonaje(IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO));
    }
    public void eliminarPoder(PoderDTO poderDTO){
        db.eliminarPoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO, db.obtenerPersonajesByPoderDTO(poderDTO)));
    }
}
