package com.adapter;

public class SmartPhoneUser {

	public static void main(String[] args) {
		Charger charger = new Adapter(new Nokia());
		charger.charge();
		charger = new Adapter(new Samsung());
		charger.charge();
		charger = new Adapter(new IPhone());
		charger.charge();
	}

}
