package com.taotao.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.taotao.manage.pojo.ItemCat;
import com.taotao.manage.service.ItemCatService;

@RequestMapping("/item/cat")
@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemcatService;

	@RequestMapping(value = "/query/{page}")
	public ResponseEntity<List<ItemCat>> queryItemCatListByPage(@PathVariable("page") Integer page,
		 @RequestParam(value="rows",defaultValue="20")Integer rows) {
		try {
			System.out.println("1111");
			List<ItemCat> list = itemcatService.queryCatListByPage(page, rows);
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
