package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class InchConverter extends BaseUnitConverter  {

    public InchConverter() {
        this.MULTIPLIER = new BigDecimal(0.0254);
    }

    @Override
    public String getName() {
        return "Inch";
    }
}
