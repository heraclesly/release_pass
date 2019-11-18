/**
 * 是否不租了？
 * @param orderId
 * @param rentType 租用方式 0:自动延期租用 1：一存一取租用
 * @param openCnt  开门次数

 */
function home() {
    return $('#contextPath').val();
}

function loadingHide() {
    $("#fullScreen,#floatLayer").hide();

    $("#fullScreen,#floatLayer").remove();
}

function drawRing(opts) {

    var $floatLayer = $('#floatLayer');
    var _opts = {
        parent: document.getElementById('floatLayer'),
        width: 40,
        radius: 8,
        arc: 2,
        perent: 100,
        color: ['#ccc', '#007FD8'],
        textColor: '#000',
        textSize: '6px',
        animated: true,
        after: function () {
            //$("#fullScreen,#floatLayer").remove();
        }
    }, k;
    for (k in opts) _opts[k] = opts[k];

    var parent = _opts.parent,
        width = _opts.width,
        radius = _opts.radius,
        arc = _opts.arc,
        perent = parseFloat(_opts.perent),
        color = _opts.color,
        textSize = _opts.textSize,
        textColor = _opts.textColor,
        c = document.getElementById('canvas'),
        ctx = null,
        x = 0,
        animated = _opts.animated,
        after = _opts.after;

    // parent.prepend(c);
    ctx = c.getContext("2d");
    ctx.canvas.width = width;
    ctx.canvas.height = width;

    function clearFill() {
        ctx.clearRect(0, 0, width, width);
    }

    function fillBG() {
        ctx.beginPath();
        ctx.lineWidth = arc;
        ctx.strokeStyle = color[0];
        ctx.arc(width / 2, width / 2, radius, 0, 2 * Math.PI);
        ctx.stroke();
    }

    function fillArc(x) {
        ctx.beginPath();
        ctx.lineWidth = arc;
        ctx.strokeStyle = color[1];
        ctx.arc(width / 2, width / 2, radius, -90 * Math.PI / 180, (x * 3.6 - 90) * Math.PI / 180);
        ctx.stroke();
    }

    function fillText(x) {
        ctx.font = textSize + ' Arial';
        ctx.fillStyle = textColor;
        ctx.textBaseline = "middle";
        ctx.textAlign = 'center';
        ctx.fillText(x.toFixed(1) + '%', width / 2, width / 2);
    }

    function fill(x) {
        fillBG();
        fillArc(x);
        // fillText(x);
    }

    if (!animated) return fill(perent);

    fill(x);
    !function animate() {
        x = x + 0.05;
        if (x > perent) {
            //return after && after();
        }
        setTimeout(animate, 15);
        clearFill();
        fill(x);
    }();
}