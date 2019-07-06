<template>
  <div class="wrapper">
    <!-- Sidebar  -->
    <nav id="sidebar">
      <div class="sidebar-header">
        <h3>
          <a href="#">
            <span>{{offerName}}</span> 님
          </a>
        </h3>
      </div>

      <ul class="list-unstyled components">
        <li class="active"></li>
        <li>
          <a href="#">공고</a>
        </li>
        <li>
          <a
            href="#pageSubmenu"
            data-toggle="collapse"
            aria-expanded="false"
            class="dropdown-toggle"
          >면접</a>
        </li>
        <li>
          <a href="#">자기PR</a>
        </li>
        <li>
          <a href="#">Q&A</a>
        </li>
        <li>
          <a href="#">문의</a>
        </li>
      </ul>
    </nav>

    <!-- Page Content  -->
    <div id="content">
      <form>
        <div class="container emp-profile">
          <div class="row">
            <div class="col-md-4">
              <div class="profile-img"></div>
            </div>
            <div class="col-md-10">
              <div class="profile-head">
                <h1>
                  <input type="hidden" name="offerName" v-model="offerName" />
                  <label>{{offerName}}</label>
                </h1>
                <h4>
                  <input type="hidden" v-model="offerIndustry" />
                  <label>{{offerIndustry}}</label>
                </h4>
              </div>
            </div>
          </div>
        </div>
        <form class="container">
          <div class="col-md-12">
            <ul class="nav nav-tabs" id="myTab" role="tablist">
              <li class="nav-item"></li>
            </ul>
          </div>

          <div class="mypage">
            <form class="col-md-12">
              <form class="tab-pane" id="edit">
                <form role="form">
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">기업 ID</label>
                    <div class="col-lg-9">
                      <input
                        type="hidden"
                        class="col-form-label form-control-label mypage-value"
                        v-model="offerId"
                      />
                      <label
                        type="text"
                        class="col-form-label form-control-label mypage-value"
                      >{{offerId}}</label>
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">비밀번호</label>
                    <div class="col-lg-9">
                      <input
                        type="password"
                        class="col-form-label form-control-label mypage-value"
                        v-model="offerPassword"
                      />
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">대표자</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        v-model="offerCeoName"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">담당자 명</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        v-model="offerPmName"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">담당자 연락처</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        v-model="offerPmPhone"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">회사 주소</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        v-model="offerAddress"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">회사 홈페이지</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        v-model="offerHomepage"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                </form>
                <div class="mypage-view-btn">
                  <button type="button" class="btn" @click="MypageEdit">수정</button>

                  <router-link to="/mypage">
                    <button type="button" class="btn">취소</button>
                  </router-link>
                </div>
              </form>
            </form>
          </div>
        </form>
      </form>
    </div>
  </div>
</template>

<script>
import axios from "axios";
import { store } from "../../store";
export default {
  data() {
    return {
      context: "http://localhost:9001/offers",
      offerId: store.state.offerId,
      offerPassword: "",
      offerName: "",
      offerIndustry: "",
      offerCeoName: "",
      offerPmName: "",
      offerPmPhone: "",
      offerHomepage: "",
      offerAddress: ""
    };
  },

  created() {
    axios
      .get(`${this.context}/getOfferInfo/${this.offerId}`)
      .then(res => {
        this.offerName = res.data.offerName;
          this.offerIndustry = res.data.offerIndustry;
          this.offerId = res.data.offerId;
          this.offerCeoName = res.data.offerCeoName;
          this.offerPmName = res.data.offerPmName;
          this.offerPmPhone = res.data.offerPmPhone;
          this.offerAddress = res.data.offerAddress;
          this.offerHomepage = res.data.offerHomepage;
      })
      .catch(e => {
        alert("mypage - error");
      });
  },

  methods: {
    MypageEdit() {
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

      if (this.offerPassword) {
        axios
          .put(`${this.context}/${this.offerId}`, JSON.stringify(data), {
            headers: headers
          })
          .then(res => {
            this.$router.push("/mypage")
          })
          .catch(e => {
            alert("수정실패!");
            this.$router.link(-1);
          });
      } else {
        alert("비밀번호를 입력해주세요!");
      }
    }
  }
};
</script>

<style scoped>
@import "https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700";
.wrapper {
  font-family: "Do Hyeon", sans-serif;
}

p {
  font-family: "Poppins", sans-serif;
  font-size: 1.1em;
  line-height: 1.7em;
  color: #999;
}

a,
a:hover,
a:focus {
  color: inherit;
  text-decoration: none;
  transition: all 0.3s;
}

.navbar {
  padding: 15px 10px;
  background: #fff;
  border: none;
  border-radius: 0;
  margin-bottom: 40px;
  box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.1);
}

.navbar-btn {
  box-shadow: none;
  outline: none !important;
  border: none;
}

.line {
  width: 100%;
  height: 1px;
  border-bottom: 1px dashed #ddd;
  margin: 40px 0;
}

/* ---------------------------------------------------
    SIDEBAR STYLE
----------------------------------------------------- */

.wrapper {
  display: flex;
  width: 100%;
  align-items: stretch;
}

#sidebar {
  min-width: 250px;
  max-width: 250px;
  background: #adcee2;
  color: rgb(54, 47, 47);
  transition: all 0.3s;
}

#sidebar {
  font-weight: bold;
}

#sidebar.active {
  margin-left: -250px;
}

#sidebar .sidebar-header {
  padding: 40px 20px;
  background: #9fc7e0;
  text-align: center;
}

.sidebar-header h3 {
  font-weight: bold;
}
.sidebar-header h3 span {
  color: #2d699c;
}

#sidebar ul p {
  color: #fff;
  padding: 10px;
}

#sidebar ul li a {
  padding: 30px;
  font-size: 1.1em;
  display: block;
}

#sidebar ul li a:hover {
  color: #4a9aca;
  background: #fff;
}

#sidebar ul li.active > a,
a[aria-expanded="true"] {
  color: #fff;
  background: #4a9aca;
}

a[data-toggle="collapse"] {
  position: relative;
}

.list-unstyled {
  text-align: center;
}

.list-unstyled li {
  font-size: 20px;
}

.dropdown-toggle::after {
  display: block;
  position: absolute;
  top: 50%;
  right: 20px;
  transform: translateY(-50%);
}

ul ul a {
  font-size: 0.9em !important;
  padding-left: 30px !important;
  background: #6d7fcc;
}

ul.CTAs {
  padding: 20px;
}

ul.CTAs a {
  text-align: center;
  font-size: 0.9em !important;
  display: block;
  border-radius: 5px;
  margin-bottom: 5px;
}

a.download {
  background: #fff;
  color: #7386d5;
}

a.article,
a.article:hover {
  background: #6d7fcc !important;
  color: #fff !important;
}

/* ---------------------------------------------------
    CONTENT STYLE
----------------------------------------------------- */

#content {
  width: 100%;
  padding: 10px;
  min-height: 100vh;
  transition: all 0.3s;
}

/* ---------------------------------------------------
    MEDIAQUERIES
----------------------------------------------------- */

@media (max-width: 768px) {
  #sidebar {
    margin-left: -250px;
  }
  #sidebar.active {
    margin-left: 0;
  }
  #sidebarCollapse span {
    display: none;
  }
}

.emp-profile {
  padding: 2%;
  margin-top: 2%;
  margin-bottom: 2%;
  border-radius: 0.5rem;
  background: #fff;
}

.emp-profile .row {
  text-align: left;
}

.profile-img img {
  width: 70%;
  height: 100%;
}
.profile-img .file {
  position: relative;
  overflow: hidden;
  margin-top: -20%;
  width: 70%;
  border: none;
  border-radius: 0;
  font-size: 15px;
  background: #212529b8;
}
.profile-img .file input {
  position: absolute;
  opacity: 0;
  right: 0;
  top: 0;
}
.profile-head h1 {
  color: #2d699c;
  font-weight: 600;
  margin-bottom: 20px;
}
.profile-head h6 {
  color: #337ab7;
}

.profile-head input {
  width: 500px;
}

.profile-edit-btn {
  border: none;
  border-radius: 1.5rem;
  width: 70%;
  padding: 2%;
  font-weight: 600;
  color: #6c757d;
  cursor: pointer;
}
.proile-rating {
  font-size: 22px;
  color: #818182;
  margin-top: 5%;
}
.proile-rating span {
  color: #495057;
  font-size: 25px;
}
.profile-head .nav-tabs {
  margin-bottom: 5%;
}
.profile-head .nav-tabs .nav-link {
  border: none;
}
.profile-head .nav-tabs .nav-link.active {
  border: none;
  border-bottom: 2px solid #0062cc;
}
.profile-work {
  padding: 14%;
  margin-top: -15%;
}
.profile-work p {
  font-size: 22px;
  color: #818182;
  margin-top: 10%;
}
.profile-work a {
  text-decoration: none;
  color: #495057;
  font-size: 16px;
}
.profile-work ul {
  list-style: none;
}

.profile-tab p {
  color: #0062cc;
}

.mypage {
  padding: 50px;
  margin-right: auto;
  margin-left: auto;
}

.mypage input {
  width: 500px;
}

.mypage .row {
  margin-bottom: 25px;
  font-size: 18px;
  text-align: left;
}

.mypage-value {
  font-size: 15px;
  text-align: left;
}

.mypage-view-btn {
  text-align: center;
  padding-top: 20px;
}

.mypage-view-btn button {
  margin-right: 10px;
  padding: 10px;
  font-weight: bold;
}

.tab-pane .mypage-value {
  font-size: 18px;
}
</style>
