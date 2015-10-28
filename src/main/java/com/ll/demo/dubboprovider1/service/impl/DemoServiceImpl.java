package com.ll.demo.dubboprovider1.service.impl;

import org.springframework.stereotype.Service;

import com.ll.demo.dubboInterface.service.DemoService;


@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public int getLength(String words) {
		if (words == null || words.isEmpty()) {
			return -1;
		} else {
			return words.length();
		}
	}
}
