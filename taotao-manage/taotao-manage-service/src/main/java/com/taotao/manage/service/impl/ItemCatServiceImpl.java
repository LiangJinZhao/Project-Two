package com.taotao.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.taotao.manage.mapper.ItemCatMapper;
import com.taotao.manage.pojo.ItemCat;
import com.taotao.manage.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	// 注入mapper
	@Autowired
	private ItemCatMapper ItemCatMapper;

	@Override
	public List<ItemCat> queryCatListByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		// 使用分页助手进行分页
		PageHelper.startPage(2, 3);
		return ItemCatMapper.selectAll();
	}

}
