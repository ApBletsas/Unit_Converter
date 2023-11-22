package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilogramConverter extends BaseUnitConverter  {

    public KilogramConverter() {

        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Kilogram";
    }
}
