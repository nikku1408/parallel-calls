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

package com.ansh.model;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceDaoResp {
	private String availableBalance;
	private String billedAmount;
	private String unbilledAmount;

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getBilledAmount() {
		return billedAmount;
	}

	public void setBilledAmount(String billedAmount) {
		this.billedAmount = billedAmount;
	}

	public String getUnbilledAmount() {
		return unbilledAmount;
	}

	public void setUnbilledAmount(String unbilledAmount) {
		this.unbilledAmount = unbilledAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceDaoResp [availableBalance=");
		builder.append(availableBalance);
		builder.append(", billedAmount=");
		builder.append(billedAmount);
		builder.append(", unbilledAmount=");
		builder.append(unbilledAmount);
		builder.append("]");
		return builder.toString();
	}

}
