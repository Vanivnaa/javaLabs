package iot.hockeyservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HockeyGoods {
	private Integer id;
	private String name;
	private Integer price;
    private String brand;
}
