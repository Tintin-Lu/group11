package com.pinyougou.service;

import com.pinyougou.pojo.Address;
import com.pinyougou.pojo.Areas;
import com.pinyougou.pojo.Cities;
import com.pinyougou.pojo.Provinces;

import java.util.List;
import java.io.Serializable;
/**
 * AddressService 服务接口
 * @date 2019-03-28 09:58:00
 * @version 1.0
 */
public interface AddressService {

	/** 添加方法 */
	void save(Address address);

	/** 修改方法 */
	void update(Address address);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	Address findOne(Serializable id);

	/** 查询全部 */
	List<Address> findAll();

	/** 多条件分页查询 */
	List<Address> findByPage(Address address, int page, int rows);

	/** 根据登录用户名获取收件地址列表 */
    List<Address> findAddressByUser(String userId);

    /** 查询所有省份 */
    List<Provinces> getProvinces();

	/** 根据省份ID查询市 */
    List<Cities> getCities(String provinceId);

	/** 根据市ID查询区 */
	List<Areas> getAreas(String cityId);

	/** 设置默认地址 */
    void setDefaultAddress(String loginName, Long id, String status);


}