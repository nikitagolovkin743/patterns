package com.golovkin.task1;

import com.golovkin.task1.domain.CreditCard;
import com.golovkin.task1.domain.Holder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 */
public class Task1 {
    public static void main(String[] args) {
        Holder holder = new Holder("Ivan", "Ivanov");

        List<Function<Holder, CreditCard>> cardCreationMethods = getCardCreationMethods();

        for (Function<Holder, CreditCard> cardCreationMethod : cardCreationMethods) {
            CreditCard card = cardCreationMethod.apply(holder);
            System.out.println(card);
        }
    }

    private static List<Function<Holder, CreditCard>> getCardCreationMethods() {
        List<Function<Holder, CreditCard>> cardCreationMethods = new ArrayList<>();

        cardCreationMethods.add(CreditCardFactory::createAeroflotSignatureCard);
        cardCreationMethods.add(CreditCardFactory::createClassicCard);
        cardCreationMethods.add(CreditCardFactory::createClassicGiveLifeCard);
        cardCreationMethods.add(CreditCardFactory::createDigitalCard);
        cardCreationMethods.add(CreditCardFactory::createGoldAeroflotCard);
        cardCreationMethods.add(CreditCardFactory::createGoldCard);
        cardCreationMethods.add(CreditCardFactory::createGoldGiveLifeCard);
        cardCreationMethods.add(CreditCardFactory::createMomentumCard);
        cardCreationMethods.add(CreditCardFactory::createPremiumCard);

        return cardCreationMethods;
    }
}
