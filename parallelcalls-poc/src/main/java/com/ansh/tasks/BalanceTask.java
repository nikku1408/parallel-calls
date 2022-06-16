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

package com.ansh.tasks;

import java.util.concurrent.Callable;

import com.ansh.dao.BalanceDao;
import com.ansh.model.BalanceDaoResp;
import com.ansh.model.TaskResult;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceTask implements Callable<TaskResult> {

	private String customerId;

	public BalanceTask(String customerId) {
		this.customerId = customerId;
	}

	public TaskResult call() throws Exception {
		BalanceDao balanceDao = new BalanceDao();
		BalanceDaoResp balanceDaoResp = balanceDao.getBalance(customerId);
		TaskResult taskResult = new TaskResult();
		taskResult.setTaskName("Balance Task");
		taskResult.setResult(balanceDaoResp);
		return taskResult;
	}

}
