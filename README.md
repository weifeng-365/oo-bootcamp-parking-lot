# oo-bootcamp-parking-lot
设计一个停车场，有停车和取车功能

# Tasks

## 停车场
*Given* 指定容量的停车场，eg: 500.

*When* 创建这个停车场

*Then* 创建成功


## 停车
*Given* 有剩余空位的停车场，eg: 300

*When* 停一辆车

*Then* 停车成功


*Given* 没有空位的停车场

*When* 停一辆车

*Then* 停车失败


## 取车
*Given* 一个停车场，此停车场停有自己的车

*When* 取一辆车

*Then* 取车成功


*Given* 一个停车场，此停车场未停有自己的车

*When* 取一辆车

*Then* 取车失败
















# ------------客户账单系统----------------
*Given* 一辆车，车牌号ABC，时间2019-7-25 14:00

*When* 停车

*Then* 停车记录最后一条包含 ABC 2019-7-25 14:00


*Given* 一辆车，车牌号ABC，时间2019-7-25 15:00

*When* 取车

*Then* 取车记录最后一条包含 ABC 2019-7-25 15:00


*Given* 一辆车，车牌号ABC

*When* 客户执行打印账单

*Then* 账单包含：车牌号ABC，入场时间 2019-7-25 14:00，出场时间 2019-7-25 15:00，收费标准：2元/h，费用：2元

# ------------物业车辆管理账单系统----------------
*Given* 停车记录和取车记录

*When* 执行打印

*Then* 账单包含：当天停车次数50，当天取车次数100，总停车时长500，预计收取费用:1000

