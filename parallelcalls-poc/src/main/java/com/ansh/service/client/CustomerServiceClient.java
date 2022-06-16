/**
 * @Author : bunty
 * Copyright (C) 2022 Bunty - All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of My license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the My license with
 * this file. If not, please write to: nikhilninawe.in1@gmail.com.
 */

package com.ansh.service.client;

import com.ansh.model.CustomerResp;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class CustomerServiceClient {
	public CustomerResp getCustomerDetails(String cardNum) {
		CustomerResp customerResponse = new CustomerResp();
		customerResponse.setBankName("Barclays");
		customerResponse.setBranch("London");
		customerResponse.setCardNum("052123445869");
		return null;
	}
}
