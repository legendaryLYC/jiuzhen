// pages/component/tabbar/tabbar.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    userAuth: {
      type: Number,
      value: 0,
    },
    active:{
      type: String,
      value: 0,
    }
  },

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 组件的方法列表
   */
  methods: {
    navigator:function(e) {
      wx.redirectTo({
        url: e.target.dataset.page
      })
    }
  }
})
