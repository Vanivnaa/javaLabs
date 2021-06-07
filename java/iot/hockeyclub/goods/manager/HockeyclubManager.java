package iot.hockeyclub.goods.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.AllArgsConstructor;
import iot.hockeyclub.goods.enums.Type;
import iot.hockeyclub.goods.enums.SortOrder;
import iot.hockeyclub.goods.models.HockeyGoods;

@Data
@AllArgsConstructor
public class HockeyclubManager {
	private List<HockeyGoods> goods;

	public static void printItems(final List<HockeyGoods> goods) {
	        goods.forEach(System.out::println);
	}
	
	public List<HockeyGoods> searchByType(final Type type) {
        return goods.stream().filter(item -> item.getType() == type).collect(Collectors.toList());
    }
	
    public List<HockeyGoods> sortByPrice(final SortOrder sortOrder) {
    	List<HockeyGoods> sortedList = new ArrayList<>(goods);
    	if (sortOrder == SortOrder.ASC) {
            sortedList.sort((item1, item2) -> item1.getPrice().compareTo(item2.getPrice()));
        }else {
        	sortedList.sort((item1, item2) -> item2.getPrice().compareTo(item1.getPrice()));
        }
        return sortedList;
    }

    

    public void printList(final List<HockeyGoods> goodsList) {
        goodsList.forEach(System.out::println);
    }
}
