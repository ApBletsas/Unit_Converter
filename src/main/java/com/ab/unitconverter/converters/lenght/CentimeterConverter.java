package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class CentimeterConverter extends BaseUnitConverter  {

    public CentimeterConverter() {
        this.MULTIPLIER = new BigDecimal(0.01);
    }

    @Override
    public String getName() {
        return "Centimeter";
    }
}
