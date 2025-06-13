package it.epicode.u5w2d5pratica.dto;

import it.epicode.u5w2d5pratica.enumerations.StatoViaggio;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ViaggioDto {

    @NotEmpty(message = "il campo destinazione è obbligatorio")
    private String destinazione;
    @NotNull(message = "il campo data e obbligatorio")
    private LocalDate data;
//    @NotNull(message = "Lo stato del viaggio è obbligatorio. COMPLETATO O IN_CORSO ")
//    private StatoViaggio statoViaggio;
}
