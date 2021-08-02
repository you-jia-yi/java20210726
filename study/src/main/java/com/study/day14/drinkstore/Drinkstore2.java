package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class Drinkstore2 {

	public static void main(String[] args) {
		Product redTea =new Product("紅茶", 5) ;
		Product milk =new Product("牛奶", 10) ;
		Product coffee =new Product("咖啡", 15) ;
		Product  greenTea =new Product("綠茶", 6) ;
		Product cake =new Product("蛋糕", 28) ;
		Product  eggTart =new Product("蛋塔", 20) ;
		
		//menu
		Drink milkTea =new Drink("奶茶", 1);
		milkTea.addProduct(redTea).addProduct(milk);
		
		Drink latte =new Drink("拿鐵", 1);
		latte.addProduct(coffee).addProduct(milk);
		
		Drink blackCoffee = new Drink("黑咖啡", 1);
		blackCoffee.addProduct(coffee);
		
		Dessert angelCake = new Dessert("天使蛋糕", cake, 1);
		Dessert goldTart = new Dessert("金牌蛋塔", eggTart, 1);
		
		//套餐
		//family 全家餐
		//5杯拿鐵3杯奶茶 6個金牌蛋塔4個天使蛋糕
		//打8.8折（0.88）
		//請建立Combo物件family
		//請問此套餐折扣後的價格是多少
		latte.setAmount(5);
		milkTea.setAmount(3);
		goldTart.setAmount(6);
		angelCake.setAmount(4);
		LinkedHashSet<Drink>drinks = new LinkedHashSet<>();
		LinkedHashSet<Dessert>desserts = new LinkedHashSet<>();
		drinks.add(latte);
		drinks.add(milkTea);
		desserts.add(goldTart);
		desserts.add(angelCake);

		Combo familCombo = new Combo(drinks, desserts, 0.88);
		//請問此套餐折扣後的價格是多少
	}

}
