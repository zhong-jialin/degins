<template>
  <div style="background-color: #011627;margin-top: -0.04rem;">
    <el-row :gutter="10">
      <el-col :lg="3" :md="2" :sm="1" :xl="2" :xs="0">
        <div class="grid-content "></div>
      </el-col>
      <el-col :lg="11" :md="12" :sm="13" :xl="12" :xs="14">
        <div class="grid-content ">
          <br/><br/>
          <div class="ContentTitle">
            <p><a href="#">所有游戏</a>><a href="#">{{commodityData.name}}</a></p>
            <span>{{commodityData.name}}</span>
          </div>
          <br/>
          <el-carousel height="10rem">
            <el-carousel-item>
              <!-- <h3 class="small">{{ item }}</h3> -->
              <video id="bgvid" autoplay="autoplay" loop="loop"
                     muted="muted" src="">
                <source src="image/star.mp4" type="video/mp4">
              </video>
            </el-carousel-item>
          </el-carousel>


          <div class="SysInfo"><br/><br/>
            <span color="#FFFFFF">评测</span><br/>
            <el-divider></el-divider>
            <span>“The most ambitious in the modern trilogy”</span><br/>
            <span>9/10 – IGN</span><br/><br/>
            <span>“A must-play”</span><br/>
            <span>4.5/5 – Hardcore Gamer</span><br/><br/>
            <span>“One of Lara Croft’s best modern adventures”</span><br/>
            <span>84/100 – PC Gamer</span><br/><br/>
          </div>
          <div class="SysInfo"><br/><br/>
            <span color="#FFFFFF">关于这款游戏</span><br/>
            <el-divider></el-divider>
            <p>在《Shadow of the Tomb Raider：最终版》中，探索劳拉最初为何会注定成为古墓侠盗的最终章。《Shadow of the Tomb
              Raider：最终版》包括主游戏、全7个DLC古墓挑战，以及所有可下载武器、装束、技能，是跟随劳拉探索命运的最终完整体验。</p>
            <br/>
            <p>在世界上最致命的地点生存下来：征服残酷无情的丛林，并活着走出来。探索充满裂隙和幽深隧道的水下环境。</p><br/>
            <p>
              与丛林合而为一：火力不足、以寡敌众的劳拉，必须充分利用丛林中的环境，像美洲豹一样迅猛出击、悄然而退，使用泥浆作为伪装手段，在敌人队伍中制造恐惧，播撒混乱。</p>
            <br/>
            <p>
              探索黑暗残忍的古墓：古墓变得比以往更加恐怖，需要细致谨慎的探索技术才能到达，还要以智慧破解杀机重重的谜题。</p>
            <br/><br/>
          </div>
          <br/><br/>

          <div class="SysInfo">
            <span color="#FFFFFF">系统需求</span><br/>
            <el-tabs type="card">
              <el-tab-pane label="Windows">
                <div class="SysNeed">
                  <font color="#FFFFFF">最低配置</font><br/>
                  操作系统:<p>Windows 7 64 bit</p>
                  处理器:<p>i3-3220 INTEL or AMD Equivalent</p>
                  内存:<p>8 GB RAM</p>
                  显卡:<p>Nvidia GTX 660/GTX 1050 or AMD Radeon HD 7770</p>
                  DirectX 版本:<p>11</p>
                  存储空间:<p>需要 40 GB 可用空间</p>
                </div>
                <div class="SysNeed">
                  <span color="#FFFFFF">推荐配置</span><br/>
                  操作系统:<p>Windows 7 64 bit</p>
                  处理器:<p>i3-3220 INTEL or AMD Equivalent</p>
                  内存:<p>16 GB RAM</p>
                  显卡:<p>Nvidia GTX 660/GTX 1050 or AMD Radeon HD 7770</p>
                  DirectX 版本:<p>11</p>
                  存储空间:<p>需要 40 GB 可用空间</p>
                </div>
              </el-tab-pane>
            </el-tabs>
            <div style="height: 3rem;"></div>
          </div>
        </div>
      </el-col>
      <el-col :lg="7" :md="8" :sm="9" :xl="8" :xs="10">
        <div class="grid-content ">
          <div align="center" style="margin-top: 1.2rem;">
            <br/><br/>
            <div align="center" style="width: 80%; background-size: 100% auto;height: 3rem">
            </div>
            <div class="GameText">
              <p>劳拉·克劳馥一路狂奔，拯救世界免遭玛雅预言中的天灾摧毁，她终将迎接命运，成长为命中注定的古墓侠盗。</p>
              <div class="GameInfo">
                <a>最近评测：&nbsp;&nbsp;&nbsp;&nbsp;<font color="#54a5d4">特别好评</font> </a>
              </div>
              <br/>
              <div class="GameInfo">
                <a>全部评测：&nbsp;&nbsp;&nbsp;&nbsp;<font color="#54a5d4">特别好评</font> </a>
              </div>
              <br/>
              <div class="GameInfo">
                <a>发行日期：&nbsp;&nbsp;&nbsp;&nbsp;<font color="">2018年9月15日</font> </a>
              </div>
              <br/>
              <div class="GameInfo">
                <a>开发商：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#54a5d4">Eidos-Montréal, Crystal
                  Dynamics</font> </a>
              </div>
              <br/>
              <div class="GameInfo">
                <a>发行商：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#54a5d4">Square Enix, Feral Interactive
                  (Mac)</font> </a>
              </div>
              <br/>
              <div class="GameInfo">
                <a>该产品的热门用户自定义标签：</a><br/><br/>
                <el-row class="row-bg" type="flex">
                  <el-col :span="4">
                    <div class="grid-content">
                      <el-button type="primary">冒险</el-button>
                    </div>
                  </el-col>
                  <el-col :span="4">
                    <div class="grid-content">
                      <el-button type="primary">动作</el-button>
                    </div>
                  </el-col>
                  <el-col :span="6">
                    <div class="grid-content">
                      <el-button type="primary">女性主角</el-button>
                    </div>
                  </el-col>
                  <el-col :span="4">
                    <div class="grid-content">
                      <el-button type="primary">单人</el-button>
                    </div>
                  </el-col>
                  <el-col :span="6">
                    <div class="grid-content">
                      <el-button type="primary">开放世界</el-button>
                    </div>
                  </el-col>
                </el-row>
              </div>
              <el-col :span="24">
                <el-card shadow="hover" style="background: #000000;margin-top: 1.2rem;border: 0rem; ">
                  <h2>您对这款游戏感兴趣吗？</h2>
                </el-card>
                <el-card shadow="hover" style="background: #14131a;border: 0rem;">
                  <div class="AskInfo">
                    <p>基于您的游戏、好友以及您关注的鉴赏家，登录以查看您是否有可能喜欢这个内容的原因。</p>
                    <el-row class="row-bg" style="font-size: 0.3rem;" type="flex">
                      <el-col :span="24">
                        <div class="grid-content">
                          <el-button plain style="font-size: 0.3rem;background: #434953;color: #67c1f5;" type="primary">
                            登陆
                          </el-button>
                          或者
                          <el-button plain style="font-size: 0.3rem;background: #434953;color: #67c1f5;" type="primary">
                            在STEAM打开
                          </el-button>
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                </el-card>
                <br/><br/><br/>
              </el-col>
            </div>
          </div>
        </div>
      </el-col>
    </el-row>
    <Comment style="background-color: #011627;color: white" :fid="commodityid" module='游戏评论' />
  </div>
</template>

<script>
import Comment from "@/components/Comment";
import request from "@/utils/request";

export default {
  name: "index",
  components:{
    Comment
  },
  data() {
    let commodityid = this.$route.query.id
    return {
      commodityData: {},
      commodityid: commodityid,
      shopuser: localStorage.getItem("shopuser")
    }
  },
  mounted() {
    this.loadHotels()
  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {
    loadHotels() {
      request.get('/commodity/selectById/' + this.commodityid).then(res => {
        if (res.code === '200') {
          this.commodityData = res.data
          console.log(res)
        } else {
          this.$message.error(res.msg)
        }
      })
    },
  }
}
</script>


<style scoped>
.ContentTitle {
  font-size: 1.5rem;
  color: #FFFFFF;
}

.ContentTitle p {
  text-decoration: none;
  font-size: 1rem;
  color: #acb2b8;
}

.ContentTitle a:hover {
  text-decoration: none;
  font-size: 1rem;
  color: #fff;
}

.ContentTitle a {
  text-decoration: none;
  font-size: 1rem;
  color: #acb2b8;
}

.el-col {
  border-radius: 1rem;
}

.bg-purple-dark {
  background: #99a9bf;
}

.bg-purple {
  background: #d3dce6;
}

.bg-purple-light {
  background: #e5e9f2;
}

.grid-content {
  border-radius: 4px;
  min-height: 36px;
}

.GameText {
  width: 80%;
}

.GameText p {
  color: #fff;
  text-align: left;
  font-size: 1rem;
}

.GameInfo {
  text-align: left;
  font-size: 1rem;
  color: #556772;
}

.SysInfo {
  text-align: left;
  font-size: 1rem;
  color: #acb2b8;
}

.SysNeed {
  width: 49%;
  float: left;
  color: #556772;
}

.SysNeed p {
  text-align: left;
  font-size: 1rem;
  color: #acb2b8;
}

.el-card {
  color: #fff;
}

.AskInfo p {
  font-size: 1rem;
  color: #acb2b8;
}

.el-table tr th {
  background: #000000 !important;
}
</style>
