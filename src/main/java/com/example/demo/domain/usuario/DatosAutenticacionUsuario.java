package com.example.demo.domain.usuario; // DEBE SER LA PRIMERA LÍNEA

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave
) {
}