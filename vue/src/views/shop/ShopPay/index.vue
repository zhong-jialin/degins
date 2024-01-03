

<template>
  <div>支付界面:{{commodityidid}}</div>
</template>

<style scoped>

</style>
<script>
export default {
  name: "index",
  data(){
    let commodityid = this.$route.query.id
    return{
      commodityidid: commodityid,
      shopuser: localStorage.getItem("shopuser")
    }
  }
}
</script>
