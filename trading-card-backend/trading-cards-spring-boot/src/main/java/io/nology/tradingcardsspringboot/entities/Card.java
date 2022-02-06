package io.nology.tradingcardsspringboot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer manaCost;
    @Getter @Setter
    private String basicType;
    @Getter @Setter
    private String detailedType;
    @Getter @Setter
    private Boolean inStorage;

    public Card(String name, Integer manaCost, String basicType,
                String detailedType, Boolean inStorage) {
        this.name = name;
        this.manaCost = manaCost;
        this.basicType = basicType;
        this.detailedType = detailedType;
        this.inStorage = inStorage;
    }

    public Card() {}
}
