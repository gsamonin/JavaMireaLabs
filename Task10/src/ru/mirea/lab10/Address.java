package ru.mirea.lab10;
import java.util.Locale;
import java.util.StringTokenizer;

public class Address {
    public String country, region, city, street, house, housing, floor;

    public Address(String StringToParse, boolean multiDivider) {
        if (StringToParse == null) throw new NullPointerException();
        String[] s;
        if (multiDivider) {
            StringTokenizer str = new StringTokenizer(StringToParse, ",.;");
            s = new String[str.countTokens()];
            int i = 0;
            while (str.hasMoreElements()) s[i++] = str.nextToken();
        }
        else {
            s = StringToParse.split(",");
        }
        if (s.length < 7) throw new IllegalArgumentException("Не достаточно данных");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        floor = s[6].trim();
    }
    public  String toString()
    {
        return "Address{" +
                "Страна ='" + country + '\'' +
                ", Регион ='" + region + '\'' +
                ", Город ='" + city + '\'' +
                ", Улица ='" + street + '\'' +
                ", Дом ='" + house + '\'' +
                ", Корпус ='" + housing + '\'' +
                ", Этаж ='" + floor + '\'' +
                '}';
    }
}
