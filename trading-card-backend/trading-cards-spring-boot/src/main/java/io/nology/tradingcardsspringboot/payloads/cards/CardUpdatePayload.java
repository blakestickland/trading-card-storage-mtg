package io.nology.tradingcardsspringboot.payloads.cards;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CardUpdatePayload {

    @Getter @Setter @NotBlank
    private String name;

//    @Getter @Setter @NotNull
//    private Integer manaCost;
//
//    @Getter @Setter
//    private String basicType;
//
//    @Getter @Setter
//    private String detailedType;
//
//    @Getter @Setter
//    private Boolean inStorage;


    public CardUpdatePayload() {}

    public CardUpdatePayload(String name
//            , Integer manaCost, String basicType, String detailedType, Boolean inStorage
    ){
        this.setName(name);
//        this.setManaCost(manaCost);
//        this.setBasicType(basicType);
//        this.setDetailedType(detailedType);
//        this.setInStorage(inStorage);
    }
}
