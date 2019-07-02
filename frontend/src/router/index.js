import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/offer/Login'
import Join from '@/components/offer/Join'
import Mypage from '@/components/offer/Mypage'
import Admin from '@/components/supervise/Admin'
import MypageEdit from '@/components/offer/MypageEdit'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/',name: 'home',component: Home},
    {path: '/login', name: 'login', component: Login},
    {path: '/join', name: 'join', component: Join},
    {path: '/mypage', name: 'mypage', component: Mypage},
    {path: '/admin', name: 'admin', component: Admin},
    {path: '/mypageEdit', name: 'mypage', component: MypageEdit}
  ]
}) 
