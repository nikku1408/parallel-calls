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

import com.ansh.model.CustomerResp;
import com.ansh.model.TaskResult;
import com.ansh.service.client.CustomerServiceClient;

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class CustomerTask implements Callable<TaskResult> {
	private String customerId;

	public CustomerTask(String customerId) {
		this.customerId = customerId;
	}

	public TaskResult call() throws Exception {
		CustomerServiceClient customerServiceClient = new CustomerServiceClient();
		CustomerResp customerResp = customerServiceClient.getCustomerDetails(customerId);
		TaskResult taskResult = new TaskResult();
		taskResult.setTaskName("Customer Task");
		taskResult.setResult(customerResp);
		return taskResult;
	}

}
