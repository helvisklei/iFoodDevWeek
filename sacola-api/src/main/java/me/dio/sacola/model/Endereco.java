package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder  // designer part
@Data
@Embeddable  // informa que a classe endereço não será uma tabela no banco de dados
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;

}
