package com.dao;

import com.entity.BinglijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglijiluVO;
import com.entity.view.BinglijiluView;


/**
 * 病例记录
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface BinglijiluDao extends BaseMapper<BinglijiluEntity> {
	
	List<BinglijiluVO> selectListVO(@Param("ew") Wrapper<BinglijiluEntity> wrapper);
	
	BinglijiluVO selectVO(@Param("ew") Wrapper<BinglijiluEntity> wrapper);
	
	List<BinglijiluView> selectListView(@Param("ew") Wrapper<BinglijiluEntity> wrapper);

	List<BinglijiluView> selectListView(Pagination page,@Param("ew") Wrapper<BinglijiluEntity> wrapper);
	
	BinglijiluView selectView(@Param("ew") Wrapper<BinglijiluEntity> wrapper);
	

}
