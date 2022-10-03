package me.dio.sacola.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder  // designer part
@Data
@Embeddable
@NoArgsConstructor
public class ItemDto {    //DTO serve para modelar o Json
    private Long produtoId;
    private int quantidade;
    private Long SacolaId;
}
