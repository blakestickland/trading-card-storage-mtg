package io.nology.tradingcardsspringboot.controllers;

import io.nology.tradingcardsspringboot.entities.Card;
import io.nology.tradingcardsspringboot.payloads.cards.CardCreate;
import io.nology.tradingcardsspringboot.payloads.cards.CardUpdatePayload;
import io.nology.tradingcardsspringboot.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/cards")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping(value = "/test")
    public String test() {
        return "hallo, world!";
    }

    @GetMapping(value = "/test/{name}")
    public String testName(@PathVariable String name) { return "Hiya, " + name + "!";}

    @GetMapping(value = "/test/{name}/{age}")
    public String testNameAge(@PathVariable String name, @PathVariable Integer age) {
        return String.format("hellllooo, %s! You are %d years old, aren't you?", name, age);
    }

    // Create cards --> POST Mapping
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void  save(@Valid @RequestBody CardCreate card) { this.cardService.create(card); }

    @GetMapping
    public List<Card> all() { return this.cardService.all(); }

    @GetMapping(value = "/{id}")
    public Card find(@PathVariable Long id) {
        return this.cardService
                .find(id)      // Optional<Card>
                .orElseThrow (() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Card not found"));
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.cardService.find(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Card not found"));

        this.cardService.deleteById(id);
    }

//    @PatchMapping(value = "/{id}")
////    @ResponseStatus(value = HttpStatus.CREATED)
////    public Card update(@Valid @PathVariable Long id, @RequestBody CardUpdatePayload payload) {
////        this.cardService.find(id)
////                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Card not found"));
////        return this.cardService.update(id, payload);
////    }
//    public ResponseEntity<Card> updateCardPartially(
//            @PathVariable(value = "id") Long id,
//            @Valid @RequestBody CardUpdatePayload payload) {
//            Card card = this.cardService.find(id).get();
////                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Card not found"));
//
//            card.setName(payload.getName());
//            card.setManaCost(payload.getManaCost());
//            card.setBasicType(payload.getBasicType());
//            card.setDetailedType(payload.getDetailedType());
//            card.setInStorage(payload.getInStorage());
//            final Card updatedCard = this.cardService.create(card);
//            return ResponseEntity.ok(updatedCard);
//    }
//    )
//    @PatchMapping(value = "{id}")
//    public Card update(@PathVariable Long id, @RequestBody CardUpdatePayload payload) {
//        return this.cardService.update(id, payload);
//    }
}
