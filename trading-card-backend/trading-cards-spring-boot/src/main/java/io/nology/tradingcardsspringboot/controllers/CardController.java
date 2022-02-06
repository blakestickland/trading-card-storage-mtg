package io.nology.tradingcardsspringboot.controllers;

import io.nology.tradingcardsspringboot.entities.Card;
import io.nology.tradingcardsspringboot.payloads.cards.CardCreate;
import io.nology.tradingcardsspringboot.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
}
