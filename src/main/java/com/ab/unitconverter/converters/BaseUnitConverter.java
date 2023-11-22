package com.ab5121.bletsas5121.converters;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BaseUnitConverter {

    protected BigDecimal MULTIPLIER;

    public abstract String getName();

    public BigDecimal convertToBase(BigDecimal value) {
        return value.multiply(MULTIPLIER).setScale(4,RoundingMode.HALF_UP) ;
    }

    public BigDecimal convertFromBase(BigDecimal value) {
        return value.divide(MULTIPLIER, 4, RoundingMode.HALF_UP);
    }
}
