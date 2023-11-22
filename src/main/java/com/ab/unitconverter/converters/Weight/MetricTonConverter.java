package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MetricTonConverter extends BaseUnitConverter  {

    public MetricTonConverter() {

        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "MetricTon";
    }
}
