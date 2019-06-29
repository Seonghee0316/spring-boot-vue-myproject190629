<template>
  <div>
    <Nav></Nav>
    <div id="calculator">
      <div class="result">
        <p>{{current|| "0"}}</p>
      </div>
      <div @click="clear" class="clear">C</div>
      <span v-on:click="append('7')">7</span>
      <span v-on:click="append('8')">8</span>
      <span v-on:click="append('9')">9</span>
      <span @click="add">+</span>

      <span @click="append('4')">4</span>
      <span @click="append('5')">5</span>
      <span @click="append('6')">6</span>
      <span @click="minus">-</span>

      <span @click="append('1')">1</span>
      <span @click="append('2')">2</span>
      <span @click="append('3')">3</span>
      <span @click="divide">/</span>

      <span @click="append('0')">0</span>
      <span @click="dot">.</span>
      <span @click="equal">=</span>
      <span @click="times">*</span>
    </div>
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
  data: () => {
    return {
      current: "",
      previous: null,
      operator: null,
      operatorClicked: false
    };
  },
  methods: {
    clear() {
      this.current = "";
    },
    append(number) {
      if (this.operatorClicked) {
        this.current = "";
        this.operatorClicked = false;
      }
      this.current = `${this.current}${number}`;
    },
    equal() {
      this.current = `${this.operator(
        parseFloat(this.previous),
        parseFloat(this.current)
      )}`;
      this.previous = null;
    },
    setPrevious() {
      this.previous = this.current;
      this.operatorClicked = true;
    },
    add() {
      this.operator = (a, b) => a + b;
      this.setPrevious();
    },
    minus() {
      this.operator = (a, b) => a - b;
      this.setPrevious();
    },
    times() {
      this.operator = (a, b) => a * b;
      this.setPrevious();
    },
    divide() {
      this.operator = (a, b) => a / b;
      this.setPrevious();
    },

    dot() {
      if (this.current.indexOf(".") === -1) {
        this.append(".");
      }
    },
    percent() {
      this.current = `${parseFloat(this.current) / 100}`;
    },
    sign() {
      this.current =
        this.current.charAt(0) === "-"
          ? this.current.slice(1)
          : `-${this.current}`;
    }
  }
};
</script>

<style scoped>
#calculator {
  width: 450px;
  height: 270px;
  margin: 50px auto 0 auto;
  background-color: #191970;
  padding: 10px 10px 260px 10px;
  border-radius: 5px;
  border-bottom: 5px solid #42729b;
}

.result {
  width: 305px;
  height: 40px;
  float: left;
  line-height: 40px;
  background-color: #fff;
  color: #000;
  margin: 5px;
}

.result > p {
  margin-left: 10px;
}

.clear,
span {
  height: 40px;
  border-bottom: 3px solid grey;
  border-radius: 10px;
  text-align: center;
  line-height: 40px;
  cursor: pointer;
  background-color: #ecf0f1;
  color: #2c3e50;
  margin: 5px;
}

.clear {
  width: 95px;
  float: left;
  background-color: #c0392b;
  color: #fff;
  border-color: #a63125;
}

span {
  float: left;
  width: 95px;
}
span:hover {
  background-color: #00bfff;
}
</style>
