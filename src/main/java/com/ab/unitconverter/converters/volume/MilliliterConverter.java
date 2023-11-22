package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MilliliterConverter extends BaseUnitConverter  {

    public MilliliterConverter() {

        this.MULTIPLIER = new BigDecimal(0.001);
    }

    @Override
    public String getName() {
        return "Milliliter";
    }
}
