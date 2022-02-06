package io.nology.tradingcardsspringboot.repositories;

import io.nology.tradingcardsspringboot.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
