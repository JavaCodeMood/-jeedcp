/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeedcp.weixin.dao;


import com.jeedcp.persistence.CrudDao;
import com.jeedcp.persistence.annotation.MyBatisDao;
import com.jeedcp.weixin.entity.WeixinAccount;

/**
 * 公众账号管理DAO接口
 * @author jeedcp
 * @version 2016-09-19
 */
@MyBatisDao
public interface WeixinAccountDao extends CrudDao<WeixinAccount> {
	
}