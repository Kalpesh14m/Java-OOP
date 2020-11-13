package com.kalpesh.oop.downcasting;

class Animal {
}

class DowncastingWithoutInstanceof extends Animal {
	static void method(Animal a) {
		DowncastingWithoutInstanceof d = (DowncastingWithoutInstanceof) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Animal a = new DowncastingWithoutInstanceof();
		DowncastingWithoutInstanceof.method(a);
	}
}