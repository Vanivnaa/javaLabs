package iot.hockeyclub.goods.models;

import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Type;
import iot.hockeyclub.goods.enums.Protection;
import lombok.Data;
import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)

public class ProtectiveEquipment extends HockeyGoods {
	public String ageCategory;
    public Protection elementOfProtection;

    public ProtectiveEquipment (String name, Integer price, Integer weightInGrams, String brand, Country originCountry, String color, Type type, String material, String ageCategory, Protection elementOfProtection) {
        super(name, price, weightInGrams, brand, originCountry, color, type, material);
        this.ageCategory = ageCategory;
        this.elementOfProtection = elementOfProtection;
    }
}
