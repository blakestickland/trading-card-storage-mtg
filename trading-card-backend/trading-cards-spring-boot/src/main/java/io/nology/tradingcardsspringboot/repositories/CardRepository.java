package io.nology.tradingcardsspringboot.repositories;

import io.nology.tradingcardsspringboot.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findById(Long id);
    List<Card>findByName(String name);
    List<Card>findByManaCostId(Long manaCostId);
    List<Card>findByTypeLineId(Long typeLineId);
    List<Card>findByExpansionSymbolId(Long expansionSymbolId);
    List<Card>findByAbilities(String abilities);
    List<Card>findByFlavourText(String flavourText);
    List<Card>findBySymbolRarity(String symbolRarity);
    List<Card>findByArtistInfo(String artistInfo);
    List<Card>findByCollectorNum(int collectorNum);
    List<Card>findByPowerTough(String powerTough);
    List<Card>findByCardBorderId(Long cardBorderId);
}
