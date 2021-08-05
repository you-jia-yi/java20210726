package com.study.day23;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class LambdaDemo2 {

	public static void main(String[] args) {
		//飲料15元打9折
		//使用BiConsumer
		BiConsumer<Integer, Double>checkout = 
									(price, discount)->System.out.println(price*discount);
		checkout.accept(15, 0.9);
		
		//輸入Int回傳字串
		IntFunction<String> sexName = (sex)->{
			if (sex==1) {
				return"男";
			}else if (sex==2) {
				return"女";
			}else {
				return"錯誤";
			}
		};
		System.out.println(sexName.apply(1));
		System.out.println(sexName.apply(2));
		/*
		 public interface Function<T,R> {
			R apply(T t);
		 }
		 public interface IntFunction<R> {
   		R apply(int value);
		 }
		 
		 public interface ToIntFunction<T> {
			int applyAsInt(T value);
		 }
		
		*/
		
		ToIntFunction<String> nameLength = (String name) -> name.length();
		System.out.println(nameLength.applyAsInt("Vincent"));
		
		
		
		
		
	}
}
