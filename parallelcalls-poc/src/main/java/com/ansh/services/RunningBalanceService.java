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

package com.ansh.services;

import java.util.concurrent.ExecutionException;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class RunningBalanceService {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		BalanceService balanceService = new BalanceService();
		BalanceResponse balanceResponse = balanceService.getBalance("212121");
		System.out.println("Balance response is " + balanceResponse);
	}
}
