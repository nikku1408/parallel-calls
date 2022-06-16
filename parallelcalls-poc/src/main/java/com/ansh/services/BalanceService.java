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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ansh.model.BalanceDaoResp;
import com.ansh.model.CustomerResp;
import com.ansh.model.TaskResult;
import com.ansh.tasks.BalanceTask;
import com.ansh.tasks.CustomerTask;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceService {
	public BalanceResponse getBalance(String customerId) throws InterruptedException, ExecutionException {
		/* Parallel call here 2 threads will call parallely */
		BalanceResponse balanceResponse = new BalanceResponse();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List listTasks = new ArrayList();
		/* Task 1 */
		listTasks.add(new BalanceTask(customerId));
		/* Task 2 */
		listTasks.add(new CustomerTask(customerId));
		System.out.println("Before implements parallel calls");
		List<Future<TaskResult>> futureList = executorService.invokeAll(listTasks);
		for (Future f : futureList) {
			TaskResult result = (TaskResult) f.get();
			if ("Balance Task".equals(result.getTaskName())) {
				BalanceDaoResp balanceDaoResp = (BalanceDaoResp) result.getResult();
				balanceResponse.setAvailableBalance(balanceDaoResp.getAvailableBalance());
				balanceResponse.setBilledAmount(balanceDaoResp.getBilledAmount());
				balanceResponse.setUnbilledAmount(balanceDaoResp.getUnbilledAmount());
			} else if ("Customer Task".equals(result.getTaskName())) {
				CustomerResp customerResp = (CustomerResp) result.getResult();
				customerResp.setBankName(customerResp.getBankName());
				customerResp.setBranch(customerResp.getBranch());
				customerResp.setCardNum(customerResp.getCardNum());
			}
		}
		return null;
	}
}
