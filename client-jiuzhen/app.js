//app.js
App({
  data: {
    openId: '',
  },
    motto: 'Hello World',

    onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)
    var code;
    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
        if (res.code) {
          // 发起网络请求
          console.log("===============")
          console.log(res)
          console.log("===============")
          
          code = res.code;
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    }),
    // 获取用户信息
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo
              console.log(res.userInfo)
              wx.request({
                url: this.hostConfig.host + '/login/getOpenId',
                data: {
                  encryptedData: res.encryptedData,
                  iv: res.iv,
                  code: code
                },
                success: function (res) {
                  console.log("===============")
                  console.log(res.data.openId)
                 console.log("===============")
                      
                  wx.setStorageSync('openId', res.data.openId)
                  console.log(wx.getStorageSync('openId'));
                }
              })
              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
      }
    })
  },
  globalData: {
    userInfo: null,
    //是否是管理员
    isAdmin: 0,
  },
  hostConfig: {
    host: "http://localhost:8080"
  },

})
    // wx.getSetting({
    //   success: res => {
    //     if (res.authSetting['scope.userInfo']) {
    //       // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
    //       wx.getUserInfo({
    //         success: res => {
    //           // 可以将 res 发送给后台解码出 unionId
    //           this.globalData.userInfo = res.userInfo
    //           console.log(res)
    //           var that = this
    //           wx.request({
    //             url: this.hostConfig.host + '/login/getOpenId',
    //             data: {
    //               encryptedData: res.encryptedData,
    //               iv: res.iv,
    //               code: code
    //             },
    //             success: function (res) {
    //               console.log("===============")
    //               console.log(res.data.openId)
    //               console.log("===============")
    //               that.globalData.isAdmin = res.data.isAdmin;
    //               console.log("isAdmin:" + that.globalData.isAdmin);
    //               wx.setStorageSync('openId', res.data.openId);
    //               // this.setData({
    //               //   openId: res.data.openId,
    //               // })
    //               if (that.globalData.isAdmin == 1){
    //                 wx.redirectTo({
    //                   url: '/pages/examine/examine'　　// 页面 A
    //                 })
    //               }
    //             }

    //           })
    //           // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
    //           // 所以此处加入 callback 以防止这种情况
    //           if (this.userInfoReadyCallback) {
    //             this.userInfoReadyCallback(res)
    //           }
    //         }
    //       })
    //     }
    //   }
    // })
//   },
//   globalData: {
//     userInfo: null,
//     //是否是管理员
//     isAdmin: 0,
//   },
//   hostConfig:{
//     host: "http://localhost:8080"
//   },

// })