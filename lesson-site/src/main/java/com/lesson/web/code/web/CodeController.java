package com.lesson.web.code.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lesson.web.code.entity.MenuCode;
import com.lesson.web.code.result.CodeResult;
@RestController
public class CodeController {
	private static final Logger logger =Logger.getLogger(CodeController.class);
	private static final String[] DEFAULT_MENU_CODE= {"eng","golf"};
	private static final String[] DEFAULT_MENU_NAME= {"영어회화","골프"};
	@RequestMapping(value="/menu/code",method=RequestMethod.GET)
	public CodeResult<MenuCode> test() { 
		return getMenuCode();
	}
	public CodeResult<MenuCode> getMenuCode(){
		List<MenuCode> l = new ArrayList<MenuCode>();
		
		for(int i = 0; i < DEFAULT_MENU_CODE.length; i++) {
			MenuCode c=new MenuCode();
			c.setMenuCode(DEFAULT_MENU_CODE[i]);
			c.setMenuName(DEFAULT_MENU_NAME[i]);
			c.setRegEmId("테스트");
			c.setActiveYn("Y");
			l.add(c);
		}
		CodeResult<MenuCode> result=new CodeResult<MenuCode>();
		result.setEntitys(l);
		return result;
	}
	
	
}
