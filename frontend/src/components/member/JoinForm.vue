<template>
  <div>
    <Nav></Nav>
    <!-- <form class="form-horizontal" action method="POST"> -->
      <form class="form-horizontal">
      <fieldset>
        <div id="legend">
          <legend class>Register</legend>
        </div>
        <div class="control-group">
          <!-- Username -->
          <label class="control-label" for="username">Username</label>
          <div class="controls">
            <input
              type="text"
              id="username"
              name="username"
              placeholder
              class="input-xlarge"
              v-model="username"
            >
            <p class="help-block">Username can contain any letters or numbers, without spaces</p>
          </div>
        </div>

        <div class="control-group">
          <!-- E-mail -->
          <label class="control-label" for="email">E-mail</label>
          <div class="controls">
            <input type="text" id="email" name="email" placeholder class="input-xlarge" v-model="email">
            <p class="help-block">Please provide your E-mail</p>
          </div>
        </div>

        <div class="control-group">
          <!-- Password-->
          <label class="control-label" for="password">Password</label>
          <div class="controls">
            <input type="password" id="password" name="password" placeholder class="input-xlarge" v-model="password">
            <p class="help-block">Password should be at least 4 characters</p>
          </div>
        </div>

        <div class="control-group">
          <!-- Password -->
          <label class="control-label" for="password_confirm">Password (Confirm)</label>
          <div class="controls">
            <input
              type="password"
              id="password_confirm"
              name="password_confirm"
              placeholder
              class="input-xlarge"
              v-model="repassword"
            >
            <p class="help-block">Please confirm password</p>
          </div>
        </div>

        <div class="control-group">
          <!-- Button -->
          <div class="controls">
            <button class="btn btn-success" @click="check">Register</button>
          </div>
        </div>
      </fieldset>
    </form>
    <Footer></Footer>
  </div>
</template>
<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
export default {
  components: {
    Nav,
    Footer
  },

  data() {
    return {
      username: "",
      email: "",
      password: "",
      repassword: ""
    };
  },

  methods: {
    check() {
      if (this.username === "") {
        alert('이름을 입력해주세요!!');
      } else if(this.email === ''){
        alert('이메일을 입력해주세요.')
      } else if(this.password === '') {
        alert('비밀번호를 입력해주세요!')
      } else if(this.repassword === '') {
        alert('비밀번호를 다시 입력해주세요!')
      } else if(this.password != this.repassword){
        alert('비밀번호가 다릅니다.')
      } else {
        alert('가입 완료!');
        this.$router.push('/loginForm');
      }
    }
  }
};
</script>
<style scoped>
</style>