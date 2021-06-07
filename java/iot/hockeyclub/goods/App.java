package iot.hockeyclub.goods;

import iot.hockeyclub.goods.manager.HockeyclubManager;
import iot.hockeyclub.goods.enums.Country;
import iot.hockeyclub.goods.enums.Fixing;
import iot.hockeyclub.goods.enums.Protection;
import iot.hockeyclub.goods.enums.SortOrder;
import iot.hockeyclub.goods.enums.Type;
import iot.hockeyclub.goods.models.Skates;
import iot.hockeyclub.goods.models.Stick;
import iot.hockeyclub.goods.models.HockeyGoods;
import iot.hockeyclub.goods.models.ProtectiveEquipment;

import java.util.List;

public class App {
    public static void main(String[] args) {
    	List<HockeyGoods> listItems = List.of(
    		new Skates("Skates", 1500, 1148, "TECNOPRO", Country.CHINA, "black", Type.FIELD_PLAYER, "pvc leather", Fixing.SHOELACE, 39),
        	new Stick("Stick", 1752, 500, "FISHER", Country.GERMAN, "yellow", Type.FIELD_PLAYER, "carbon fiber, fiberglass", 166, 85, 135),
        	new ProtectiveEquipment("Helmet", 1248, 600, "Bauer", Country.POLAND, "white", Type.GOALKEEPER, "plastic", "Adult", Protection.HELMET)
        );
        HockeyclubManager manage = new HockeyclubManager(listItems);
        
        System.out.println("\tSorting goods by price: ");
        HockeyclubManager.printItems(manage.sortByPrice(SortOrder.ASC));
        System.out.println("\tSearch goods by type: ");
        HockeyclubManager.printItems(manage.searchByType(Type.FIELD_PLAYER));
    }
}