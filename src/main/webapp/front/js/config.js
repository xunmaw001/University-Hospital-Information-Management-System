
var projectName = '基于ssm的大学校医院信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '校医',
	url: './pages/xiaoyi/list.html'
}, 
{
	name: '药品信息',
	url: './pages/yaopinxinxi/list.html'
}, 

{
	name: '疫情通告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmc7l26/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"学院","menuJump":"列表","tableName":"xueyuan"}],"menu":"学院管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"科室","menuJump":"列表","tableName":"keshi"}],"menu":"科室管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","查看评论"],"menu":"校医","menuJump":"列表","tableName":"xiaoyi"}],"menu":"校医管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","修改","删除"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"问诊回复","menuJump":"列表","tableName":"wenzhenhuifu"}],"menu":"问诊回复管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","打印","导出"],"menu":"线上挂号","menuJump":"列表","tableName":"xianshangguahao"}],"menu":"线上挂号管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"病例记录","menuJump":"列表","tableName":"binglijilu"}],"menu":"病例记录管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改","删除","导出"],"menu":"健康上报","menuJump":"列表","tableName":"jiankangshangbao"}],"menu":"健康上报管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","审核"],"menu":"离校申请","menuJump":"列表","tableName":"lixiaoshenqing"}],"menu":"离校申请管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","审核"],"menu":"返校申请","menuJump":"列表","tableName":"fanxiaoshenqing"}],"menu":"返校申请管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除","审核"],"menu":"请假申请","menuJump":"列表","tableName":"qingjiashenqing"}],"menu":"请假申请管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"药品分类","menuJump":"列表","tableName":"yaopinfenlei"}],"menu":"药品分类管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除","报表","查看评论"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除","报表"],"menu":"药方登记","menuJump":"列表","tableName":"yaofangdengji"}],"menu":"药方登记管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"药品订单","menuJump":"列表","tableName":"yaopindingdan"}],"menu":"药品订单管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"疫情通告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","查看评论","问诊","挂号"],"menu":"校医列表","menuJump":"列表","tableName":"xiaoyi"}],"menu":"校医模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","报表","查看评论","立即购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除","回复"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"问诊回复","menuJump":"列表","tableName":"wenzhenhuifu"}],"menu":"问诊回复管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","病例","打印","导出"],"menu":"线上挂号","menuJump":"列表","tableName":"xianshangguahao"}],"menu":"线上挂号管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除","处方"],"menu":"病例记录","menuJump":"列表","tableName":"binglijilu"}],"menu":"病例记录管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除","审核"],"menu":"请假申请","menuJump":"列表","tableName":"qingjiashenqing"}],"menu":"请假申请管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除","报表"],"menu":"药方登记","menuJump":"列表","tableName":"yaofangdengji"}],"menu":"药方登记管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","查看评论","问诊","挂号"],"menu":"校医列表","menuJump":"列表","tableName":"xiaoyi"}],"menu":"校医模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","报表","查看评论","立即购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"校医","tableName":"xiaoyi"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除"],"menu":"问诊回复","menuJump":"列表","tableName":"wenzhenhuifu"}],"menu":"问诊回复管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除"],"menu":"线上挂号","menuJump":"列表","tableName":"xianshangguahao"}],"menu":"线上挂号管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"病例记录","menuJump":"列表","tableName":"binglijilu"}],"menu":"病例记录管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除","报表"],"menu":"健康上报","menuJump":"列表","tableName":"jiankangshangbao"}],"menu":"健康上报管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"离校申请","menuJump":"列表","tableName":"lixiaoshenqing"}],"menu":"离校申请管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"返校申请","menuJump":"列表","tableName":"fanxiaoshenqing"}],"menu":"返校申请管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","支付"],"menu":"药方登记","menuJump":"列表","tableName":"yaofangdengji"}],"menu":"药方登记管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除","支付"],"menu":"药品订单","menuJump":"列表","tableName":"yaopindingdan"}],"menu":"药品订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","查看评论","问诊","挂号"],"menu":"校医列表","menuJump":"列表","tableName":"xiaoyi"}],"menu":"校医模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","报表","查看评论","立即购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
