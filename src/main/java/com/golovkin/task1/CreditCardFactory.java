package com.golovkin.task1;

import com.golovkin.task1.domain.CreditCard;
import com.golovkin.task1.domain.Holder;

import java.math.BigDecimal;

public class CreditCardFactory {
    private CreditCardFactory() {
    }

    public static CreditCard createGoldCard(Holder holder) {
        return new CreditCard("Золотая карта", holder, BigDecimal.valueOf(0), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }

    public static CreditCard createPremiumCard(Holder holder) {
        return new CreditCard("Премиальная карта", holder, BigDecimal.valueOf(2450), new BigDecimal("21.9"), BigDecimal.valueOf(3_000_000));
    }

    public static CreditCard createDigitalCard(Holder holder) {
        return new CreditCard("Цифровая карта", holder, BigDecimal.valueOf(0), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }

    public static CreditCard createClassicCard(Holder holder) {
        return new CreditCard("Классическая карта", holder, BigDecimal.valueOf(0), new BigDecimal("25.9"), BigDecimal.valueOf(300_000));
    }

    public static CreditCard createAeroflotSignatureCard(Holder holder) {
        return new CreditCard("Карта Аэрофлот Signature", holder, BigDecimal.valueOf(12_000), new BigDecimal("21.9"), BigDecimal.valueOf(3_000_000));
    }

    public static CreditCard createGoldAeroflotCard(Holder holder) {
        return new CreditCard("Золотая карта Аэрофлот", holder, BigDecimal.valueOf(3500), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }

    public static CreditCard createMomentumCard(Holder holder) {
        return new CreditCard("Карта Momentum", holder, BigDecimal.valueOf(0), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }

    public static CreditCard createClassicGiveLifeCard(Holder holder) {
        return new CreditCard("Классическая карта Подари жизнь", holder, BigDecimal.valueOf(0), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }

    public static CreditCard createGoldGiveLifeCard(Holder holder) {
        return new CreditCard("Золотая карта Подари жизнь", holder, BigDecimal.valueOf(0), new BigDecimal("23.9"), BigDecimal.valueOf(600_000));
    }
}
