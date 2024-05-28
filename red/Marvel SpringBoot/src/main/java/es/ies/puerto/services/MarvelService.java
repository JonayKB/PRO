package es.ies.puerto.services;

import java.util.List;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.MarvelNegocio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("v1/")
public class MarvelService {
    private static Logger LOG = LoggerFactory.getLogger(MarvelService.class);

    private MarvelNegocio marvelNegocio;

    @Autowired
    public void setMarvelNegocio(MarvelNegocio marvelNegocio) {
        this.marvelNegocio = marvelNegocio;
    }

    @GetMapping("personaje/{id}")
    public PersonajeDTO getPersonaje(@PathVariable(name = "id") final String id) {
        return marvelNegocio.obtenerPersonajeById(id);
    }

    @GetMapping("poder/{id}")
    public PoderDTO getPoder(@PathVariable(name = "id") final String id) {
        return marvelNegocio.obtenerPoderById(id);
    }

    @GetMapping("alias/{id}")
    public AliasDTO getAlias(@PathVariable(name = "id") final String id) {
        return marvelNegocio.obtenerAliasById(id);
    }

    @GetMapping("equipamiento/{id}")
    public EquipamientoDTO getEquipamiento(@PathVariable(name = "id") final String id) {
        return marvelNegocio.obtenerEquipamientoById(id);
    }

    @GetMapping("personaje/")
    public List<PersonajeDTO> getPersonajes() {
        return marvelNegocio.obtenerPersonajes();
    }

    @GetMapping("poder/")
    public List<PoderDTO> getPoderes() {
        return marvelNegocio.obtenerPoderes();
    }

    @GetMapping("alias/")
    public List<AliasDTO> getAliasPlurar() {
        return marvelNegocio.obtenerAlias();
    }

    @GetMapping("equipamiento/")
    public List<EquipamientoDTO> getEquipamientos() {
        return marvelNegocio.obtenerEquipamientos();
    }

}
