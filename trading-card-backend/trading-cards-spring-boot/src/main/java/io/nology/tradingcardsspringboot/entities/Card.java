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
    private int id;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int manaCostId;
    @Getter @Setter
    private int typeLineId;
    @Getter @Setter
    private int expansionSymbolId;
    @Getter @Setter
    private String abilities;
    @Getter @Setter
    private String flavourText;
    @Getter @Setter
    private String symbolRarity;
    @Getter @Setter
    private String artistInfo;
    @Getter @Setter
    private int collectorNum;
    @Getter @Setter
    private String powerTough;
    @Getter @Setter
    private int cardBorderId;

    public Card(
            String name,
            int manaCostId,
            int typeLineId,
            int expansionSymbolId,
            String abilities,
            String flavourText,
            String symbolRarity,
            String artistInfo,
            int collectorNum,
            String powerTough,
            int cardBorderId
    ) {
        this.name = name;
        this.manaCostId = manaCostId;
        this.typeLineId = typeLineId;
        this.expansionSymbolId = expansionSymbolId;
        this.abilities = abilities;
        this.flavourText = flavourText;
        this.symbolRarity = symbolRarity;
        this.artistInfo = artistInfo;
        this.collectorNum = collectorNum;
        this.powerTough = powerTough;
        this.cardBorderId = cardBorderId;
    }

    public Card() {}
}
