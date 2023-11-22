package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class FootConverter extends BaseUnitConverter  {

    public FootConverter() {
        this.MULTIPLIER = new BigDecimal(0.3048);
    }

    @Override
    public String getName() {
        return "Foot";
    }
}
