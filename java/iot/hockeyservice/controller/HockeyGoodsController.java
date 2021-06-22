package iot.hockeyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.hockeyservice.models.HockeyGoods;
import iot.hockeyservice.service.HockeyGoodsService;

//localhost:8080/hockeygoods

@RestController
@RequestMapping(path = "/hockeygoods")
public class HockeyGoodsController {
	
	@Autowired
	private HockeyGoodsService hockeyGoodsService;
	
	@GetMapping(path = "/{id}")
	public HockeyGoods getHockeyGoods(@PathVariable(name = "id") Integer id) {
		return hockeyGoodsService.getHockeyGoods(id);
	}
	
	@GetMapping
	public List<HockeyGoods> getHockeyGoodss() {
		return hockeyGoodsService.getHockeyGoodss();
	}
	
	@PutMapping
	public HockeyGoods createHockeyGoods(@RequestBody HockeyGoods hockeyGoods) {
		return hockeyGoodsService.addHockeyGoods(hockeyGoods);
	}
	
	@PostMapping
	public HockeyGoods updateHockeyGoods(@RequestBody  HockeyGoods hockeyGoods) {
		if (hockeyGoodsService.getHockeyGoods(hockeyGoods.getId()) != null) {
			return hockeyGoodsService.updateHockeyGoods(hockeyGoods);	
		} else {
			return null;
		}
	}
}
