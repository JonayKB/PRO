package es.ies.puerto.repositorio;

import es.ies.puerto.modelos.Song;

public class SongRepository {
    public Song getSongById(String id) {
        return new Song(id, "Karma Police","4.00");
    }
}
