package io.angelwing.olami.underwear.service.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "underwear_make")
public class UnderwearMake {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "uuid-char")
    @Column(name = "underwear_make_id")
    private UUID id;

    @JoinColumn(name = "underwear_collection_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnderwearCollection underwearCollection;

    private String name;

    private Integer year;

    @Enumerated(EnumType.STRING)
    private BraType braType;

    @Enumerated(EnumType.STRING)
    private PantiesType pantiesType;

    @Enumerated(EnumType.ORDINAL)
    private GarterbeltType garterbeltType;

    public UnderwearMake(){
        //NOOP
    }

    public UnderwearMake(UUID id , UnderwearCollection underwearCollection , String name , Integer year , BraType braType , PantiesType pantiesType , GarterbeltType garterbeltType){
      this.id = id;
      this.underwearCollection = underwearCollection;
      this.name = name;
      this.year = year;
      this.pantiesType = pantiesType;
      this.garterbeltType = garterbeltType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UnderwearCollection getUnderwearCollection() {
        return underwearCollection;
    }

    public void setUnderwearCollection(UnderwearCollection underwearCollection) {
        this.underwearCollection = underwearCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BraType getBraType() {
        return braType;
    }

    public void setBraType(BraType braType) {
        this.braType = braType;
    }

    public PantiesType getPantiesType() {
        return pantiesType;
    }

    public void setPantiesType(PantiesType pantiesType) {
        this.pantiesType = pantiesType;
    }

    public GarterbeltType getGarterbeltType() {
        return garterbeltType;
    }

    public void setGarterbeltType(GarterbeltType garterbeltType) {
        this.garterbeltType = garterbeltType;
    }
}
