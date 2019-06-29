<template>
   <div>
   <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <router-link to="/" class="navbar-brand" href="#">Home</router-link>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><router-link to="/">Home</router-link></li>
      <li><router-link to="/calculator">계산기</router-link></li>
      <li><router-link to="/joinForm">회원가입</router-link></li>
      <li><router-link to="/loginForm">로그인</router-link></li>
      <li><router-link to="/memberList">회원 목록</router-link></li>
    </ul>
  </div>
</nav>
   </div> 
</template>
<script>
export default {
    
}
</script>
<style scoped>

</style>