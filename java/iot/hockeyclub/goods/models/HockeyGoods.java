package iot.hockeyclub.goods.models;

import lombok.*;
import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Type;

@Data
@NoArgsConstructor
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class HockeyGoods {
	public String name;
	public Integer price;
    public Integer weightInGrams;
    public String brand;
    public Country originCountry;
    public String color;
    public Type type;
    public String material;

    public HockeyGoods (String name, Integer price, Integer weightInGrams, String brand, Country originCountry, String color, Type type, String material) {
        this.name = name;
    	this.price = price;
        this.weightInGrams = weightInGrams;
        this.brand = brand;
        this.originCountry = originCountry;
        this.color = color;
        this.type = type;
        this.material = material;
    }
}
