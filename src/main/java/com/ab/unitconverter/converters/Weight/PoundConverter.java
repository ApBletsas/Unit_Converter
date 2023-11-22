package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class PoundConverter extends BaseUnitConverter  {

    public PoundConverter() {

        this.MULTIPLIER = new BigDecimal(0.453592);
    }

    @Override
    public String getName() {
        return "Pound";
    }
}
