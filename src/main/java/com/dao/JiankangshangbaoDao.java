package com.dao;

import com.entity.JiankangshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshangbaoVO;
import com.entity.view.JiankangshangbaoView;


/**
 * 健康上报
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface JiankangshangbaoDao extends BaseMapper<JiankangshangbaoEntity> {
	
	List<JiankangshangbaoVO> selectListVO(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	JiankangshangbaoVO selectVO(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	List<JiankangshangbaoView> selectListView(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);

	List<JiankangshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	
	JiankangshangbaoView selectView(@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangshangbaoEntity> wrapper);
}
