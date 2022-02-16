package io.nology.tradingcardsspringboot.payloads.cards;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

public class CardCreate {
    @Getter @Setter @NotBlank
    String name;

    @Getter @Setter @NonNull
    int manaCostId;

    @Getter @Setter @NonNull
    int typeLineId;

    @Getter @Setter @NonNull
    int expansionSymbolId;

    @Getter @Setter @NotBlank
    String abilities;

    @Getter @Setter @NotBlank
    String flavourText;

    @Getter @Setter @NotBlank
    String SymbolRarity;

    @Getter @Setter @NotBlank
    String artistInfo;

    @Getter @Setter @NonNull
    int collectorNum;

    @Getter @Setter @NotBlank
    String powerTough;

    @Getter @Setter @NonNull
    int cardBorderId;
}
