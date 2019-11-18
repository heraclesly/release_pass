/*!
 * pull to refresh v3.0
 *author:wallace
 *2015-10-15
 *qq447363121
 *陈国华
 */
var refresher = {
	info: {
		"pullDownLable": "下拉刷新",
		"pullingDownLable": "释放立即刷新",
		"pullUpLable": "上拉加载更多",
		"pullingUpLable": "释放加载更多",
		"loadingLable": "加载中..."
	},
	init: function(parameter) {
		var wrapper = document.getElementById(parameter.id);
		var div = document.createElement("div");
		div.className = "scroller";
		wrapper.appendChild(div);
		var scroller = wrapper.querySelector(".scroller");
		var list = wrapper.querySelector("#" + parameter.id + " ul");
		scroller.insertBefore(list, scroller.childNodes[0]);
		var pullDown = document.createElement("div");
		pullDown.className = "pullDown";
		var loader = document.createElement("div");
		loader.className = "pullDownIcon";
		pullDown.appendChild(loader);
		var pullDownLabel = document.createElement("div");
		pullDownLabel.className = "pullDownLabel";
		pullDown.appendChild(pullDownLabel);
		scroller.insertBefore(pullDown, scroller.childNodes[0]);
		var pullDownEle = wrapper.querySelector(".pullDown");
		var pullDownOffset = pullDownEle.offsetHeight;
		this.scrollIt(parameter, pullDownEle, pullDownOffset);

	},
	scrollIt: function(parameter, pullDownEle, pullDownOffset) {
		eval(
		parameter.id + "= new iScroll(\
									parameter.id,\
									 {\
										 useTransition: true,\
										 vScrollbar: false,\
										 topOffset: pullDownOffset,\
										 onRefresh: function () {\
														  refresher.onRelease(pullDownEle);\
																		 },\
										onScrollMove: function () {\
														     refresher.onScrolling(this,pullDownEle,pullDownOffset);\
																		},\
										onScrollEnd: function () {\
													       refresher.onScrollEnd(pullDownEle,parameter.pullDownAction);\
																		}\
										})"
					);
	},
	onScrolling: function(e, pullDownEle,pullDownOffset) {
		if (e.y > -(pullDownOffset)&&!pullDownEle.className.match('loading')) {
			pullDownEle.classList.remove("flip");
			pullDownEle.querySelector('.pullDownLabel').innerHTML = refresher.info.pullDownLable;
			pullDownEle.querySelector('.pullDownIcon').style.display = "block";
			e.minScrollY = -pullDownOffset;
		}
        if (e.y > 0&&!pullDownEle.className.match('loading')) {
            pullDownEle.classList.add("flip");
            pullDownEle.querySelector('.pullDownLabel').innerHTML = refresher.info.pullingDownLable;
            e.minScrollY = 0;
        }


	},
	onRelease: function(pullDownEle) {
		if (pullDownEle.className.match('loading')) {
			pullDownEle.classList.toggle("loading");
			pullDownEle.querySelector('.pullDownLabel').innerHTML = refresher.info.pullDownLable;
		}

	},
	onScrollEnd: function(pullDownEle, pullDownAction) {
		if (pullDownEle.className.match('flip')&&!pullDownEle.className.match('loading')) {
			pullDownEle.classList.add("loading");
			pullDownEle.classList.remove("flip");
			pullDownEle.querySelector('.pullDownLabel').innerHTML = refresher.info.loadingLable;
			if (pullDownAction) pullDownAction();	
		}

	}
}