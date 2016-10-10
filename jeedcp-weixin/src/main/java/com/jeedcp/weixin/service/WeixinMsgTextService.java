/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeedcp.weixin.service;

import java.util.List;

import com.jeedcp.weixin.dao.WeixinMsgTextDao;
import com.jeedcp.weixin.entity.WeixinMsgText;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeedcp.common.model.Page;
import com.jeedcp.service.base.CrudService;

/**
 * 微信文本消息Service
 * @author jeedcp
 * @version 2016-09-19
 */
@Service
@Transactional(readOnly = true)
public class WeixinMsgTextService extends CrudService<WeixinMsgTextDao, WeixinMsgText> {

	public WeixinMsgText get(String id) {
		return super.get(id);
	}
	
	public List<WeixinMsgText> findList(WeixinMsgText weixinMsgText) {
		return super.findList(weixinMsgText);
	}
	
	public Page<WeixinMsgText> findPage(Page<WeixinMsgText> page, WeixinMsgText weixinMsgText) {
		return super.findPage(page, weixinMsgText);
	}
	
	@Transactional(readOnly = false)
	public void save(WeixinMsgText weixinMsgText) {
		super.save(weixinMsgText);
	}
	
	@Transactional(readOnly = false)
	public void delete(WeixinMsgText weixinMsgText) {
		super.delete(weixinMsgText);
	}
	
}