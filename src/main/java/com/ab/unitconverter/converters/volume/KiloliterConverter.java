package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KiloliterConverter extends BaseUnitConverter  {

    public KiloliterConverter() {

        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Kiloliter";
    }
}
