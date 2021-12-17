package io.angelwing.olami.underwear.service.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "barcode")
public class Barcode {

    @Id
    @Column(name = "barcode_id")
    private String id;

    @ManyToOne(fetch =  FetchType.EAGER)
    @JoinColumn(name = "underwear_id")
    private Underwear underwear;

    @Column(columnDefinition = "TINYINT")
    private Boolean available;

    public Barcode(){
        //NOOP
    }

    public Barcode(String id , Underwear underwear , Boolean available){
        this.id = id;
        this.underwear = underwear;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Underwear getUnderwear() {
        return underwear;
    }

    public void setUnderwear(Underwear underwear) {
        this.underwear = underwear;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
