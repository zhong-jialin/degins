<template>
  <div style="">
        <div style="height: 70px;line-height: 60px;border-bottom: 1px solid #ccc;display: flex;">
          <div style="width: 200px;padding-left: 30px;font-weight: bold;color: dodgerblue;font-size: 3vh">Punk</div>
          <div style="flex: 1;">
            <el-menu class="el-menu-demo" default-active="1" mode="horizontal" router>
              <el-menu-item index="/shopindex" style="margin-left: 40px;color: black">首页</el-menu-item>
              <el-menu-item index="/shopforum" style="margin-left: 40px;color: black">论坛</el-menu-item>
              <el-menu-item index="/user" style="margin-left: 40px;color: black">客服</el-menu-item>
            </el-menu>
          </div>
          <div>
            <div class="">
              <el-dropdown>
                <span class="el-dropdown-link" style="color: dodgerblue">
                  <span>{{ user.username }}</span><i class="el-icon-arrow-down el-icon--right"></i>
                </span>
                <el-dropdown-menu slot="dropdown">
                  <el-dropdown-item>
                    <div @click="clearToken">退出登录</div>
                  </el-dropdown-item>
                </el-dropdown-menu>
              </el-dropdown>
            </div>
          </div>
        </div>
<!--    <el-row :gutter="20" style="background-color: #171d25;height: 100px;line-height: 100px">-->
<!--      <el-col :span="4">-->
<!--        <div class="grid-content bg-purple">-->
<!--          <div style="width: 200px;padding-left: 30px;font-weight: bold;color: #c4c2bf;font-size: 4vh">Punk</div>-->
<!--        </div>-->
<!--      </el-col>-->
<!--      <el-col router :span="16">-->
<!--        <div class="grid-content">-->
<!--          <div style="display: flex;box-sizing: border-box;color: white">-->
<!--            <div style="margin-left: 80px;">-->
<!--              <a href="/shop">-->
<!--                首页-->
<!--              </a>-->
<!--            </div>-->
<!--            <div style="margin-left: 80px">-->
<!--              <a href="/shopcommodity">-->
<!--                论坛-->
<!--              </a>-->
<!--            </div>-->
<!--            <div style="margin-left: 80px">-->
<!--              <a href="/">-->
<!--                客服-->
<!--              </a>-->
<!--            </div>-->
<!--          </div>-->
<!--        </div>-->
<!--      </el-col>-->
<!--      <el-col :span="4">-->
<!--        <div class="grid-content bg-purple" >-->
<!--          <el-dropdown>-->
<!--                      <span class="el-dropdown-link" style="color: #c4c2bf">-->
<!--                        <span>{{ shopuser.username }}</span><i class="el-icon-arrow-down el-icon&#45;&#45;right"></i>-->
<!--                      </span>-->
<!--            <el-dropdown-menu slot="dropdown">-->
<!--              <el-dropdown-item>-->
<!--                <div @click="clearToken">退出登录</div>-->
<!--              </el-dropdown-item>-->
<!--            </el-dropdown-menu>-->
<!--          </el-dropdown>-->
<!--        </div>-->
<!--      </el-col>-->
<!--    </el-row>-->
  </div>

</template>

<style scoped>
/*包含以下四种的链接*/
a {
  text-decoration: none;
  color: inherit;
}
/*正常的未被访问过的链接*/
a:link {
  text-decoration: none;
}
/*已经访问过的链接*/
a:visited {
  text-decoration: none;
}
/*鼠标划过(停留)的链接*/
a:hover {
  text-decoration: none;
}
/* 正在点击的链接*/
a:active {
  text-decoration: none;
}
</style>
<script>

export default {
  name: "ShopHeader",
  methods: {
    handleClick() {
      alert('button click');
    },
    clearToken() {
      localStorage.removeItem("shopuser");
      this.$router.push("/shoplogin");
    }
  },
  data() {
    return {
      activeIndex: 'shop',
      user: JSON.parse(localStorage.getItem("xm-user") || '{}'),
      }
    }
}
</script>

