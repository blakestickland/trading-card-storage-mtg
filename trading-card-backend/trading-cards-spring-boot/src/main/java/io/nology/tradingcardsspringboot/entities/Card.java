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
    private Long manaCostId;
    @Getter @Setter
    private Long typeLineId;
    @Getter @Setter
    private Long expansionSymbolId;
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
    private Long cardBorderId;

    public Card(String name, int collectorNum,
             Long manaCostId, Long typeLineId, Long expansionSymbolId, String abilities
            , String flavourText, String symbolRarity, String artistInfo
                , String powerTough
                , Long cardBorderId
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
