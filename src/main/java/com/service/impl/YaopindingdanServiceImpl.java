package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaopindingdanDao;
import com.entity.YaopindingdanEntity;
import com.service.YaopindingdanService;
import com.entity.vo.YaopindingdanVO;
import com.entity.view.YaopindingdanView;

@Service("yaopindingdanService")
public class YaopindingdanServiceImpl extends ServiceImpl<YaopindingdanDao, YaopindingdanEntity> implements YaopindingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopindingdanEntity> page = this.selectPage(
                new Query<YaopindingdanEntity>(params).getPage(),
                new EntityWrapper<YaopindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopindingdanEntity> wrapper) {
		  Page<YaopindingdanView> page =new Query<YaopindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopindingdanVO> selectListVO(Wrapper<YaopindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopindingdanVO selectVO(Wrapper<YaopindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopindingdanView> selectListView(Wrapper<YaopindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopindingdanView selectView(Wrapper<YaopindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
