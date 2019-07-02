<template>
  <div class="wrapper">
    <!-- Sidebar  -->
    <nav id="sidebar">
      <div class="sidebar-header">
        <h3>
          <a href="#">
            <span>유성희</span> 님
          </a>
        </h3>
      </div>

      <ul class="list-unstyled components">
        <!-- <p>Dummy Heading</p> -->
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
                  <input type="text" value="(주) 카카오" />
                </h1>
                <h4>
                  <input type="text" value="포털 및 기타 인터넷 정보매개 서비스업" />
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
                        value="KAKAO"
                        class="col-form-label form-control-label mypage-value"
                      />
                      <label
                        type="text"
                        value="KAKAO"
                        class="col-form-label form-control-label mypage-value"
                      >KAKAO</label>
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">비밀번호</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="****"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">대표자</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="여민수/조수용"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>

                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">담당자 명</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="이신혜"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">담당자 연락처</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="여민수/조수용"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">회사 주소</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="경기 성남시 분당구 삼평동 681번지 에이치스퀘어 N동"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                  <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">회사 홈페이지</label>
                    <div class="col-lg-9">
                      <input
                        type="text"
                        value="https://www.kakaocorp.com/"
                        class="col-form-label form-control-label mypage-value"
                      />
                    </div>
                  </div>
                </form>
                <div class="mypage-view-btn">
                  <router-link to="/mypage">
                    <button type="button" class="btn">수정</button>
                  </router-link>
                  <router-link to="/mypage">
                    <button type="button" class="btn">취소</button>
                  </router-link>
                  <!-- <router-link to="/login">
                    <button type="button" class="btn">로그아웃</button>
                  </router-link>
                  <router-link to="/login">
                    <button type="button" class="btn">탈퇴</button>
                  </router-link>-->
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
export default {};
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
