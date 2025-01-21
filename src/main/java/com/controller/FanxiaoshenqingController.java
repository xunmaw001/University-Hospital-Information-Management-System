package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FanxiaoshenqingEntity;
import com.entity.view.FanxiaoshenqingView;

import com.service.FanxiaoshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 返校申请
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-14 11:18:12
 */
@RestController
@RequestMapping("/fanxiaoshenqing")
public class FanxiaoshenqingController {
    @Autowired
    private FanxiaoshenqingService fanxiaoshenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanxiaoshenqingEntity fanxiaoshenqing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date ruxiaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date ruxiaoshijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fanxiaoshenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FanxiaoshenqingEntity> ew = new EntityWrapper<FanxiaoshenqingEntity>();
                if(ruxiaoshijianstart!=null) ew.ge("ruxiaoshijian", ruxiaoshijianstart);
                if(ruxiaoshijianend!=null) ew.le("ruxiaoshijian", ruxiaoshijianend);
		PageUtils page = fanxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanxiaoshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanxiaoshenqingEntity fanxiaoshenqing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date ruxiaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date ruxiaoshijianend,
		HttpServletRequest request){
        EntityWrapper<FanxiaoshenqingEntity> ew = new EntityWrapper<FanxiaoshenqingEntity>();
                if(ruxiaoshijianstart!=null) ew.ge("ruxiaoshijian", ruxiaoshijianstart);
                if(ruxiaoshijianend!=null) ew.le("ruxiaoshijian", ruxiaoshijianend);
		PageUtils page = fanxiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanxiaoshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanxiaoshenqingEntity fanxiaoshenqing){
       	EntityWrapper<FanxiaoshenqingEntity> ew = new EntityWrapper<FanxiaoshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanxiaoshenqing, "fanxiaoshenqing")); 
        return R.ok().put("data", fanxiaoshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanxiaoshenqingEntity fanxiaoshenqing){
        EntityWrapper< FanxiaoshenqingEntity> ew = new EntityWrapper< FanxiaoshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanxiaoshenqing, "fanxiaoshenqing")); 
		FanxiaoshenqingView fanxiaoshenqingView =  fanxiaoshenqingService.selectView(ew);
		return R.ok("查询返校申请成功").put("data", fanxiaoshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanxiaoshenqingEntity fanxiaoshenqing = fanxiaoshenqingService.selectById(id);
        return R.ok().put("data", fanxiaoshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanxiaoshenqingEntity fanxiaoshenqing = fanxiaoshenqingService.selectById(id);
        return R.ok().put("data", fanxiaoshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanxiaoshenqingEntity fanxiaoshenqing, HttpServletRequest request){
    	fanxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanxiaoshenqing);

        fanxiaoshenqingService.insert(fanxiaoshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanxiaoshenqingEntity fanxiaoshenqing, HttpServletRequest request){
    	fanxiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanxiaoshenqing);

        fanxiaoshenqingService.insert(fanxiaoshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FanxiaoshenqingEntity fanxiaoshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanxiaoshenqing);
        fanxiaoshenqingService.updateById(fanxiaoshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanxiaoshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FanxiaoshenqingEntity> wrapper = new EntityWrapper<FanxiaoshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = fanxiaoshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
