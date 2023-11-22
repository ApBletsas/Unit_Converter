package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class OunceConverter extends BaseUnitConverter  {

    public OunceConverter() {

        this.MULTIPLIER = new BigDecimal(0.0283495);
    }

    @Override
    public String getName() {
        return "Ounce";
    }
}
