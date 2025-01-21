package com.entity.view;

import com.entity.DiscussxiaoyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校医评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 11:18:13
 */
@TableName("discussxiaoyi")
public class DiscussxiaoyiView  extends DiscussxiaoyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxiaoyiView(){
	}
 
 	public DiscussxiaoyiView(DiscussxiaoyiEntity discussxiaoyiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxiaoyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
