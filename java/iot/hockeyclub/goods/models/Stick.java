package iot.hockeyclub.goods.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
import lombok.ToString;
import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Type;

@Data
@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)

public class Stick extends HockeyGoods {
	public Integer lenght;
	  public Integer rigidity;
	  public Integer angleOfInclination;

	  public Stick(
	    String name,
		Integer price,
	    Integer weightInGrams,
	    String brand,
	    Country originCountry,
	    String color,
	    Type type,
	    String material,
	    Integer length,
	    Integer rigidity,
	    Integer angleOfInclination
	  ) {
	    super(name, price, weightInGrams, brand, originCountry, color, type, material);
	    this.lenght = length;
	    this.rigidity = rigidity;
	    this.angleOfInclination = angleOfInclination;
	  }

}
