package com.dao;

import com.entity.XiaoyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyiVO;
import com.entity.view.XiaoyiView;


/**
 * 校医
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface XiaoyiDao extends BaseMapper<XiaoyiEntity> {
	
	List<XiaoyiVO> selectListVO(@Param("ew") Wrapper<XiaoyiEntity> wrapper);
	
	XiaoyiVO selectVO(@Param("ew") Wrapper<XiaoyiEntity> wrapper);
	
	List<XiaoyiView> selectListView(@Param("ew") Wrapper<XiaoyiEntity> wrapper);

	List<XiaoyiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyiEntity> wrapper);
	
	XiaoyiView selectView(@Param("ew") Wrapper<XiaoyiEntity> wrapper);
	

}
