package io.nology.tradingcardsspringboot.services;

import io.nology.tradingcardsspringboot.entities.Card;
import io.nology.tradingcardsspringboot.payloads.cards.CardCreate;
import io.nology.tradingcardsspringboot.payloads.cards.CardUpdatePayload;
import io.nology.tradingcardsspringboot.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    // Find all cards
    public List<Card> all() {
        return this.cardRepository.findAll();
    }

    // Create a single card
    public void create(CardCreate card) {
        Card dbCard = new Card(
                card.getName(),
                card.getManaCostId(),
                card.getTypeLineId(),
                card.getExpansionSymbolId(),
                card.getAbilities(),
                card.getFlavourText(),
                card.getSymbolRarity(),
                card.getArtistInfo(),
                card.getCollectorNum(),
                card.getPowerTough(),
                card.getCardBorderId()
        );
        cardRepository.save(dbCard);
    }

    // Find a single card
    public Optional<Card> find(int id) {
        return this.cardRepository.findById(id);
    }

    // Delete a single card
    public void deleteById(int id) {
         this.cardRepository.deleteById(id);
    }

    // Update a single card
//    public Card update(Long id, CardUpdatePayload card) {
//        Card dbCard = new Card(card.getName(), card.getManaCost(), card.getBasicType(), card.getDetailedType(), card.getInStorage());
//        cardRepository.save(dbCard);
//        return dbCard;
//    }
//    public Card update(Long id, CardUpdatePayload data) {
//        var card = this.find(id);
//        super.modelMapper.getConfiguration().setSkipEnabled(true);
//        super.modelMapper.map(data, card);
//        return this.cardRepository.save(card);
//    }

}
