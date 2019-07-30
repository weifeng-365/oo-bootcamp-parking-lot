# oo-bootcamp-parking-lot
设计一个停车场，有停车和取车功能

# Tasks

### 停车
*Given* 有一辆车和有一个车位的停车场

*When* 停一辆车

*Then* 停车成功并返回一张停车凭证

---

*Given* 有两辆车和有一个车位的停车场

*When* 连续停两辆车

*Then* 第一辆车停车成功并返回停车凭证，第二辆车停车失败并返回提示信息:"Parkinglot is full!"

---

### 取车
*Given* 一个停车场，此停车场停有自己的车并且有一张该停车场的停车凭证

*When* 用停车凭证取一辆车

*Then* 取车成功

---

*Given* 一个停车场，此停车场有自己的车

*When* 不用凭证取一辆车

*Then* 取车失败并返回提示信息:"Invalid receipt!"

---

*Given* 一个停车场有一辆车和对应的停车凭证

*When* 用该凭证连续取两次车

*Then* 第一次取车成功，第二次取车失败并返回提示信息:"Invalid receipt!"

---

*Given* 一个停车场，此停车场停有自己的车并且有一张该停车场的无效停车凭证

*When* 用停车凭证取一辆车

*Then* 取车失败并返回提示信息:"Invalid receipt!"