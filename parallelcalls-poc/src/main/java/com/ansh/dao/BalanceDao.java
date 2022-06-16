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

package com.ansh.dao;

import com.ansh.model.BalanceDaoResp;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceDao {
	private BalanceDaoResp getBalance(String cardNum) {
		BalanceDaoResp balanceDaoResp = new BalanceDaoResp();
		balanceDaoResp.setAvailableBalance("10000");
		balanceDaoResp.setBilledAmount("90000");
		balanceDaoResp.setUnbilledAmount("10000");
		return balanceDaoResp;
	}
}
