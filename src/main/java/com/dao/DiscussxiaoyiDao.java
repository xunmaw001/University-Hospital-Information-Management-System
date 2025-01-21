package com.dao;

import com.entity.DiscussxiaoyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaoyiVO;
import com.entity.view.DiscussxiaoyiView;


/**
 * 校医评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:13
 */
public interface DiscussxiaoyiDao extends BaseMapper<DiscussxiaoyiEntity> {
	
	List<DiscussxiaoyiVO> selectListVO(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
	
	DiscussxiaoyiVO selectVO(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
	
	List<DiscussxiaoyiView> selectListView(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);

	List<DiscussxiaoyiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
	
	DiscussxiaoyiView selectView(@Param("ew") Wrapper<DiscussxiaoyiEntity> wrapper);
	

}
