<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--设置绝对路径获取静态资源--%>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<div class="container">
    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <span class="">方向：</span>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <a class="nav-bar-a" href="">前端开发</a>
        <a class="nav-bar-a" href="">后端开发</a>
        <a class="nav-bar-a" href="">移动开发</a>
        <a class="nav-bar-a" href="">整站开发</a>
        <a class="nav-bar-a" href="">运营维护</a>
    </div>
    <%--1.需要用开发方向为传来每个职位分类--%>
    <%--2.所以先用c标签set一个var2为空值。--%>
    <c:set value="" var="var2"/>
    <%--遍历传来的数据做判断--%>
    <c:forEach var="var" items="${profession}">
        <%--如果传来的开发方向不是空值--%>
        <c:if test="${var.developmentDirection!=var2}">
            <%--把开发方向赋值给var2--%>
            <c:set value="${var.developmentDirection}" var="var2"/>

            <div class="caption">
                    <%--得到每个开发方向，作为标题--%>
                <h4>${var2}</h4>
            </div>

            <div class="row">
                    <%--接下来判断传来的职位的开发方向是否等于上面的标题--%>
                <c:forEach var="profession" items="${profession}">
                    <c:if test="${profession.developmentDirection==var2}">
                        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                            <div class="warp-border">
                                <div class="clearfix">
                                    <div class="icon-people"><img src="${path}/${profession.image}"></div>
                                    <div class="text">
                                        <h4 class="">${profession.occupation}</h4>
                                        <p class="text-present">${profession.description}</p>
                                    </div>
                                </div>

                                <div class="warp-class2">
                                    <div class="warp-class2-text">
                                        <div class="iconfont text-padding">门槛
                                                <%--动态输出星星图片--%>
                                            <c:forEach begin="1" end="${profession.threshold}">
                                                <img src="${path}/images/xx.png">
                                            </c:forEach>
                                        </div>
                                    </div>
                                    <div class="warp-class2-text">
                                        <div class="iconfont text-padding text-border-left">难易程度
                                            <c:forEach begin="1" end="${profession.difficulty}">
                                                <img src="${path}/images/xx.png">
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>

                                <div class="warp-class2">
                                    <div class="warp-class2-text">
                                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growthCycle}</span>年
                                        </div>
                                    </div>
                                    <div class="warp-class2-text">
                                        <div class="iconfont text-padding text-border-left">稀缺程度 <span
                                                class="iconfont-color">${profession.scarcity}</span>家公司需要
                                        </div>
                                    </div>
                                </div>

                                <div class="warp-class2">
                                    <div class="leftWarp">
                                        薪资待遇
                                    </div>
                                    <div class="rightWarp">
                                        <div class="rightWarp-class">
                                            <div class="rightWarp-year">0-1年</div>
                                            <div class="rightWarp-wages">${profession.salaryStart}k-${profession.salaryEnd}k/月</div>
                                        </div>
                                        <div class="rightWarp-class">
                                            <div class="rightWarp-year">1-3年</div>
                                            <div class="rightWarp-wages">${profession.salaryStart}k-${profession.salaryEnd}k/月</div>
                                        </div>
                                        <div class="rightWarp-class border-bottom">
                                            <div class="rightWarp-year">3-5年</div>
                                            <div class="rightWarp-wages">${profession.salaryStart}k-${profession.salaryEnd}k/月</div>
                                        </div>
                                    </div>
                                </div>

                                <div class="warp-class2">
                                    <b class="text-b">有${profession.currentStudentNumber}人正在学</b>
                                </div>
                                <div class="warp-class2">
                                    <p class="text-p">提示:${profession.prompt}</p>
                                </div>

                                <div class="flip-container">
                                    <p class="flip-title">${profession.flipTitle}</p>
                                    <p class="flip-text">${profession.flipText}</p>
                                </div>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
        </c:if>
    </c:forEach>
</div>
