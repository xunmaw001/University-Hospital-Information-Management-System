package com.dao;

import com.entity.XianshangguahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianshangguahaoVO;
import com.entity.view.XianshangguahaoView;


/**
 * 线上挂号
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface XianshangguahaoDao extends BaseMapper<XianshangguahaoEntity> {
	
	List<XianshangguahaoVO> selectListVO(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
	
	XianshangguahaoVO selectVO(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
	
	List<XianshangguahaoView> selectListView(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);

	List<XianshangguahaoView> selectListView(Pagination page,@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
	
	XianshangguahaoView selectView(@Param("ew") Wrapper<XianshangguahaoEntity> wrapper);
	

}
