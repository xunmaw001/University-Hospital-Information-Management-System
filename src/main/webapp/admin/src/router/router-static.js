import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fanxiaoshenqing from '@/views/modules/fanxiaoshenqing/list'
    import news from '@/views/modules/news/list'
    import qingjiashenqing from '@/views/modules/qingjiashenqing/list'
    import lixiaoshenqing from '@/views/modules/lixiaoshenqing/list'
    import keshi from '@/views/modules/keshi/list'
    import zaixianwenzhen from '@/views/modules/zaixianwenzhen/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import jiankangshangbao from '@/views/modules/jiankangshangbao/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import discussxiaoyi from '@/views/modules/discussxiaoyi/list'
    import yaopinfenlei from '@/views/modules/yaopinfenlei/list'
    import yaopindingdan from '@/views/modules/yaopindingdan/list'
    import binglijilu from '@/views/modules/binglijilu/list'
    import xiaoyi from '@/views/modules/xiaoyi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yaofangdengji from '@/views/modules/yaofangdengji/list'
    import wenzhenhuifu from '@/views/modules/wenzhenhuifu/list'
    import xianshangguahao from '@/views/modules/xianshangguahao/list'
    import discussyaopinxinxi from '@/views/modules/discussyaopinxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/fanxiaoshenqing',
        name: '返校申请',
        component: fanxiaoshenqing
      }
      ,{
	path: '/news',
        name: '疫情通告',
        component: news
      }
      ,{
	path: '/qingjiashenqing',
        name: '请假申请',
        component: qingjiashenqing
      }
      ,{
	path: '/lixiaoshenqing',
        name: '离校申请',
        component: lixiaoshenqing
      }
      ,{
	path: '/keshi',
        name: '科室',
        component: keshi
      }
      ,{
	path: '/zaixianwenzhen',
        name: '在线问诊',
        component: zaixianwenzhen
      }
      ,{
	path: '/xueyuan',
        name: '学院',
        component: xueyuan
      }
      ,{
	path: '/jiankangshangbao',
        name: '健康上报',
        component: jiankangshangbao
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/discussxiaoyi',
        name: '校医评论',
        component: discussxiaoyi
      }
      ,{
	path: '/yaopinfenlei',
        name: '药品分类',
        component: yaopinfenlei
      }
      ,{
	path: '/yaopindingdan',
        name: '药品订单',
        component: yaopindingdan
      }
      ,{
	path: '/binglijilu',
        name: '病例记录',
        component: binglijilu
      }
      ,{
	path: '/xiaoyi',
        name: '校医',
        component: xiaoyi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yaofangdengji',
        name: '药方登记',
        component: yaofangdengji
      }
      ,{
	path: '/wenzhenhuifu',
        name: '问诊回复',
        component: wenzhenhuifu
      }
      ,{
	path: '/xianshangguahao',
        name: '线上挂号',
        component: xianshangguahao
      }
      ,{
	path: '/discussyaopinxinxi',
        name: '药品信息评论',
        component: discussyaopinxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
