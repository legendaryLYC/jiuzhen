
//获取应用实例
const app = getApp()

Page({
  data: {
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    departmentList: [],
    hospitalName: '',
    hospitalId:''
  },
  //事件处理函数
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function (options) {
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
    this.setData({
      'hospitalId': options.id
    });
    this.loadPageData();
  },
  getUserInfo: function (e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  inputHospitalName: function (e) {
    this.setData({
      hospitalName: e.detail.value
    })
  },

  loadPageData: function () {
    var that = this
    wx.request({
      url: app.hostConfig.host + '/department',
      data: {
        hospitalId: that.data.hospitalId
      },
      success: function (res) {
        console.log(res.data)
        that.setData({
          departmentList: res.data['departmentList']
        })

      }
    })
  },
  
  bindButtonTap: function (e) {
    var that = this
    wx.request({
      url: app.hostConfig.host + '/department',
      data: {
        hospitalId: that.data.hospitalId,
        hospitalName: that.data.hospitalName,
      },
      success: function (res) {
        console.log(res.data)
        that.setData({
          departmentList: res.data['departmentList']
        })

      }

    })
  },

  gotoPage: function (e) {
    var page = e.currentTarget.dataset.page;
    var id = e.currentTarget.dataset.id;
    console.log("page:" + page);
    console.log("id:" + id);
    wx.navigateTo({
      url: page + '?id=' + id
    });

  }


})
