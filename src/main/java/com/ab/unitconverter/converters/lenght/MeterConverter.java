package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MeterConverter extends BaseUnitConverter  {

    public MeterConverter() {
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Meter";
    }
}
