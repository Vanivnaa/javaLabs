package iot.hockeyservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import iot.hockeyservice.models.HockeyGoods;

@Service
@ApplicationScope
public class HockeyGoodsService {

	private AtomicInteger id = new AtomicInteger(0);
	private Map<Integer, HockeyGoods> hockeyGoodssMap = new HashMap<Integer, HockeyGoods>();
	
	public HockeyGoods addHockeyGoods(HockeyGoods hockeyGoods) {
		Integer hockeyGoodsId = id.incrementAndGet();
		hockeyGoods.setId(hockeyGoodsId);
		hockeyGoodssMap.put(hockeyGoodsId, hockeyGoods);
		return hockeyGoods;
	}
	
	public HockeyGoods updateHockeyGoods(HockeyGoods hockeyGoods) {
		return hockeyGoodssMap.put(hockeyGoods.getId(), hockeyGoods);
	}
	
	public List<HockeyGoods> getHockeyGoodss(){
		return hockeyGoodssMap.values().stream().collect(Collectors.toList());
	}

	public HockeyGoods getHockeyGoods(Integer id) {
		return hockeyGoodssMap.get(id);
	}	
}
