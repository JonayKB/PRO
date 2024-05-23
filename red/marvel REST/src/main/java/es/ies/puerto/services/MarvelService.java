package es.ies.puerto.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import es.ies.puerto.DTO.PersonajeDTO;
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
    public Response obtenerPersonaje(PersonajeDTO personajeDTO){
        PersonajeDTO personajeDTOObtenido = marvelNegocio.obtenerPersonaje(personajeDTO);
        if (personajeDTOObtenido != null) {
            return Response.ok(personajeDTOObtenido).build();
        }

        return Response.noContent().build();
    }
}
