package com.dao;

import com.entity.YaopindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopindingdanVO;
import com.entity.view.YaopindingdanView;


/**
 * 药品订单
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface YaopindingdanDao extends BaseMapper<YaopindingdanEntity> {
	
	List<YaopindingdanVO> selectListVO(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
	
	YaopindingdanVO selectVO(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
	
	List<YaopindingdanView> selectListView(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);

	List<YaopindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
	
	YaopindingdanView selectView(@Param("ew") Wrapper<YaopindingdanEntity> wrapper);
	

}
