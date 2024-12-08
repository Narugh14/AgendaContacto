package com.montelongo.contactos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_contacto;
    private String nombre;
    private String celular;
    private String email;

}
