package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilometerConverter extends BaseUnitConverter  {

    public KilometerConverter() {
        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Kilometer";
    }
}
