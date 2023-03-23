package com.example.Client.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class ClientDto {

    @Id
    private String id;
    private String typeid;
    private String name;
    private String lastname;
    private Boolean state;
}
