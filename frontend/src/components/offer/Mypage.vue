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
        <!-- <p>Dummy Heading</p> -->
        <li class="active">
          <!-- <a
            href="#homeSubmenu"
            data-toggle="collapse"
            aria-expanded="false"
            class="dropdown-toggle"
          >Home</a유성희>-->
          <!-- <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Home 1</a>
                        </li>
                        <li>
                            <a href="#">Home 2</a>
                        </li>
                        <li>
                            <a href="#">Home 3</a>
                        </li>
          </ul>-->
        </li>
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
          <!-- <ul class="collapse list-unstyled" id="pageSubmenu">
            <li>
              <a href="#">Page 1</a>
            </li>
            <li>
              <a href="#">Page 2</a>
            </li>
            <li>
              <a href="#">Page 3</a>
            </li>
          </ul>-->
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

      <!-- <ul class="list-unstyled CTAs">
                <li>
                    <a href="https://bootstrapious.com/tutorial/files/sidebar.zip" class="download">Download source</a>
                </li>
                <li>
                    <a href="https://bootstrapious.com/p/bootstrap-sidebar" class="article">Back to article</a>
                </li>
      </ul>-->
    </nav>

    <!-- Page Content  -->
    <div id="content">
      <!-- <nav class="navbar navbar-expand-lg navbar-light bg-light"> -->
      <!-- <h1>My page</h1> -->
      <!-- <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa-align-left"></i>
                        <span>Toggle Sidebar</span>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Page</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Page</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Page</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Page</a>
                            </li>
                        </ul>
                    </div>
      </div>-->
      <!-- </nav> -->

      <!-- <h2>Collapsible Sidebar Using Bootstrap 4</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

            <div class="line"></div>

            <h2>Lorem Ipsum Dolor</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

            <div class="line"></div>

            <h2>Lorem Ipsum Dolor</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

            <div class="line"></div>

            <h3>Lorem Ipsum Dolor</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>-->

      <div class="container emp-profile">
        <div class="row">
          <div class="col-md-4">
            <div class="profile-img">
              <!-- <img src="../../assets/Kakao_CI.jpg" alt> -->
              <!-- <div class="file btn btn-lg btn-primary">
              Change Photo
              <input type="file" name="file">
              </div>-->
            </div>
          </div>
          <div class="col-md-10">
            <div class="profile-head">
              <h1>{{offerName}}</h1>
              <!-- <h6>Web Developer and Designer</h6> -->
              <!-- <p class="proile-rating">
              RANKINGS :
              <span>8/10</span>
              </p>-->
              <h4>{{offerIndustry}}</h4>
            </div>
          </div>
        </div>
      </div>
      <form class="container">
        <div class="col-md-12">
          <ul class="nav nav-tabs" id="myTab" role="tablist">
            <li class="nav-item">
              <!-- <a
              class="nav-link active"
              id="home-tab"
              data-toggle="tab"
              href="#home"
              role="tab"
              aria-controls="home"
              aria-selected="true"
              >마이페이지</a>-->
            </li>
            <!-- <li class="nav-item">
            <a
              class="nav-link"
              id="profile-tab"
              data-toggle="tab"
              href="#profile"
              role="tab"
              aria-controls="profile"
              aria-selected="false"
            >찜한 목록</a>
            </li>-->
          </ul>
        </div>

        <div class="mypage">
          <form class="col-md-12">
            <form class="tab-pane" id="edit">
              <form role="form">
                <!-- <div class="form-group row">
              <label class="col-lg-3 col-form-label form-control-label">비밀번호</label>
              <div class="col-lg-9">
                <label class="col-form-label form-control-label">********</label>
              </div>
                </div>-->
                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">기업 ID</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="text" value="janeuser"> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerId}}</label>
                  </div>
                </div>
                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">대표자</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="text" value="janeuser"> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerCeoName}}</label>
                  </div>
                </div>

                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">담당자 명</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="url" value> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerPmName}}</label>
                  </div>
                </div>
                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">담당자 연락처</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="text" value placeholder="Street"> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerPmPhone}}</label>
                  </div>
                </div>
                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">회사 홈페이지</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="email" value="email@gmail.com"> -->
                    <!-- <label class="col-form-label form-control-label mypage-value">{{offerHomepage}}</label> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerHomepage}}</label>
                  </div>
                </div>
                <div class="form-group row">
                  <label class="col-lg-3 col-form-label form-control-label">회사 주소</label>
                  <div class="col-lg-9">
                    <!-- <input class="form-control" type="email" value="email@gmail.com"> -->
                    <label class="col-form-label form-control-label mypage-value">{{offerAddress}}</label>
                  </div>
                </div>

                <!-- <div class="form-group row">
              <label class="col-lg-3 col-form-label form-control-label">Password</label>
              <div class="col-lg-9">
                <input class="form-control" type="password" value="11111122333">
              </div>
            </div>
            <div class="form-group row">
              <label class="col-lg-3 col-form-label form-control-label">Confirm password</label>
              <div class="col-lg-9">
                <input class="form-control" type="password" value="11111122333">
              </div>
                </div>-->
                <!-- <div class="form-group row">
              <label class="col-lg-3 col-form-label form-control-label"></label>
              <div class="col-lg-9">
                <input type="reset" class="btn btn-secondary" value="Cancel">
                <input type="button" class="btn btn-primary" value="Save Changes">
              </div>
                </div>-->
              </form>
              <div class="mypage-view-btn">
                <router-link to="/mypageEdit">
                  <button type="button" class="btn">수정</button>
                </router-link>
                <router-link to="/login">
                  <button type="button" class="btn">로그아웃</button>
                </router-link>
                <button type="button" class="btn" @click="leave_account">탈퇴</button>
              </div>
            </form>
          </form>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
import axios from "axios";
import {store} from '../../store';
export default {
  data() {
    return {
      context: "http://localhost:9001/offers",
      offerId:  store.state.offerId,
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
    // alert('마이페이지 들어옴');
    // 데이터를 갖고 와야함. dto를 들고와서 각각 값을 박으면 됨.
    // this.offerName = res.data.offerName

    // alert(this.offerId)
    axios
      .get(`${this.context}/getOfferInfo/${this.offerId}`)
      .then(res => {
        (this.offerName = res.data.offerName),
          (this.offerIndustry = res.data.offerIndustry),
          (this.offerId = res.data.offerId),
          (this.offerCeoName = res.data.offerCeoName),
          (this.offerPmName = res.data.offerPmName),
          (this.offerPmPhone = res.data.offerPmPhone),
          (this.offerAddress = res.data.offerAddress),
          (this.offerHomepage = res.data.offerHomepage);
        // alert(`offerName : ${res.data.offerName}`);
      })
      .catch(e => {
        alert("mypage - error");
      });
  },

  methods: {
    leave_account() {
      axios
        .delete(`${this.context}/leave_acount/${this.offerId}`)
        .then(res => {
          alert("탈퇴되셨습니다.");
        })
        .catch(e => {
          alert("탈퇴 - error");
        });
        this.$router.push("/login")
    }
  }
};
</script>

<style scoped>
@import "https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700";
.wrapper {
  /* font-family: "Poppins", sans-serif; */
  /* background: #fafafa; */
  font-family: "Do Hyeon", sans-serif;
  /* font-weight: 300px; */
}

p {
  font-family: "Poppins", sans-serif;
  font-size: 1.1em;
  /* font-weight: 300; */
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

#sidebar ul.components {
  /* padding: 25px 0; */
  /* border-bottom: 1px solid #47748b; */
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

.profile-img {
  /* text-align: center; */
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
  /* font-weight: 600; */
}
.profile-head .nav-tabs {
  margin-bottom: 5%;
}
.profile-head .nav-tabs .nav-link {
  /* font-weight: 600; */
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
  /* font-weight: 600; */
  margin-top: 10%;
}
.profile-work a {
  text-decoration: none;
  color: #495057;
  /* font-weight: 600; */
  font-size: 16px;
}
.profile-work ul {
  list-style: none;
}
.profile-tab label {
  /* font-weight: 600; */
}
.profile-tab p {
  /* font-weight: 600; */
  color: #0062cc;
}

.mypage {
  padding: 50px;
  /* text-align: center; */
  margin-right: auto;
  margin-left: auto;
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
  padding-top: 50px;
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
