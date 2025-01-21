package org.example.springbt.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//iniciar com atributos
//record já tras varios metodos prontos
//records são imutaveis, por isso só tem getrs
public record ProductRecordDto(@NotBlank  String name, @NotNull BigDecimal value) {
}
