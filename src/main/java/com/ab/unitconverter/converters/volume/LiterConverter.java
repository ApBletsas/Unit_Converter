package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class LiterConverter extends BaseUnitConverter  {

    public LiterConverter() {

        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Liter";
    }
}
