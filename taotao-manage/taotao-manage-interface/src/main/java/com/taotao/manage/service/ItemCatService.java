package com.taotao.manage.service;

import java.util.List;

import com.taotao.manage.pojo.ItemCat;

public interface ItemCatService {

	List<ItemCat> queryCatListByPage(Integer page, Integer rows);

}
