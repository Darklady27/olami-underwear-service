package io.angelwing.olami.underwear.service.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "underwear")
public class Underwear {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "uuid-char")
    @Column(name = "underwear_id")
    private UUID id;

    @JoinColumn(name = "underwear_make_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnderwearMake underwearMake;

    @Enumerated(EnumType.STRING)
    private Color color;

    @Enumerated(EnumType.STRING)
    private Size size;

    @Column(name = "regular_prices")
    private Double regularPrices;

    @Column(name = "sale_prices")
    private Double salePrices;

    public Underwear() {
        // NOOP
    }

    public Underwear(UUID id, UnderwearMake underwearMake, Color color, Size size, Double regularPrices, Double salePrices) {
        this.id = id;
        this.underwearMake = underwearMake;
        this.color = color;
        this.size = size;
        this.regularPrices = regularPrices;
        this.salePrices = salePrices;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UnderwearMake getUnderwearMake() {
        return underwearMake;
    }

    public void setUnderwearMake(UnderwearMake underwearMake) {
        this.underwearMake = underwearMake;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Double getRegularPrices() {
        return regularPrices;
    }

    public void setRegularPrices(Double regularPrices) {
        this.regularPrices = regularPrices;
    }

    public Double getSalePrices() {
        return salePrices;
    }

    public void setSalePrices(Double salePrices) {
        this.salePrices = salePrices;
    }
}

