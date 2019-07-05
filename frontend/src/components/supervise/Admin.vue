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
            <li>
              <router-link to="/login">로그아웃</router-link>
            </li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="검색..." />
          </form>
        </div>
      </div>
    </div>

    <div class="container-fluid">
      <div class="row">
        <div class="main">
          <h2 class="sub-header">기업 회원목록</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>NO</th>
                  <th>기업 ID</th>
                  <th>기업명</th>
                  <th>담당자명</th>
                  <th>담당자 연락처</th>
                  <th>회사 홈페이지</th>
                  <th>회사 주소</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(item,index) in arr" v-bind:key="item.id">
                  <td>{{index + 1}}</td>
                  <td>{{item.offerId}}</td>
                  <td>{{item.offerName}}</td>
                  <td>{{item.offerPmName}}</td>
                  <td>{{item.offerPmPhone}}</td>
                  <td>{{item.offerHomepage}}</td>
                  <td>{{item.offerAddress}}</td>
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
import axios from "axios";
export default {
  data() {
    return {
      context: "http://localhost:9001/offers",
      id: "",
      offerId: "",
      offerName: "",
      offerPmName: "",
      offerPmPhone: "",
      offerHomepage: "",
      offerAddress: "",
      arr: []
    };
  },

  created() {
    axios
      .get(`${this.context}/getOfferList`)
      .then(res => {
        this.arr = res.data;
      })
      .catch(e => {
        alert("ERROR");
      });
  }
};
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
  background-color: #337ab7;
}
.sidebar {
  display: none;
}

.main {
  padding: 20px;
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

.navbar-brand {
  color: white;
  font-weight: bold;
}

.navbar-inverse .navbar-nav > li > a {
  color: white;
  font-weight: bold;
}
</style>
