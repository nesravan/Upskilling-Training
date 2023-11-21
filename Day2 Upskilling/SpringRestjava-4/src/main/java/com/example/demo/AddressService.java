package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressService {
	
	
		
		private List<Address> address = new ArrayList<>(Arrays.asList(
				new Address("1234", "mau", "UP", "India"),
				new Address("1200", "patna", "Bihar", "India"),
				new Address("1500", "jalndhar", "Punjab", "India")
				));
		
		public Address getTopic(String id) {
			return address.stream().filter(t -> t.getZipCode().equals(id)).findFirst().get();
		}

		
}