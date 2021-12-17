package io.angelwing.olami.underwear.service.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "underwear_collection")
public class UnderwearCollection {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "underwear_collection_id")
    private UUID id;

    private String name;

    public UnderwearCollection(){
        //NOOP
    }

    public UnderwearCollection(UUID id , String name){
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
