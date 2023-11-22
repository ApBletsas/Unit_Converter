package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MilligramConverter extends BaseUnitConverter  {

    public MilligramConverter() {

        this.MULTIPLIER = new BigDecimal(0.000001);
    }

    @Override
    public String getName() {
        return "Milligram";
    }
}
