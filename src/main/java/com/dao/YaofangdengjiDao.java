package com.dao;

import com.entity.YaofangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaofangdengjiVO;
import com.entity.view.YaofangdengjiView;


/**
 * 药方登记
 * 
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
public interface YaofangdengjiDao extends BaseMapper<YaofangdengjiEntity> {
	
	List<YaofangdengjiVO> selectListVO(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
	
	YaofangdengjiVO selectVO(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
	
	List<YaofangdengjiView> selectListView(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);

	List<YaofangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
	
	YaofangdengjiView selectView(@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YaofangdengjiEntity> wrapper);
}
