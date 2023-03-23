package com.example.Client.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

    @Id
    private String id;
    private String typeid;
    private String name;
    private String lastname;
    private Boolean state;
}
