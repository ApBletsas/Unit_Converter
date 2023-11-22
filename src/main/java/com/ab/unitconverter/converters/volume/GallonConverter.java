package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class GallonConverter extends BaseUnitConverter  {

    public GallonConverter() {

        this.MULTIPLIER = new BigDecimal(3.785);
    }

    @Override
    public String getName() {
        return "Gallon";
    }
}
