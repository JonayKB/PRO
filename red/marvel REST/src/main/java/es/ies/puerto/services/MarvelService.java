package es.ies.puerto.services;

import java.util.HashSet;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.modelo.db.Db;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.negocio.MarvelNegocio;

@Path("/")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class MarvelService {
    MarvelNegocio marvelNegocio;

    public MarvelService() {
        marvelNegocio = new MarvelNegocio();
    }

    public MarvelService(MarvelNegocio marvelNegocio) {
        this.marvelNegocio = marvelNegocio;
    }

    @POST
    @Path("/personaje/")
    public Response agregarPersonaje(PersonajeDTO personajeDTO) {
        marvelNegocio.agregarPersonaje(personajeDTO);
        return Response.status(Response.Status.CREATED).build();

    }

    @GET
    @Path("/personaje/{id}")
    public Response obtenerPersonajeById(@PathParam("id") String id) {
        PersonajeDTO personajeDTOObtenido = marvelNegocio.obtenerPersonajeById(id);
        if (personajeDTOObtenido != null) {
            return Response.ok(personajeDTOObtenido).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Path("/personaje/")
    public Response obtenerPersonajes() {
        List<PersonajeDTO> personajesDTOObtenido = marvelNegocio.obtenerPersonajes();
        if (personajesDTOObtenido != null) {
            return Response.ok(personajesDTOObtenido).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }
    @DELETE
    @Path("/personaje/")
    public Response eliminarPersonaje(PersonajeDTO personajeDTO) {
        marvelNegocio.eliminarPersonaje(personajeDTO);
        return Response.status(Response.Status.OK).build();

    }

    @POST
    @Path("/poder/")
    public Response agregarPoder(PoderDTO poderDTO, List<String> ids) {
        HashSet<PersonajeDTO> personajeDTOs = new HashSet<>();
        for (String id : ids) {
            personajeDTOs.add(marvelNegocio.obtenerPersonajeById(id));
        }
        marvelNegocio.agregarPoder(poderDTO, personajeDTOs);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/poder/{id}")
    public Response obtenerPoderById(@PathParam("id") String id) {
        PoderDTO poderDTO = marvelNegocio.obtenerPoderById(id);
        if (poderDTO != null) {
            return Response.ok(poderDTO).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }

    @GET
    @Path("/poder/")
    public Response obtenerPoderes() {
        List<PoderDTO> poderDTOobtenido = marvelNegocio.obtenerPoderes();
        if (poderDTOobtenido != null) {
            return Response.ok(poderDTOobtenido).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }
    @DELETE
    @Path("/poder/")
    public Response eliminarPoder(PoderDTO poderDTO, List<String> ids) {
        HashSet<PersonajeDTO> personajeDTOs = new HashSet<>();
        for (String id : ids) {
            personajeDTOs.add(marvelNegocio.obtenerPersonajeById(id));
        }
        marvelNegocio.eliminarPoder(poderDTO, personajeDTOs);
        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("/equipamiento/")
    public Response agregarEquipamiento(EquipamientoDTO equipamientoDTO, String personajeID) {
        marvelNegocio.agregarEquipamiento(equipamientoDTO, new PersonajeDTO(personajeID));
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/equipamiento/{id}")
    public Response obtenerEquipamientoById(@PathParam("id") String id) {
        EquipamientoDTO equipamientoDTO = marvelNegocio.obtenerEquipamientoById(id);
        if (equipamientoDTO != null) {
            return Response.ok(equipamientoDTO).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }

    @GET
    @Path("/equipamiento/")
    public Response obtenerEquipamientos() {
        List<EquipamientoDTO> equipamientosDTOObtenidos = marvelNegocio.obtenerEquipamientos();
        if (equipamientosDTOObtenidos != null) {
            return Response.ok(equipamientosDTOObtenidos).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }
    @DELETE
    @Path("/equipamiento/")
    public Response eliminarEquipamiento(EquipamientoDTO equipamientoDTO, String personajeID) {
        marvelNegocio.eliminarEquipamiento(equipamientoDTO, new PersonajeDTO(personajeID));
        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("/alias/")
    public Response agregarAlias(AliasDTO aliasDTO, String personajeID) {
        marvelNegocio.agregarAlias(aliasDTO, new PersonajeDTO(personajeID));
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/alias/{id}")
    public Response obtenerAliasById(@PathParam("id") String id) {
        AliasDTO aliasDTO = marvelNegocio.obtenerAliasById(id);
        if (aliasDTO != null) {
            return Response.ok(aliasDTO).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }

    @GET
    @Path("/alias/")
    public Response obtenerAlias() {
        List<AliasDTO> aliasDTOObtenidos = marvelNegocio.obtenerAlias();
        if (aliasDTOObtenidos != null) {
            return Response.ok(aliasDTOObtenidos).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @DELETE
    @Path("/alias/")
    public Response eliminarAlias(AliasDTO aliasDTO, String personajeID) {
        marvelNegocio.eliminarAlias(aliasDTO, new PersonajeDTO(personajeID));
        return Response.status(Response.Status.OK).build();
    }
}
