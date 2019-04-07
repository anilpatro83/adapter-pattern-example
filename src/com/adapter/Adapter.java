package com.adapter;

public class Adapter implements Charger {

	public SmartPhone phone;
	
	public Adapter(SmartPhone phone){
		this.phone = phone;
	}
	@Override
	public void charge() {
		phone.charge();

	}

}
