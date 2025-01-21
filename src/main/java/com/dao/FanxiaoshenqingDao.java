package com.dao;

import com.entity.FanxiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanxiaoshenqingVO;
import com.entity.view.FanxiaoshenqingView;


/**
 * 返校申请
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface FanxiaoshenqingDao extends BaseMapper<FanxiaoshenqingEntity> {
	
	List<FanxiaoshenqingVO> selectListVO(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
	
	FanxiaoshenqingVO selectVO(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
	
	List<FanxiaoshenqingView> selectListView(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);

	List<FanxiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
	
	FanxiaoshenqingView selectView(@Param("ew") Wrapper<FanxiaoshenqingEntity> wrapper);
	

}
