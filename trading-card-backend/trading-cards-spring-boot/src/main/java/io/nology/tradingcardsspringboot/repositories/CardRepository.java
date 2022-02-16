package io.nology.tradingcardsspringboot.repositories;

import io.nology.tradingcardsspringboot.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Integer> {

    Optional<Card> findById(int id);
    List<Card>findByName(String name);
    List<Card>findByManaCostId(int manaCostId);
    List<Card>findByTypeLineId(int typeLineId);
    List<Card>findByExpansionSymbolId(int expansionSymbolId);
    List<Card>findByAbilities(String abilities);
    List<Card>findByFlavourText(String flavourText);
    List<Card>findBySymbolRarity(String symbolRarity);
    List<Card>findByArtistInfo(String artistInfo);
    List<Card>findByCollectorNum(int collectorNum);
    List<Card>findByPowerTough(String powerTough);
    List<Card>findByCardBorderId(int cardBorderId);
}
