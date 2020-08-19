<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <hello-world msg="환영합니다."/>
    <rest-api />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import RestApi from './components/RestApi.vue'

export default {
  name: 'App',
  components: {
    'hello-world' : HelloWorld,
    'rest-api' : RestApi
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
