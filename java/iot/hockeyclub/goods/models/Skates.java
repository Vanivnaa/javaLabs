package iot.hockeyclub.goods.models;

import iot.hockeyclub.goods.enums.Fixing;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Type;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)

public class Skates extends HockeyGoods {
	public Fixing typeOfFixing;
    public Integer size;

    public Skates(String name, Integer price, Integer weightInGrams, String brand, Country originCountry, String color, Type type, String material, Fixing typeOfFixing, Integer size) {
        super(name, price, weightInGrams, brand, originCountry, color, type, material);
        this.typeOfFixing = typeOfFixing;
        this.size = size;
    }
}
