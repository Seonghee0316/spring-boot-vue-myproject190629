<template>
  <div>
    <Nav></Nav>
    <form>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" v-model="email">
      </div>
      <div class="form-group">
        <label for="pwd">Password:</label>
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="pass">
      </div>
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
      <button  class="btn btn-default" @click="get">조 회</button>
      <button  class="btn btn-default" @click="post">입 력</button>
      <button  class="btn btn-default" @click="put">수 정</button>
      <button  class="btn btn-default" @click="del">삭 제</button>
      <button  class="btn btn-default" @click="getInfo">값 가져오기</button>
      <button  class="btn btn-default" @click="summit">회원가입</button>
      <!-- <button  @submit="info" type="submit" class="btn btn-default">Submit</button> -->
    </form>
    <Footer></Footer>
  </div>
</template>

<script>
import Nav from "@/components/common/Nav.vue";
import Footer from "@/components/common/Footer.vue";
import axios from 'axios'

export default {
  components: {
    Nav,
    Footer
  },

  data() {
    return{
      context: 'http://localhost:9000',
      id : '',
     password : ''
    }
  },

  methods: {
    get() {
      axios.get(`${this.context}/customers/count`)
      .then(res=>{
        alert(`SUCCESS : ${res.data}`)
      })
      .catch(e=>{
        alert('ERROR')
      })
    },
    post(){
      axios.post('/customers')
      .then(d=>{
        alert(`POST 연동성공: ${res.data.result}`)
      })
    },

    put(){
      axios.put('/customers/id')
      .then(d=>{
        alert(`PUT 연동성공: ${res.data.result}`)
      })
    },
    
    del(){
      axios.delete('/customers/id')
      .then(d=>{
        alert(`DELETE 연동성공: ${res.data.result}`)
      })
    },

    getInfo(){
      var data = {
       id : 'haha',
       pass : '1234'
     }
     axios.get(`${this.context}/customers/${id}`)
      .then(res=>{
        alert(`SUCCESS : ${res.data}`)
      })
      .catch(e=>{
        alert('ERROR')
      })     
    },
    
    summit() {

     var data = {
       id : this.id,
       pass : this.password
     }

     axios.post(this.localhost + 'customers/join', data).then(e => {
       alert('SUCCESS' + e.data);
     }).catch(e => {
       alert('ERROR');
     })
   }

  }
};

// submit누르면 alert뜸 @submit id = '' , pw = ''
</script>

<style scoped>
</style>