package es.ies.puerto.controller;

import org.springframework.web.bind.annotation.PostMapping;

import es.ies.puerto.model.entity.Player;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class AuthController {
    @PostMapping("/login")
    public String createAuthenticationToken(@RequestBody Player player) {
        return "Soy el token";
    }

    @PostMapping("/login2")
    public String createAuthenticationToken2(@RequestBody Player player) {
        return "Soy el token2";
    }
}
