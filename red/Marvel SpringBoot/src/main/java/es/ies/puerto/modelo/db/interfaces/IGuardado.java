package es.ies.puerto.modelo.db.interfaces;

import java.util.List;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public interface IGuardado {
    public boolean agregarPersonaje(Personaje personaje);

    public boolean agregarPoder(Poder poder);

    public boolean agregarAlias(Alias alias);

    public boolean agregarEquipamiento(Equipamiento equipamiento);

    public Personaje obtenerPersonaje(Personaje personaje);

    public Poder obtenerPoder(Poder poder);

    public Alias obtenerAlias(Alias alias);

    public Equipamiento obtenerEquipamiento(Equipamiento equipamiento);

    public List<Personaje> obtenerPersonajes();

    public List<Poder> obtenerPoderes();

    public List<Alias> obtenerAliasPlural();

    public List<Equipamiento> obtenerEquipamientos();

    public boolean eliminarPersonaje(Personaje personaje);

    public boolean eliminarPoder(Poder poder);

    public boolean eliminarAlias(Alias alias);

    public boolean eliminarEquipamiento(Equipamiento equipamiento);
}
