package io.nology.tradingcardsspringboot.payloads.cards;

import lombok.Getter;
import lombok.Setter;

public class CardUpdatePayload {

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

    public CardUpdatePayload() {}

    public CardUpdatePayload(String name) {
        this.setName(name);
    }

    public CardUpdatePayload(String name, Integer manaCost) {
        this.setName(name);
        this.setManaCost(manaCost);
    }

    public CardUpdatePayload(String name, Integer manaCost, String basicType) {
        this.setName(name);
        this.setManaCost(manaCost);
        this.setBasicType(basicType);
    }

    public CardUpdatePayload(String name, Integer manaCost, String basicType, String detailedType) {
        this.setName(name);
        this.setManaCost(manaCost);
        this.setBasicType(basicType);
        this.setDetailedType(detailedType);
    }


    public CardUpdatePayload(String name, Integer manaCost, String basicType, String detailedType, Boolean inStorage){
        this.setName(name);
        this.setManaCost(manaCost);
        this.setBasicType(basicType);
        this.setDetailedType(detailedType);
        this.setInStorage(inStorage);
    }
}
