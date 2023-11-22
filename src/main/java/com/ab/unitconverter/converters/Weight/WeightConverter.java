package com.ab5121.bletsas5121.converters.Weight;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;
import com.ab5121.bletsas5121.converters.UnitTypeConverter;
import com.ab5121.bletsas5121.converters.volume.*;

import java.util.HashMap;

public class WeightConverter extends UnitTypeConverter  {

    private static BaseUnitConverter kilogramConverter = new KilogramConverter();
    private static BaseUnitConverter poundConverter = new PoundConverter();
    private static BaseUnitConverter gramConverter = new GramConverter();
    private static BaseUnitConverter milligramConverter = new MilligramConverter();
    private static BaseUnitConverter ounceConverter = new OunceConverter();
    private static BaseUnitConverter metricTonConverter = new MetricTonConverter();


    public WeightConverter() {
        super("Kilogram",new HashMap<String, BaseUnitConverter>() {
            {
                put(kilogramConverter.getName(), kilogramConverter);
                put(poundConverter.getName(), poundConverter);
                put(gramConverter.getName(), gramConverter);
                put(milligramConverter.getName(), milligramConverter);
                put(ounceConverter.getName(), ounceConverter);
                put(metricTonConverter.getName(), metricTonConverter);

            }
        });
    }

    @Override
    public String getUnitType() {
        return "Weight";
    }
}
