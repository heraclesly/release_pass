/**
 *充值
 */
function pay(uniqueId, amount) {
    $.ajax({
        url: "recharge/get_prepay_id",
        data: {uniqueId: uniqueId, amount: amount},
        type: "POST",
        async: false,
        dataType: "json",
        success: function (data) {
            layer.closeAll('loading');
            if (data.code==0) {
                WeixinJSBridge.invoke('getBrandWCPayRequest', {
                    "appId": data.data.appId,
                    "timeStamp": "" + data.data.timeStamp,
                    "nonceStr": data.data.nonceStr,
                    "package": data.data.package_str,
                    "signType": data.data.signType,
                    "paySign": data.data.paySign
                }, function (res) {
                    // 状态 0:未支付 1:已支付 2:已取消 3:支付失败
                    if (res.err_msg == "get_brand_wcpay_request:ok") {
                        history.back();
                    } else if (res.err_msg == "get_brand_wcpay_request:cancel") {
                        callback(data.data.wxPayId, 2);
                    } else if (res.err_msg == "get_brand_wcpay_request:fail") {
                        callback(data.data.wxPayId, 3);
                    }
                    // window.location.href="../user.html";
                });
            } else {
                callback(data.data.wxPayId, 3);
            }
        },
        error: function (xhr, text, e) {

        }
    });
}

function callback(wxPayId, status) {
    var url = "recharge/callback"
    $.ajax({
        url: url,
        data: {wxPayId: wxPayId, status: status},
        type: "POST",
        async: false,
        dataType: "json",
        success: function (data) {
        },
        error: function (xhr, text, e) {

        }
    });
}
