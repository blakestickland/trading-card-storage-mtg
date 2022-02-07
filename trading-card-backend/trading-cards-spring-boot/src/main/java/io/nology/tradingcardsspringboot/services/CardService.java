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

    public List<Card> all() {
        return this.cardRepository.findAll();
    }

    public void create(CardCreate card) {
        Card dbCard = new Card(card.getName(), card.getManaCost(), card.getBasicType(), card.getDetailedType(), card.getInStorage());
        cardRepository.save(dbCard);
    }

    public Optional<Card> find(Long id) {
        return this.cardRepository.findById(id);
    }

    public void deleteById(Long id) {
         this.cardRepository.deleteById(id);
    }

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
