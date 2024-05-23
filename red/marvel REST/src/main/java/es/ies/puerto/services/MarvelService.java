package es.ies.puerto.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

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
    public MarvelService(){
        marvelNegocio = new MarvelNegocio();
    }
    @GET
    @Path("/personaje/{id}")
    public Response obtenerPersonajeById(@PathParam("id") String id){
        PersonajeDTO personajeDTOObtenido = marvelNegocio.obtenerPersonajeById(id);
        if (personajeDTOObtenido != null) {
            return Response.ok(personajeDTOObtenido).build();
        }
        return Response.noContent().build();
    }

    @GET
    @Path("/personaje/")
    public Response obtenerPersonajes(){
        List<PersonajeDTO> personajesDTOObtenido = marvelNegocio.obtenerPersonajes();
        if (personajesDTOObtenido != null) {
            return Response.ok(personajesDTOObtenido).build();
        }
        return Response.noContent().build();
    }

    @GET
    @Path("/poder/{id}")
    public Response obtenerPoderById(@PathParam("id") String id){
        PoderDTO poderDTO = marvelNegocio.obtenerPoderById(id);
        if (poderDTO != null) {
            return Response.ok(poderDTO).build();
        }
        return Response.noContent().build();
    }

    @GET
    @Path("/poder/")
    public Response obtenerPoderes(){
        List<PoderDTO> poderDTOobtenido = marvelNegocio.obtenerPoderes();
        if (poderDTOobtenido != null) {
            return Response.ok(poderDTOobtenido).build();
        }
        return Response.noContent().build();
    }
}
