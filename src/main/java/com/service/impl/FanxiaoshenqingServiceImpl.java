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


import com.dao.FanxiaoshenqingDao;
import com.entity.FanxiaoshenqingEntity;
import com.service.FanxiaoshenqingService;
import com.entity.vo.FanxiaoshenqingVO;
import com.entity.view.FanxiaoshenqingView;

@Service("fanxiaoshenqingService")
public class FanxiaoshenqingServiceImpl extends ServiceImpl<FanxiaoshenqingDao, FanxiaoshenqingEntity> implements FanxiaoshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanxiaoshenqingEntity> page = this.selectPage(
                new Query<FanxiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<FanxiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanxiaoshenqingEntity> wrapper) {
		  Page<FanxiaoshenqingView> page =new Query<FanxiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanxiaoshenqingVO> selectListVO(Wrapper<FanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanxiaoshenqingVO selectVO(Wrapper<FanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanxiaoshenqingView> selectListView(Wrapper<FanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanxiaoshenqingView selectView(Wrapper<FanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
