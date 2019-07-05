<template>
  <div class="main">
    <section class="signup">
      <img src="images/signup-bg.jpg" alt />
      <div class="container">
        <div class="signup-content">
          <form id="signup-form" class="signup-form">
            <h2 class="form-title">company join</h2>
            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="email" class="form-input" v-model="offerId" placeholder="기업 ID" />
              </div>
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerName" placeholder="기업명" />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="password" class="form-input" placeholder="비밀번호" />
                <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
              </div>
              <div class="form-group col-md-6">
                <input
                  type="password"
                  class="form-input"
                  name="re_password"
                  id="re_password"
                  v-model="offerPassword"
                  placeholder="비밀번호 확인"
                />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerIndustry" placeholder="산업/직군" />
              </div>
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerCeoName" placeholder="대표명" />
              </div>
            </div>

            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerPmName" placeholder="담당자명" />
              </div>
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerPmPhone" placeholder="담당자연락처" />
              </div>
            </div>

            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerHomepage" placeholder="회사 홈페이지" />
              </div>
              <div class="form-group col-md-6">
                <input type="text" class="form-input" v-model="offerAddress" placeholder="회사 주소" />
              </div>
            </div>

            <div class="form-row">
              <div class="form-group"></div>
              <div class="form-group col-md-12">
                <button @click="join" name="submit" id="submit" class="form-submit">Sign up</button>
              </div>
            </div>
          </form>
          <p class="loginhere">
            이미 계정이 있으신가요?
            <router-link to="/login" class="loginhere-link">Login here</router-link>
          </p>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      context: "http://localhost:9001/offers",
      offerId: "",
      offerPassword: "",
      offerName: "",
      offerCeoName: "",
      offerIndustry: "",
      offerPmName: "",
      offerPmPhone: "",
      offerHomepage: "",
      offerAddress: ""
    };
  },

  methods: {
    join() {
      alert(`${this.offerId}님 가입을 축하드립니다! `);
      let data = {
        offerId: this.offerId,
        offerPassword: this.offerPassword,
        offerName: this.offerName,
        offerCeoName: this.offerCeoName,
        offerIndustry: this.offerIndustry,
        offerPmName: this.offerPmName,
        offerPmPhone: this.offerPmPhone,
        offerHomepage: this.offerHomepage,
        offerAddress: this.offerAddress
      };

      let headers = {
        "Content-Type": "application/json",
        Authorization: "JWT fefege.."
      };
      axios
        .post(`${this.context}`, JSON.stringify(data), { headers: headers })
        .then(res => {
          // alert(`SUCCESS2 : ${res.data}`)
        })
        .catch(e => {
          alert("ERROR");
          this.$router.link(-1);
        });

      this.$router.push("/login");
    }
  }
};
</script>

<style scoped>
/* @extend display-flex; */
display-flex,
.display-flex,
.display-flex-center {
  display: flex;
  display: -webkit-flex;
}

/* @extend list-type-ulli; */
list-type-ulli {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

a:focus,
a:active {
  text-decoration: none;
  outline: none;
  transition: all 300ms ease 0s;
  -moz-transition: all 300ms ease 0s;
  -webkit-transition: all 300ms ease 0s;
  -o-transition: all 300ms ease 0s;
  -ms-transition: all 300ms ease 0s;
}

input,
select,
textarea {
  outline: none;
  appearance: unset !important;
  -moz-appearance: unset !important;
  -webkit-appearance: unset !important;
  -o-appearance: unset !important;
  -ms-appearance: unset !important;
}

input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  appearance: none !important;
  -moz-appearance: none !important;
  -webkit-appearance: none !important;
  -o-appearance: none !important;
  -ms-appearance: none !important;
  margin: 0;
}

input:focus,
select:focus,
textarea:focus {
  outline: none;
  box-shadow: none !important;
  -moz-box-shadow: none !important;
  -webkit-box-shadow: none !important;
  -o-box-shadow: none !important;
  -ms-box-shadow: none !important;
}

input[type="checkbox"] {
  appearance: checkbox !important;
  -moz-appearance: checkbox !important;
  -webkit-appearance: checkbox !important;
  -o-appearance: checkbox !important;
  -ms-appearance: checkbox !important;
}

input[type="radio"] {
  appearance: radio !important;
  -moz-appearance: radio !important;
  -webkit-appearance: radio !important;
  -o-appearance: radio !important;
  -ms-appearance: radio !important;
}

img {
  max-width: 100%;
  height: auto;
}

figure {
  margin: 0;
}

p {
  margin-bottom: 0px;
  font-size: 15px;
  color: #777;
}

h2 {
  line-height: 1.66;
  margin: 0;
  padding: 0;
  font-weight: 900;
  color: #222;
  font-family: "Montserrat";
  font-size: 24px;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 40px;
}

.clear {
  clear: both;
}

body {
  font-size: 14px;
  line-height: 1.8;
  color: #222;
  font-weight: 400;
  font-family: "Montserrat";
  /* background-image: url("../../assets/signup-bg.jpg"); */
  background-repeat: no-repeat;
  background-size: cover;
  -moz-background-size: cover;
  -webkit-background-size: cover;
  -o-background-size: cover;
  -ms-background-size: cover;
  background-position: center center;
  padding: 115px 0;
}

.container {
  width: 660px;
  position: relative;
  margin: 0 auto;
}

.display-flex {
  justify-content: space-between;
  -moz-justify-content: space-between;
  -webkit-justify-content: space-between;
  -o-justify-content: space-between;
  -ms-justify-content: space-between;
  align-items: center;
  -moz-align-items: center;
  -webkit-align-items: center;
  -o-align-items: center;
  -ms-align-items: center;
}

.display-flex-center {
  justify-content: center;
  -moz-justify-content: center;
  -webkit-justify-content: center;
  -o-justify-content: center;
  -ms-justify-content: center;
  align-items: center;
  -moz-align-items: center;
  -webkit-align-items: center;
  -o-align-items: center;
  -ms-align-items: center;
}

.position-center {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -moz-transform: translate(-50%, -50%);
  -webkit-transform: translate(-50%, -50%);
  -o-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
}

.signup-content {
  background: #fff;
  border-radius: 10px;
  -moz-border-radius: 10px;
  -webkit-border-radius: 10px;
  -o-border-radius: 10px;
  -ms-border-radius: 10px;
  padding: 40px 0px;
}

.signup-content .form-title {
  font-size: 32px;
}

.form-group {
  overflow: hidden;
  margin-bottom: 30px;
}

.form-input {
  width: 100%;
  border: 1px solid #ebebeb;
  border-radius: 5px;
  -moz-border-radius: 5px;
  -webkit-border-radius: 5px;
  -o-border-radius: 5px;
  -ms-border-radius: 5px;
  padding: 17px 20px;
  box-sizing: border-box;
  font-size: 14px;
  font-weight: 500;
  color: #222;
}
.form-input::-webkit-input-placeholder {
  color: #999;
}
.form-input::-moz-placeholder {
  color: #999;
}
.form-input:-ms-input-placeholder {
  color: #999;
}
.form-input:-moz-placeholder {
  color: #999;
}
.form-input::-webkit-input-placeholder {
  font-weight: 500;
}
.form-input::-moz-placeholder {
  font-weight: 500;
}
.form-input:-ms-input-placeholder {
  font-weight: 500;
}
.form-input:-moz-placeholder {
  font-weight: 500;
}
.form-input:focus {
  border: 1px solid transparent;
  -webkit-border-image-source: -webkit-linear-gradient(
    to right,
    #9face6,
    #74ebd5
  );
  -moz-border-image-source: -moz-linear-gradient(to right, #9face6, #74ebd5);
  -o-border-image-source: -o-linear-gradient(to right, #9face6, #74ebd5);
  border-image-source: linear-gradient(to right, #9face6, #74ebd5);
  -webkit-border-image-slice: 1;
  border-image-slice: 1;
  border-radius: 5px;
  -moz-border-radius: 5px;
  -webkit-border-radius: 5px;
  -o-border-radius: 5px;
  -ms-border-radius: 5px;
  background-origin: border-box;
  background-clip: content-box, border-box;
}
.form-input:focus::-webkit-input-placeholder {
  color: #222;
}
.form-input:focus::-moz-placeholder {
  color: #222;
}
.form-input:focus:-ms-input-placeholder {
  color: #222;
}
.form-input:focus:-moz-placeholder {
  color: #222;
}

.form-submit {
  width: 100%;
  border-radius: 5px;
  -moz-border-radius: 5px;
  -webkit-border-radius: 5px;
  -o-border-radius: 5px;
  -ms-border-radius: 5px;
  padding: 17px 20px;
  box-sizing: border-box;
  font-size: 14px;
  font-weight: 700;
  color: #fff;
  text-transform: uppercase;
  border: none;
  background-image: -moz-linear-gradient(to left, #74ebd5, #9face6);
  background-image: -ms-linear-gradient(to left, #74ebd5, #9face6);
  background-image: -o-linear-gradient(to left, #74ebd5, #9face6);
  background-image: -webkit-linear-gradient(to left, #74ebd5, #9face6);
  /* background-image: linear-gradient(to left, #1171c3, #337ab7ad); */
  background-image: linear-gradient(#337ab7);
}

input[type="checkbox"]:not(old) {
  width: 2em;
  margin: 0;
  padding: 0;
  font-size: 1em;
  display: none;
}

input[type="checkbox"]:not(old) + label {
  display: inline-block;
  margin-top: 7px;
  margin-bottom: 25px;
}

input[type="checkbox"]:not(old) + label > span {
  display: inline-block;
  width: 13px;
  height: 13px;
  margin-right: 15px;
  margin-bottom: 3px;
  border: 1px solid #ebebeb;
  border-radius: 2px;
  -moz-border-radius: 2px;
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  -ms-border-radius: 2px;
  background: white;
  background-image: -moz-linear-gradient(white, white);
  background-image: -ms-linear-gradient(white, white);
  background-image: -o-linear-gradient(white, white);
  background-image: -webkit-linear-gradient(white, white);
  background-image: linear-gradient(white, white);
  vertical-align: bottom;
}

input[type="checkbox"]:not(old):checked + label > span {
  background-image: -moz-linear-gradient(white, white);
  background-image: -ms-linear-gradient(white, white);
  background-image: -o-linear-gradient(white, white);
  background-image: -webkit-linear-gradient(white, white);
  background-image: linear-gradient(white, white);
}

input[type="checkbox"]:not(old):checked + label > span:before {
  content: "\f26b";
  display: block;
  color: #222;
  font-size: 11px;
  line-height: 1.2;
  text-align: center;
  font-family: "Material-Design-Iconic-Font";
  font-weight: bold;
}

.label-agree-term {
  font-size: 12px;
  font-weight: 600;
  color: #555;
}

.term-service {
  color: #555;
}

.loginhere {
  color: #555;
  font-weight: 500;
  text-align: center;
  margin-top: 30px;
  margin-bottom: 5px;
}

.loginhere-link {
  font-weight: 700;
  color: #222;
}

.field-icon {
  float: right;
  margin-right: 17px;
  margin-top: -32px;
  position: relative;
  z-index: 2;
  color: #555;
}

@media screen and (max-width: 768px) {
  .container {
    width: calc(100% - 40px);
    max-width: 100%;
  }
}
@media screen and (max-width: 480px) {
  .signup-content {
    padding: 50px 25px;
  }
}
</style>
