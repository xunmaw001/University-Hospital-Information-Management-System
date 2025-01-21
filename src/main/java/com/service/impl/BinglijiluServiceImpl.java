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


import com.dao.BinglijiluDao;
import com.entity.BinglijiluEntity;
import com.service.BinglijiluService;
import com.entity.vo.BinglijiluVO;
import com.entity.view.BinglijiluView;

@Service("binglijiluService")
public class BinglijiluServiceImpl extends ServiceImpl<BinglijiluDao, BinglijiluEntity> implements BinglijiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglijiluEntity> page = this.selectPage(
                new Query<BinglijiluEntity>(params).getPage(),
                new EntityWrapper<BinglijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglijiluEntity> wrapper) {
		  Page<BinglijiluView> page =new Query<BinglijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglijiluVO> selectListVO(Wrapper<BinglijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglijiluVO selectVO(Wrapper<BinglijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglijiluView> selectListView(Wrapper<BinglijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglijiluView selectView(Wrapper<BinglijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
