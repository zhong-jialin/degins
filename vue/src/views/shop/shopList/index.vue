<template>
  <div class="main-content" style="margin-top: 20px">
    <div style="border: 1px solid black">
      <div style="margin-left:60%">
        <el-input size="small" v-model="searchname" style="width: 200px; margin-left: 5px" placeholder="请输入名称"></el-input>
        <el-button style="margin-left: 5px" type="primary" size="small" @click="navToSearch">搜索</el-button>
      </div>
    </div>
    <div>

    </div>
    <div style="width: 60%; margin: 50px auto; text-align: left">

      <div v-if="this.name!==null" style="margin-top: 30px">
        <el-row :gutter="20">
          <el-col :span="6" v-for="item in shopcommodity">
            <img :src="item.avatar" style="width: 100%; height: 175px; border-radius: 10px" alt="" @click="navToDetail(item.id)">
            <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF">{{item.name}}</div>
            <div style="margin-top: 10px">
              <span style="font-weight: bold; font-size: 16px; color: red">￥{{item.price}}</span> 起
              <span style="font-size: 14px; color: #455873FF; margin-left: 20px"><i class="el-icon-chat-line-square"></i>查看</span>
            </div>
          </el-col>
        </el-row>
      </div>
      <div v-else>
        没有找到“{{this.searchname}}”相关的数据
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
<script>
import request from "@/utils/request";

export default {
  name: "index",
  data() {
    let name = this.$route.query.name
    return {
      searchname:null,
      name: name,
      shopcommodity: [],
      params:{
        name: name,
        pageNum:1,
        pageSize:100
      },
    }
  },
  mounted() {
    this.loadHotels()
  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {
    loadHotels() {
      request.get("/commodity/search",{
        params:this.params
      }).then(res=>{
        if (res.code === '0'){
          this.shopcommodity = res.data.list;
          this.total = res.data.total;
          console.log(res)
        }else{
          this.$message({
            message: res.msg,
            type: 'error'
          });
        }
      })
    },
    navToDetail(id) {
      this.$router.push({path:'/shopcommodity',query:{id:id}})
    },
    navToSearch(){
      // this.$router.push({path:'/shoplist',query:{name:this.searchname}})
      location.href = '/shoplist?name=' + this.searchname
    },
  }
}
</script>
