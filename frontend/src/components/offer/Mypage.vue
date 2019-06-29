<template>
  <form class="body">
    <div class="container emp-profile">
      <div class="row">
        <div class="col-md-4">
          <div class="profile-img">
            <img src="../../assets/Kakao_CI.jpg" alt>
            <!-- <div class="file btn btn-lg btn-primary">
              Change Photo
              <input type="file" name="file">
            </div>-->
          </div>
        </div>
        <div class="col-md-6">
          <div class="profile-head">
            <h1>(주) 카카오</h1>
            <!-- <h6>Web Developer and Designer</h6> -->
            <!-- <p class="proile-rating">
              RANKINGS :
              <span>8/10</span>
            </p>-->
            <h5>포털 및 기타 인터넷 정보매개 서비스업</h5>
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
                <label class="col-lg-3 col-form-label form-control-label">대표자</label>
                <div class="col-lg-9">
                  <!-- <input class="form-control" type="text" value="janeuser"> -->
                  <label class="col-form-label form-control-label mypage-value">여민수/조수용</label>
                </div>
              </div>
              <div class="form-group row">
                <label class="col-lg-3 col-form-label form-control-label">회사 주소</label>
                <div class="col-lg-9">
                  <!-- <input class="form-control" type="email" value="email@gmail.com"> -->
                  <label class="col-form-label form-control-label mypage-value">경기 성남시 분당구 삼평동 681번지 에이치스퀘어 N동</label>
                </div>
              </div>
              <div class="form-group row">
                <label class="col-lg-3 col-form-label form-control-label">담당자 명</label>
                <div class="col-lg-9">
                  <!-- <input class="form-control" type="url" value> -->
                  <label class="col-form-label form-control-label mypage-value">이신혜</label>
                </div>
              </div>
              <div class="form-group row">
                <label class="col-lg-3 col-form-label form-control-label">담당자 연락처</label>
                <div class="col-lg-9">
                  <!-- <input class="form-control" type="text" value placeholder="Street"> -->
                  <label class="col-form-label form-control-label mypage-value">02 3653 1293</label>
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
              <button type="button" class="btn btn-primary">Edit Profile</button>
              <router-link to="/login"><button type="button" class="btn btn-primary">Logout</button></router-link>
            </div>
          </form>
        </form>
      </div>
    </form>
  </form>
</template>

<script>
export default {};
</script>

<style scoped>
.body {
  /* background: -webkit-linear-gradient(left, #3931af, #00c6ff); */
}
.emp-profile {
  padding: 2%;
  margin-top: 2%;
  margin-bottom: 2%;
  border-radius: 0.5rem;
  background: #fff;
}
.profile-img {
  text-align: center;
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
  color: #333;
  font-weight: 600;
  margin-bottom: 20px;
}
.profile-head h6 {
  color: #0062cc;
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
  font-weight: 600;
}
.profile-head .nav-tabs {
  margin-bottom: 5%;
}
.profile-head .nav-tabs .nav-link {
  font-weight: 600;
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
  font-weight: 600;
  margin-top: 10%;
}
.profile-work a {
  text-decoration: none;
  color: #495057;
  font-weight: 600;
  font-size: 16px;
}
.profile-work ul {
  list-style: none;
}
.profile-tab label {
  font-weight: 600;
}
.profile-tab p {
  font-weight: 600;
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
}
</style>
