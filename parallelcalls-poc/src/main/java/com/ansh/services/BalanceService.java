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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ansh.model.TaskResult;
import com.ansh.tasks.BalanceTask;
import com.ansh.tasks.CustomerTask;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class BalanceService {
	public BalanceResponse getBalance(String customerId) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List listTasks = new ArrayList();
		/* Task 1 */
		listTasks.add(new BalanceTask(customerId));
		/* Task 2 */
		listTasks.add(new CustomerTask(customerId));
		List<Future<TaskResult>> futureList = executorService.invokeAll(listTasks);
		return null;
	}
}
