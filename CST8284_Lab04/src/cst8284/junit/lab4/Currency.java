package cst8284.junit.lab4;

import java.util.Arrays;
import java.util.List;

/**
 * Represents  a currency 
 * Uses 3 character string in upper case. 
 * Has methods to return the abbreviation.
 *
 */
public class Currency {

    private static final int INITIAL_NUM = 3;
    private static List<String> currencies = Arrays.asList("CAD", "GBP", "CHF", "EUR", "USD");
    private String currency;

    /**
     * Constructor.
     *
     * @param  currency initials
     * @throws BadCurrencyException is the currency is invalid
     */
    public Currency(String initials)  {
        if (!acceptableInitials(initials)) {
            currency = "USD";
        }
        else {
        	currency = initials;	
        }
    }

    /**
     * Returns currency abbreviation .
     *
     * @return  currency abbreviation 
     */
    public String getAbbreviation() {
        return currency;
    }

    /**
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Currency && obj != null) {
            Currency cmpObj = (Currency) obj;
            return currency.equals(cmpObj.getAbbreviation());
        }

        return false;
    }

    /**
     * 
     */
    @Override
    public int hashCode() {
        return currency.hashCode();
    }

    /**
     * Verifies if a currency is acceptable
     * @param initials - currency abbreviation
     * @return  if currency is acceptable or not. 
     */
    private boolean acceptableInitials(String initials) {
        if (initials.length() != INITIAL_NUM || !initials.toUpperCase().equals(initials)) {
            return false;
        }

        for (String init : currencies) {
            if (init.equals(initials)) {
                return true;
            }
        }

        return false;
    }
}
