package es.ies.puerto.services;

import org.junit.jupiter.api.BeforeAll;

public class MarvelServiceTest {
    static MarvelService marvelService;
    @BeforeAll
    public static void beforeAll(){
        marvelService = new MarvelService();
    }
}
