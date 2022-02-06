package io.nology.tradingcardsspringboot.payloads.cards;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

public class CardCreate {
    @Getter @Setter @NotBlank
    String name;

    @Getter @Setter @NonNull
    Integer manaCost;

    @Getter @Setter @NotBlank
    String basicType;

    @Getter @Setter @NotBlank
    String detailedType;

    @Getter @Setter @NonNull
    Boolean inStorage;
}
