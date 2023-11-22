package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MillimeterConverter extends BaseUnitConverter  {

    public MillimeterConverter() {
        this.MULTIPLIER = new BigDecimal(0.001);
    }

    @Override
    public String getName() {
        return "Millimeter";
    }
}
