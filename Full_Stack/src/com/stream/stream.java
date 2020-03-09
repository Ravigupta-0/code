package com.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class stream {
//1	
	public static void main(String[] args) {
		List<Fruit> f = TestData.getAllFruits().stream().filter((fruits) -> fruits.getCalories() < 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(toList());
				System.out.println(f);
				f.stream().map(f1 -> f1.getName()+"\t"+f1.getCalories()).forEach(System.out::println);

//2

//3
		List<Fruit> bycolor = TestData.getAllFruits().stream().filter(fruits -> fruits.getColor().equals("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		System.out.println(bycolor);
		bycolor.stream().map(f2 -> f2.getName()+"\t"+f2.getColor()).forEach(System.out::println);

//4
		Optional<News> maxcomment = TestData.getAllNews().stream().max(Comparator.comparing(News::getCommentByUser));
		System.out.println(maxcomment);
//5
		long total = TestData.getAllNews().stream().filter(News -> News.getComment().equals("budget")).count();
		System.out.println(total);
//6
//7
		List<Transaction> tran = TestData.getAllTransactions().stream().filter(transaction -> transaction.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		tran.stream().map(f3 -> f3.getTrader()+"\t"+f3.getYear()+"\t"+f3.getValue()).forEach(System.out::println);
//8
		List<String> tran1 = TestData.getAllTransactions().stream().map(transaction->transaction.trader.getCity()).distinct().collect(Collectors.toList());
				System.out.println(tran1);
//9
		
	}
}
