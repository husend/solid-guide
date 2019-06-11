package com.test.entity;

import java.io.Serializable;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

@SuppressWarnings("rawtypes")
public class SuperEntity<T extends Model> extends Model<Model> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 主键ID , 这里故意演示注解可以无
     */
    @TableId("test_id")
	private Long id;
	private Long tenantId; 
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getTenantId() {
		return tenantId;
	}



	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}



	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
