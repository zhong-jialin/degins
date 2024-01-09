

<template>
  <div>
    <el-table :data="tableData" strip>
      <el-table-column prop="id" label="序号" width="70" align="center"></el-table-column>
      <el-table-column prop="orderNo" label="订单编号"></el-table-column>
      <el-table-column prop="goodsName" label="商品名称"></el-table-column>
      <el-table-column prop="num" label="商品数量" align="center"></el-table-column>
      <el-table-column prop="total" label="总价格" align="center"></el-table-column>
      <el-table-column prop="createTime" label="创建时间"></el-table-column>
      <el-table-column prop="payNo" label="支付编号"></el-table-column>
      <el-table-column prop="payTime" label="支付时间"></el-table-column>
      <el-table-column prop="status" label="订单状态" align="center">
        <template v-slot="scope">
          <el-tag type="warning" v-if="scope.row.status === '待支付'">待支付</el-tag>
          <el-tag type="success" v-if="scope.row.status === '已支付'">已支付</el-tag>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center">
        <template v-slot="scope">
          <el-button type="primary" size="small" @click="pay(scope.row)" v-if="scope.row.status === '待支付'">支付</el-button>
        </template>
      </el-table-column>
    </el-table>

  </div>
</template>

<style scoped>

</style>
<script>
import request from "@/utils/request";

export default {
  name: "WishList",
  data() {
    return {
      tableData: [],
      user: JSON.parse(localStorage.getItem('xm-user') || '{}'),
    }
  },
  created() {
    this.load()
  },
  methods: {
    pay(row) {
      window.open('http://localhost:9090/alipay/pay?orderNo=' + row.orderNo)
    },
    load() {  // 分页查询
      request.get('/orders/selectById/' + this.user.id).then(res => {
        this.tableData = res.data
      })
    },
  }
}
</script>
