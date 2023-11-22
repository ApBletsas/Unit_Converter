package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MileConverter extends BaseUnitConverter  {

    public MileConverter() {
        this.MULTIPLIER = new BigDecimal(1609.344);
    }

    @Override
    public String getName() {
        return "Mile";
    }
}
