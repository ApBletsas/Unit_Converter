package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class GramConverter extends BaseUnitConverter  {

    public GramConverter() {

        this.MULTIPLIER = new BigDecimal(0.001);
    }

    @Override
    public String getName() {
        return "Gram";
    }
}
