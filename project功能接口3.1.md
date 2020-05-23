## 1.按站点查询

```http
GET /search/station/参数
```

输入参数：

```java
String depart_station
String arrive_station
DATE date（也可以是8位数字），类似20200520
```

返回：会返回一个实体类Travel的List,名为result

``` json
{
  "result": [
    {
      "travel_id": 1,
      "train_id": "1133",
      "depart_station": "北京西",
      "arrive_station": "沙岭子",
      "depart_time": "15:30",
      "arrive_time": "19:08",
      "duration": "3时38分",
      "day": 1,
      "seatVOS": [
        {
          "seat_type": "软卧",
          "restTicket": 20,
          "pirce": 40
        },
        {
          "seat_type": "硬卧",
          "restTicket": 20,
          "pirce": 30
        },
        {
          "seat_type": "软座",
          "restTicket": 20,
          "pirce": 20
        },
        {
          "seat_type": "硬座",
          "restTicket": 20,
          "pirce": 10
        }
      ],
      "date": "2020/5/20"
    },
    {
      "travel_id": 1,
      "train_id": "G123",
      "depart_station": "北京西",
      "arrive_station": "沙岭子",
      "depart_time": "15:30",
      "arrive_time": "19:08",
      "duration": "3时38分",
      "day": 1,
      "seatVOS": [
        {
          "seat_type": "软卧",
          "restTicket": 20,
          "pirce": 40
        },
        {
          "seat_type": "硬卧",
          "restTicket": 20,
          "pirce": 30
        },
        {
          "seat_type": "软座",
          "restTicket": 20,
          "pirce": 20
        },
        {
          "seat_type": "硬座",
          "restTicket": 20,
          "pirce": 10
        }
      ],
      "date": "2020/5/20"
    }
  ]
}
```

视图参考12306

![1589820006583](C:\Users\Jack Mao\AppData\Roaming\Typora\typora-user-images\1589820006583.png)

## 2.按车次查询

```http
GET /search/train_id/参数
```

输入参数：

```
String train_id
DATE date（也可以是8位数字）
```

输出参数：

List<Schedule>

```java
class schedule{
int station_order;
String station;//车站
String train_id;//车次
String depart_time;//出发时间，可以为空
String arriveTime;//到达时间，可以为空
String duration;//历时
int day;//1为当日到达，2为次日到达，以此类推
}
```

![1589823538957](C:\Users\Jack Mao\AppData\Roaming\Typora\typora-user-images\1589823538957.png)

## 3.订票：

```http
POST  /reserve/ReserveVO/参数
```

输入参数(多张票版本)

```json
{
  "travel_id": 123,
  "date": "2020/05/20",
  "passengers": [
    {
      "name": "张三",
      "id_card_number": "513436200005219421",
      "phone_number": "15812345678",
      "identity": "学生",
      "seat_type": "硬座"
    },
    {
      "name": "李四",
      "id_card_number": "513436200005219422",
      "phone_number": "15812345679",
      "identity": "成人",
      "seat_type": "软卧"
    }
]
}
```

单张票版本（测试用，如果写好多张票版本就不用写这个了）：

```HTTP
POST /reserve/ReserveVOSingle/参数
```

输入参数：

```
{
  "travel_id": 123,
  "date": "2020/05/20",
  "name": "张三",
  "id_card_num": "513436200005219421",
  "phone_number": "13312345678",
  "identity": "成人",
  "SeatType": "硬座"
}
```

返回参数(只返回一个json对象，这里只是展示state不同导致的信息不同)：

```json
{
  "state": 0,
  "order_id": 123,
  "message": "订票成功！"
}
{
  "state": 1,
  "order_id": 0,
  "message": "您输入的信息有误"
}
{
  "state": 2,
  "order_id": 10231,
  "message": "退票成功！"
}
```

![1589823762376](C:\Users\Jack Mao\AppData\Roaming\Typora\typora-user-images\1589823762376.png)

## 4.1 按订单id查询详情：

```http
GET  order/findByOrder_id/参数
```

输入参数：

```
int order_id
```

返回

User是登录账号用户类，Passenger是乘客类

如果存在：

``` json
{
    "order_id": 1234,
    "user_id": "admin",
    "create_time": "2020/05/20",
    "update_time": "2020/05/21",
    "status": "已支付",
    "tickets": [
      {
        "ticket_id": "ASDF1234",
        "passengerName": "张三",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      },
      {
        "ticket_id": "ASDF1234",
        "passengerName": "李四",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      }
    ]
  }
```

```http
GET  order/findByOrder_id/参数
```

## 4.2按user_id 查询订单



输入参数：

```
String user_id
```

和上一个的不同之处在于返回的是一个order的list（5.21日更新:删除order的date，改为create_time和update_time）

``` json
[
  {
    "order_id": 1234,
    "user_id": "admin",
    "create_time": "2020/05/20",
    "update_time": "2020/05/21",
    "status": "已支付",
    "tickets": [
      {
        "ticket_id": "ASDF1234",
        "passengerName": "张三",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      },
      {
        "ticket_id": "ASDF1234",
        "passengerName": "李四",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      }
    ]
  },
  {
    "order_id": 1234,
    "user_id": "admin",
    "create_time": "2020/05/20",
    "update_time": "2020/05/21",
    "status": "退票成功",
    "tickets": [
      {
        "ticket_id": "ASDF1234",
        "passengerName": "张三",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      },
      {
        "ticket_id": "ASDF1234",
        "passengerName": "李四",
        "id_card_number": "513436200005219421",
        "train_id": "Z22",
        "depart_station": "北京",
        "arrive_station": "上海",
        "date": "2020/05/20",
        "departTime": "08:39",
        "arriveTime": "22:30",
        "seatType": "硬座",
        "SeatNumber": "7车19D",
        "ticket_price": 333.5,
        "isValid": 1
      }
    ]
  }
]
```

## 5.权限管理：

```http
GET /user/findById/参数
```

参数：user_id

管理员输入user_id,可以查到下面的信息：

```JSON
{
  "user_id": "admin",
  "password": "abc456",
  "authority": "管理员",
  "passenger": {
    "name": "欧阳锋",
    "id_card_number": "513436200005219421",
    "phone_number": "13345678901",
    "identity": "学生"
  }
}
```

管理员增删查改各种信息没想好，待定。

##  以下几个请求都有2个返回值：state(0是失败，1是成功)，message(“这是提醒消息”)



## 6，添加车站

POST /manage/add_train/参数

```json
{  "name": "广州南",  "city": "广州",  "province": "广东"}
```

## 7. 添加列车

```json
{
  "train_id": "G133",
  "depart_station": "新增车的起始站",
  "arrive_station": "新增车的终点站",
  "duration": "x时x分",
  "distance": 100
}
```

## 8.删除车站

```
{  "station_name": "要删除的车站名"}
```

## 9.删除列车

``{"train_id":"G133"}``

## 10.在一辆火车中加入车站

```json
{
  "train_id": "G133",
  "station": "新增的车站名",
  "station_order": 3,
  "day": 1,
  "depart_time": "07:00",
  "arrive_time": "08:01",
  "duration": "1小时1分",
  "distance": 1000
}
```

## 11.在一辆火车中删除车站

在一辆火车中删除车站

```json
{"train_id":"G133","station":"要删除的在线路内的车站"}
```

