package com.ab5121.bletsas5121.converters.lenght;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;
import com.ab5121.bletsas5121.converters.UnitTypeConverter;

import java.util.HashMap;

public class LengthConverter extends UnitTypeConverter  {

    private static BaseUnitConverter meterConverter = new MeterConverter();
    private static BaseUnitConverter footConverter = new FootConverter();
    private static BaseUnitConverter kilometerConverter = new KilometerConverter();
    private static BaseUnitConverter centimeter = new CentimeterConverter();
    private static BaseUnitConverter inch = new InchConverter();
    private static BaseUnitConverter millimeter = new MillimeterConverter();
    private static BaseUnitConverter mile = new MileConverter();


    public  LengthConverter() {
        super("Meter",new HashMap<String, BaseUnitConverter>() {
            {
                put(meterConverter.getName(), meterConverter);
                put(footConverter.getName(), footConverter);
                put(kilometerConverter.getName(), kilometerConverter);
                put(centimeter.getName(), centimeter);
                put(inch.getName(), inch);
                put(mile.getName(), mile);
                put(millimeter.getName(), millimeter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Length";
    }
}
