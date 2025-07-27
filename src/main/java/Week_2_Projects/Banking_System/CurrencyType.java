package Week_2_Projects.Banking_System;

public enum CurrencyType {

    TL("TL"),
    DOLLAR("$"),
    EURO("€"),
    GOLD("G");

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    CurrencyType(String symbol) {
        this.symbol = symbol;
    }

}
