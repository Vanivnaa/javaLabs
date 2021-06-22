package iot.hockeyclub.goods.models;

import lombok.*;
import iot.hockeyclub.goods.enums.Color;
import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Type;

@Data
@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)

public class Puck extends HockeyGoods {
	public Integer thickness;
    public Integer diameter;
    public Color collor;

    public Puck (String name, Integer price, Integer weightInGrams, String brand, Country originCountry, String color, Type type, String material, Integer thickness, Integer diameter, Color collor) {
        super(name, price, weightInGrams, brand, originCountry, color, type, material);
        this.thickness = thickness;
        this.diameter = diameter;
        this.color = color;
    }
}
