<template>
  <div style="margin-top: 20px">
    <div>
      <div style="margin-left:60%">
        <el-input size="small" v-model="searchname" style="width: 200px; margin-left: 5px" placeholder="请输入名称"></el-input>
        <el-button style="margin-left: 5px" type="primary" size="small" @click="navToSearch">搜索</el-button>
      </div>
    </div>
    <div style="margin-top: 10px">

    </div>
<!--    轮播图-->
    <template>
      <el-carousel :autoplay="false"  style="border: 1px solid black;width: 80%;margin: 0 auto;height: 400px" indicator-position="outside">
        <a v-for="item in tableData" :key="item.id"  @click="commodity('/front/shopcommodity?id=' + item.id)">
          <el-carousel-item>
            <div style="display: flex">
              <div style="width: 60%;border: 1px solid black;margin: 10px;height: 350px;position: relative">
                <div>
                  <el-image
                      style="width: 100%;height: 100%;position: absolute"
                      :src="item.avatar"
                      :preview-src-list="item.avatar">
                  </el-image>
                </div>
              </div>
              <div style="width: 40%;display: block;flex: 4">
                <h2>{{ item.name }}</h2>
                <h3>{{item.price}}</h3>
                <h4>推出时间：{{item.ctime}}</h4>
              </div>
            </div>

          </el-carousel-item>
        </a>
      </el-carousel>
    </template>
  </div>
</template>

<script>
import request from "@/utils/request";

export default {
  name: "index",
  data() {
    return {
      searchname:null,
      tableData: [],
      total:0,
      params:{
        name: '',
        pageNum:1,
        pageSize:6
      },
    }
  },
  methods:{
    navToSearch(){
      this.$router.push({path:'/shoplist',query:{name:this.searchname}})
    },
    findBySearch(){
      request.get("/commodity/selectPage",{
        params:this.params
      }).then(res=>{
        if (res.code === '200'){
          this.tableData = res.data.list;
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
    commodity(url){
      location.href = url
    }
  },
  created() {
    this.findBySearch()
  }
}
</script>


