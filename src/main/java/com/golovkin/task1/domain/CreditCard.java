package com.golovkin.task1.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditCard {
    private String name;

    private CardNumber number;
    private Holder holder;
    private LocalDate validThru;

    private BigDecimal maintenancePrice;
    private BigDecimal percent;
    private BigDecimal limit;

    private BigDecimal currentBalance;

    public CreditCard(String name, Holder holder, BigDecimal maintenancePrice, BigDecimal percent, BigDecimal limit) {
        this.name = name;
        this.holder = holder;
        this.maintenancePrice = maintenancePrice;
        this.percent = percent;
        this.limit = limit;

        number = new CardNumber();
        validThru = LocalDate.now().plusYears(4);
        currentBalance = BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return String.format("Тип карты: %s, номер: %s, держатель: %s, действительна до: %s, стоимость обслуживания: %s, ставка: %s, лимит: %s, текущий баланс: %s",
                name,
                number,
                holder,
                validThru,
                maintenancePrice,
                percent,
                limit,
                currentBalance);
    }
}
