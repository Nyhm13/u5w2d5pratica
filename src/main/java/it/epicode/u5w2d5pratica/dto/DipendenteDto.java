package it.epicode.u5w2d5pratica.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DipendenteDto {

    @NotEmpty(message = "il campo username è  obligatorio")
    private String username;
    @NotEmpty(message = "il campo nome è  obligatorio")
    private String nome;
    @NotEmpty(message = "il campo cognome è  obligatorio")
    private String cognome;
    @Email(message = "il campo email deve avere un indirizzo email valido")
    private String email;
}
