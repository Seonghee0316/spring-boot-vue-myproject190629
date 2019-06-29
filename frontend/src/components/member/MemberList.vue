<template>
<div>
<Nav></Nav>
    <table class="w3-table w3-bordered w3-striped w3-border test w3-hoverable">
      <tbody>
        <tr class="w3-green">
            <th>NO.</th>
            <th>제목</th>
            <th>예제</th>
      </tr>
      </tbody>
      <tbody>
      <tr>
        <td>1</td>
        <td>클릭이벤트</td>
        <td><router-link to="/calculator">계산기</router-link></td>
      </tr>
      <tr>
        <td>2</td>
        <td>회원가입</td>
        <td><router-link to="/joinform">회원가입하기</router-link></td>
      </tr>
      <tr>
        <td>3</td>
        <td>로그인</td>
        <td><router-link to="/loginform">로그인하러가기</router-link></td>
      </tr>
      <tr>
        <td>4</td>
        <td></td>
        <td></td>
      </tr>
      </tbody>
    </table>
    <Footer></Footer>
</div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'

export default {
  components: {
    Nav,
    Footer
  }
}
</script>
<style scoped>

</style>