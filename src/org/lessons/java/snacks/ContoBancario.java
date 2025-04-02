package org.lessons.java.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario() {
        this.numeroConto = (int) (Math.random() * 100000);
        this.saldo = BigDecimal.ZERO;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal depositoDenaro(BigDecimal deposito) {
        if (deposito.compareTo(BigDecimal.ZERO) > 0) {
            saldo = this.saldo.add(deposito);
        }
        return saldo;
    }

    public BigDecimal prelievoDenaro(BigDecimal prelievo) {
        if (prelievo.compareTo(saldo) <= 0) {
            saldo = this.saldo.subtract(prelievo);
        }
        return saldo;
    }

}
