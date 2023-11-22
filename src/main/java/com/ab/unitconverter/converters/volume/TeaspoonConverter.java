package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class TeaspoonConverter extends BaseUnitConverter  {

    public TeaspoonConverter() {

        this.MULTIPLIER = new BigDecimal(0.00492892);
    }

    @Override
    public String getName() {
        return "Teaspoon";
    }
}
