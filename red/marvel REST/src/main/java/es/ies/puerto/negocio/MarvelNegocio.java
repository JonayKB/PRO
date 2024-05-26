package es.ies.puerto.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.mappers.IMapperAlias;
import es.ies.puerto.mappers.IMapperEquipamiento;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.mappers.IMapperPoder;
import es.ies.puerto.modelo.db.Db;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MarvelNegocio {
    Db db;

    public MarvelNegocio() {
        db = new Db();
    }

    public boolean agregarPersonaje(PersonajeDTO personajeDTO) {
        return db.agregarPersonaje(IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO));
    }

    public boolean agregarPoder(PoderDTO poderDTO, Set<PersonajeDTO> personajeDTO) {
        return db.agregarPoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO, personajeDTO));
    }

    public boolean agregarAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO) {
        return db.agregarAlias(IMapperAlias.INSTANCE.aliasDTOTOAlias(aliasDTO, personajeDTO));
    }

    public boolean agregarEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO) {
        return db.agregarEquipamiento(
                IMapperEquipamiento.INSTANCE.equipamientoDTOTOEquipamiento(equipamientoDTO, personajeDTO));
    }

    public PersonajeDTO obtenerPersonajeById(String id) {
        Personaje personaje = new Personaje(id);
        return IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(db.obtenerPersonaje(personaje));
    }

    public List<PersonajeDTO> obtenerPersonajes() {
        List<PersonajeDTO> personajeDTOs = null;
        List<Personaje> personajes = db.obtenerPersonajes();

        if (personajes != null) {
            personajeDTOs = new ArrayList<>();
            for (Personaje personaje : personajes) {
                personajeDTOs.add(IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(personaje));
            }
        }
        return personajeDTOs;
    }

    public PoderDTO obtenerPoderById(String id) {
        Poder poder = new Poder(id);
        return IMapperPoder.INSTANCE.poderTOpoderDTO(db.obtenerPoder(poder));
    }

    public List<PoderDTO> obtenerPoderes() {
        List<PoderDTO> poderDTOs = null;
        List<Poder> poders = db.obtenerPoderes();

        if (poders != null) {
            poderDTOs = new ArrayList<>();
            for (Poder poder : poders) {
                poderDTOs.add(IMapperPoder.INSTANCE.poderTOpoderDTO(poder));
            }
        }
        return poderDTOs;
    }

    public AliasDTO obtenerAliasById(String id) {
        Alias alias = new Alias(id);
        return IMapperAlias.INSTANCE.aliasTOAliasDTO(db.obtenerAlias(alias));
    }

    public List<AliasDTO> obtenerAlias() {
        List<AliasDTO> aliasDTOs = null;
        List<Alias> aliass = db.obtenerAliasPlural();

        if (aliass != null) {
            aliasDTOs = new ArrayList<>();
            for (Alias alias : aliass) {
                aliasDTOs.add(IMapperAlias.INSTANCE.aliasTOAliasDTO(alias));
            }
        }
        return aliasDTOs;
    }

    public EquipamientoDTO obtenerEquipamientoById(String id) {
        Equipamiento equipamiento = new Equipamiento(id);
        return IMapperEquipamiento.INSTANCE.equipamientoTOEquipamientoDTO(db.obtenerEquipamiento(equipamiento));
    }

    public List<EquipamientoDTO> obtenerEquipamientos() {
        List<EquipamientoDTO> equipamientosDTOs = null;
        List<Equipamiento> equipamientos = db.obtenerEquipamientos();

        if (equipamientos != null) {
            equipamientosDTOs = new ArrayList<>();
            for (Equipamiento equipamiento : equipamientos) {
                equipamientosDTOs.add(IMapperEquipamiento.INSTANCE.equipamientoTOEquipamientoDTO(equipamiento));
            }
        }
        return equipamientosDTOs;
    }

    public boolean eliminarPersonaje(PersonajeDTO personajeDTO) {
        return db.eliminarPersonaje(IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO));
    }

    public boolean eliminarPoder(PoderDTO poderDTO, Set<PersonajeDTO> personajeDTO) {
        return db.eliminarPoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO, personajeDTO));
    }

    public boolean eliminarAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO) {
        return db.eliminarAlias(IMapperAlias.INSTANCE.aliasDTOTOAlias(aliasDTO, personajeDTO));
    }

    public boolean eliminarEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO) {
        return db.eliminarEquipamiento(
                IMapperEquipamiento.INSTANCE.equipamientoDTOTOEquipamiento(equipamientoDTO, personajeDTO));
    }
}
