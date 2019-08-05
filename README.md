# oo-bootcamp-parking-lot
设计一个停车场，有停车和取车功能

# Tasks

### 停车
---
*Given* 有一辆车和有一个车位的停车场

*When* 停一辆车

*Then* 停车成功并返回一张停车凭证

---

*Given* 有两辆车和有一个车位的停车场

*When* 连续停两辆车

*Then* 第一辆车停车成功并返回停车凭证，第二辆车停车失败并返回提示信息:"Parkinglot is full!"

---

### 取车

---
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

---

### 停车小弟停车

---
*Given* 有一个停车小弟，有1号和2号两个停车场各有一个车位和一辆车

*When* 停一辆车

*Then* 车在1号停车场，停车成功，并返回一张停车凭证

---

*Given* 有一个停车小弟，有1号和2号两个停车场各有一个车位和两辆车

*When* 连续停两辆车

*Then* 第一辆车停在1号停车场，停车成功，并返回一张停车凭证；
        第二辆车停在2号停车场，停车成功，并返回一张停车凭证
        
---

*Given* 有一个停车小弟，有1号和2号两个停车场各有两个车位和两辆车

*When* 连续停两辆车

*Then* 第一辆车和第二辆车都停在1号停车场，停车成功，并分别返回一张停车凭证
        
---

*Given* 有一个停车小弟，有1号和2号两个停车场各有一个车位和三辆车

*When* 连续停三辆车

*Then* 第一辆车停在1号停车场，停车成功，并返回一张停车凭证；
        第二辆车停在2号停车场，停车成功，并返回一张停车凭证；
        第三辆车停车失败，并返回提示信息:"Parkinglot is full!"

---

*Given* 有一个停车小弟，1号和2号两个停车场各有两个车位

*When* 连续停三辆车，从第一个停车场取一辆车，再停入一辆车

*Then* 车在1号停车场，停车成功，并返回一张停车凭证

---
### 停车小弟取车

---
*Given* 有一个停车小弟，1号和2号两个停车场，有一张停车凭证

*When* 取车

*Then* 取车成功

---
*Given* 有一个停车小弟，1号和2号两个停车场，有一张无效的停车凭证

*When* 拿着凭证取车

*Then* 取车失败并返回提示信息:"Invalid receipt!"

---

### 聪明停车小弟停车

---
*Given* 有一个聪明停车小弟，有1号和2号两个停车场，1号有一个空车位，2号有两个空车位

*When* 停一辆车

*Then* 车在2号停车场，停车成功，并返回一张停车凭证

---

*Given* 有一个聪明停车小弟，有1号和2号两个停车场各有一个空车位

*When* 停一辆车

*Then* 车在1号停车场，停车成功，并返回一张停车凭证

---

*Given* 有一个聪明停车小弟，有1号和2号两个停车场各有两个车位，各有两个空余车位

*When* 连续停两辆车

*Then* 第一辆车在1号停车场，停车成功，并返回一张停车凭证；
        第一辆车在2号停车场，停车成功，并返回一张停车凭证。

*Given* 有一个聪明停车小弟，有1号和2号两个停车场，各剩余零个停车位

*When* 停一辆车

*Then* 停车失败，并返回提示信息:"Parkinglot is full!"


---
### 聪明停车小弟取车

---
*Given* 有一个聪明停车小弟，有一张停车凭证

*When* 取车

*Then* 取车成功

---
*Given* 有一个聪明停车小弟，有一张无效的停车凭证

*When* 拿着凭证取车

*Then* 取车失败并返回提示信息:"Invalid receipt!"

---

### 超级停车小弟停车

---
*Given* 有一个超级停车小弟，有1号和2号两个停车场，1号共有两个车位有一个空车位，2号有两个车位有两个空车位

*When* 停一辆车

*Then* 车在2号停车场，停车成功，并返回一张停车凭证

---

*Given* 有一个超级停车小弟，有1号和2号两个停车场，1号共有一个车位有一个空车位，2号有两个车位有一个空车位

*When* 停一辆车

*Then* 车在1号停车场，停车成功，并返回一张停车凭证

---

*Given* 有一个超级停车小弟，有1号和2号两个停车场，各剩余零个停车位

*When* 停一辆车

*Then* 停车失败，并返回提示信息:"Parkinglot is full!"


---
### 超级停车小弟取车

---
*Given* 有一个超级停车小弟，有一张停车凭证

*When* 取车

*Then* 取车成功

---
*Given* 有一个超级停车小弟，有一张无效的停车凭证

*When* 拿着凭证取车

*Then* 取车失败并返回提示信息:"Invalid receipt!"

---

