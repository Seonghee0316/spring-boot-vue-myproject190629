<template>
  <div>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button
            type="button"
            class="navbar-toggle"
            data-toggle="collapse"
            data-target=".navbar-collapse"
          >
            <span class="sr-only">네비게이션 토글</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">관리자 페이지</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
        <!-- <li><a href="#">대시보드</a></li>
        <li><a href="#">설정</a></li>
        <li><a href="#">프로필</a></li> -->
        <li><router-link to="/login">로그아웃</router-link></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="검색...">
          </form>
        </div>
      </div>
    </div>

    <div class="container-fluid">
      <div class="row">
        <!-- <div class="col-sm-3 col-md-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="#">개요</a></li>
        <li><a href="#">보고서</a></li>
        <li><a href="#">분석결과</a></li>
        <li><a href="#">내보내기</a></li>
      </ul>
      <ul class="nav nav-sidebar">
        <li><a href="">네비게이션A1</a></li>
        <li><a href="">네비게이션A2</a></li>
        <li><a href="">네비게이션A3</a></li>
      </ul>
      <ul class="nav nav-sidebar">
        <li><a href="">네비게이션B1</a></li>
        <li><a href="">네비게이션B2</a></li>
      </ul>
        </div>-->
        <!-- <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main"> -->
        <div class="main">
          <h2 class="sub-header">기업 회원목록</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>NO</th>
                  <th>ID</th>
                  <th>기업명</th>
                  <th>담당자명</th>
                  <th>연락처</th>
                  <th>이메일</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>Lorem</td>
                  <td>ipsum</td>
                  <td>dolor</td>
                  <td>02-3533-1830</td>
                  <td>fgeot@gmail.com</td>
                </tr>
                <tr>
                  <td>2</td>
                  <td>amet</td>
                  <td>consectetur</td>
                  <td>adipiscing</td>
                  <td>02-3533-1830</td>
                  <td>gqeot@gmail.com</td>
                </tr>
                <tr>
                  <td>3</td>
                  <td>Integer</td>
                  <td>nec</td>
                  <td>odio</td>
                  <td>02-3533-1830</td>
                  <td>eidpe@gmail.com</td>
                </tr>
                <tr>
                  <td>4</td>
                  <td>dapibus</td>
                  <td>diam</td>
                  <td>Sed</td>
                  <td>02-3533-1830</td>
                  <td>qlpxie@gmail.com</td>
                </tr>
                <tr>
                  <td>5</td>
                  <td>Nulla</td>
                  <td>quis</td>
                  <td>sem</td>
                  <td>02-3533-1830</td>
                  <td>cccse@gmail.com</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="admin-pagination">
            <nav aria-label="Page navigation example">
              <ul class="pagination justify-content-center">
                <li class="page-item disabled">
                  <a class="page-link" href="#" tabindex="-1">Previous</a>
                </li>
                <li class="page-item">
                  <a class="page-link" href="#">1</a>
                </li>
                <li class="page-item">
                  <a class="page-link" href="#">2</a>
                </li>
                <li class="page-item">
                  <a class="page-link" href="#">3</a>
                </li>
                <li class="page-item">
                  <a class="page-link" href="#">Next</a>
                </li>
              </ul>
            </nav>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
* {
  font-family: NanumGothic, "Malgun Gothic";
}
body {
  padding-top: 50px;
}
.sub-header {
  margin-top: 100px;
  padding-bottom: 30px;
  border-bottom: 1px solid #eee;
  text-align: center;
}
.navbar-fixed-top {
  border: 0;
}
.sidebar {
  display: none;
}
@media (min-width: 768px) {
  /* .sidebar {
    position: fixed;
    top: 51px;
    bottom: 0;
    left: 0;
    z-index: 1000;
    display: block;
    padding: 20px;
    overflow-x: hidden;
    overflow-y: auto;
    background-color: #f5f5f5;
    border-right: 1px solid #eee;
  } */
}
/* .nav-sidebar {
  margin-right: -21px;
  margin-bottom: 20px;
  margin-left: -20px;
}
.nav-sidebar > li > a {
  padding-right: 20px;
  padding-left: 20px;
}
.nav-sidebar > .active > a,
.nav-sidebar > .active > a:hover,
.nav-sidebar > .active > a:focus {
  color: #fff;
  background-color: #428bca;
} */
.main {
  padding: 20px;
  /* text-align: center; */
}
@media (min-width: 768px) {
  .main {
    padding-right: 40px;
    padding-left: 40px;
  }
}
.main .page-header {
  margin-top: 0;
}
.placeholders {
  margin-bottom: 30px;
  text-align: center;
}
.placeholders h4 {
  margin-bottom: 0;
}
.placeholder {
  margin-bottom: 20px;
}
.placeholder img {
  display: inline-block;
  border-radius: 50%;
}
.admin-pagination {
  text-align: center;
}
</style>
