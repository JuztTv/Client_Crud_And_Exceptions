package com.example.Client.infrastructure.repository;

import com.example.Client.infrastructure.dto.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <ClientDto , String > {
    @Query(nativeQuery = true, value = "update client_dto set name = :name , lastname = :lastname where id = :id")

    @Modifying
    void updateClient(@Param("id") String id,
                      @Param("name") String name,
                      @Param("lastname") String lastname);

    @Query(nativeQuery = true, value = "update client_dto set state = :state  where id = :id")

    @Modifying
    void updateStateClient(@Param("id") String id,
                           @Param("state") Boolean state);



}
