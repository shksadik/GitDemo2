package com.sadik.dataproviderTests;

import org.testng.annotations.DataProvider;

public class DataSupplier1{
	@DataProvider
	public String[] dp1() {
		String[] data=new String[5];
		data[0]="rebbeca more";
		data[1]="lisa ann";
		data[2]="sharma";
		data[3]="kinley";
		data[4]="mineral";
	
		return data;
	}

	public class DataSupplier2{
	@DataProvider
	public String[] dp2() {
		String[] data=new String[5];
		data[0]="ramulu";
		data[1]="anna";
		data[2]="harma";
		data[3]="kanley";
		data[4]="maneral";
	
		return data;
	}

	public class DataSupplier3 {
		@DataProvider
		public String[] dp3() {
			String[] data=new String[5];
			data[0]="hbvcc";
			data[1]="hyderabad";
			data[2]="bangalore";
			data[3]="redlight";
			data[4]="tirupathi";
		
			return data;
		}
		public class DataSupplier4 {
			@DataProvider
			public String[] dp4() {
				String[] data=new String[5];
				data[0]="pune";
				data[1]="lonovala";
				data[2]="railwaystation";
				data[3]="busstand";
				data[4]="hunter";
			
				return data;
			}
	
		}
	}
	
	}
}
