package com.ab5121.bletsas5121.converters.volume;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;
import com.ab5121.bletsas5121.converters.UnitTypeConverter;
import com.ab5121.bletsas5121.converters.lenght.FootConverter;
import com.ab5121.bletsas5121.converters.lenght.MeterConverter;

import java.util.HashMap;

public class VolumeConverter extends UnitTypeConverter  {

    private static BaseUnitConverter literConverter = new LiterConverter();
    private static BaseUnitConverter gallonConverter = new GallonConverter();
    private static BaseUnitConverter milliliterConverter = new MilliliterConverter();
    private static BaseUnitConverter kiloliterConverter = new KiloliterConverter();
    private static BaseUnitConverter tablespoonConverter = new TablespoonConverter();
    private static BaseUnitConverter teaspoonConverter = new TeaspoonConverter();

    public VolumeConverter() {
        super("Liter",new HashMap<String, BaseUnitConverter>() {
            {
                put(literConverter.getName(), literConverter);
                put(gallonConverter.getName(), gallonConverter);
                put(milliliterConverter.getName(), milliliterConverter);
                put(kiloliterConverter.getName(), kiloliterConverter);
                put(tablespoonConverter.getName(), tablespoonConverter);
                put(teaspoonConverter.getName(), teaspoonConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Volume";
    }
}
