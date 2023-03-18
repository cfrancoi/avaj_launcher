package weather;

import java.util.Arrays;

public enum EWeather {
    RAIN,
    FOG,
    SUN,
    SNOW;

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }

}


