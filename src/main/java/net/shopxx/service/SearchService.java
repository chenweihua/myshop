/*
 * Copyright 2005-2015 jshop.com. All rights reserved.
 * File Head

 */
package net.shopxx.service;

import java.math.BigDecimal;

import net.shopxx.Page;
import net.shopxx.Pageable;
import net.shopxx.entity.Article;
import net.shopxx.entity.Goods;

/**
 * Service - 搜索
 * 
 * @author JSHOP Team
 \* @version 3.X
 */
public interface SearchService {

	/**
	 * 创建索引
	 */
	void index();

	/**
	 * 创建索引
	 * 
	 * @param type
	 *            索引类型
	 */
	void index(Class<?> type);

	/**
	 * 创建索引
	 * 
	 * @param article
	 *            文章
	 */
	void index(Article article);

	/**
	 * 创建索引
	 * 
	 * @param goods
	 *            货品
	 */
	void index(Goods goods);

	/**
	 * 删除索引
	 */
	void purge();

	/**
	 * 删除索引
	 * 
	 * @param type
	 *            索引类型
	 */
	void purge(Class<?> type);

	/**
	 * 删除索引
	 * 
	 * @param article
	 *            文章
	 */
	void purge(Article article);

	/**
	 * 删除索引
	 * 
	 * @param goods
	 *            货品
	 */
	void purge(Goods goods);

	/**
	 * 搜索文章分页
	 * 
	 * @param keyword
	 *            关键词
	 * @param pageable
	 *            分页信息
	 * @return 文章分页
	 */
	Page<Article> search(String keyword, Pageable pageable);

	/**
	 * 搜索货品分页
	 * 
	 * @param keyword
	 *            关键词
	 * @param startPrice
	 *            最低价格
	 * @param endPrice
	 *            最高价格
	 * @param orderType
	 *            排序类型
	 * @param pageable
	 *            分页信息
	 * @return 货品分页
	 */
	Page<Goods> search(String keyword, BigDecimal startPrice, BigDecimal endPrice, Goods.OrderType orderType, Pageable pageable);

}