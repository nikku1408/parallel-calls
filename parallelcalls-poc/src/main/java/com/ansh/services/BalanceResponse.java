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

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceResponse {
	/* Params of BalanceDaoResponse */
	private String availableBalance;
	private String billedAmount;
	private String unbilledAmount;

	/* Params of CustomerResponse */
	private String cardNum;
	private String branch;
	private String bankName;

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

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceResponse [availableBalance=");
		builder.append(availableBalance);
		builder.append(", billedAmount=");
		builder.append(billedAmount);
		builder.append(", unbilledAmount=");
		builder.append(unbilledAmount);
		builder.append(", cardNum=");
		builder.append(cardNum);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", bankName=");
		builder.append(bankName);
		builder.append("]");
		return builder.toString();
	}

}
