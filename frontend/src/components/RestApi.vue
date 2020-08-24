<template>
  <div>
    <h1>Rest API 테스트</h1>
    <button v-on:click="greeting">GET /greeting</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'RestApi',
  methods: {
    greeting: function () {
      axios.get("http://localhost:9080/greeting", {
        params: {
          name: 'Hello'
        }
      })
      .then(function (res) {
        console.log(res.data);
      })
      .catch(function (err) {
        console.log(err);
      })
    }
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
