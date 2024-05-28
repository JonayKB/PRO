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
import es.ies.puerto.negocio.MarvelNegocio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("personaje/")
    public boolean postPersonaje(@RequestBody PersonajeDTO personajeDTO) {
        return marvelNegocio.agregarPersonaje(personajeDTO);
    }

    @PostMapping("poder/")
    public boolean postPoder(@RequestBody PoderDTO poderDTO) {
        return marvelNegocio.agregarPoder(poderDTO, null);
    }

    @PostMapping("alias/")
    public boolean postPpoder(@RequestBody AliasDTO aliasDTO) {
        return marvelNegocio.agregarAlias(aliasDTO,null);
    }

    @PostMapping("equipamiento/")
    public boolean postEquipamiento(@RequestBody EquipamientoDTO equipamientoDTO) {
        return marvelNegocio.agregarEquipamiento(equipamientoDTO, null);
    }

    @DeleteMapping("personaje/{id}")
    public boolean deletePersonaje(@PathVariable(name = "id") final String id){
        return marvelNegocio.eliminarPersonaje(new PersonajeDTO(id));
    }

    @DeleteMapping("poder/{id}")
    public boolean deletePoder(@PathVariable(name = "id") final String id){
        //return marvelNegocio.eliminarPoder(new PoderDTO(id));
        return false;
    }

}
