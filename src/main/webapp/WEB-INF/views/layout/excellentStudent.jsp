<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<div id="myCarousel" class="carousel slide">
    <ol class="carousel-indicators">
        <li class="active" data-slide-to="0" data-target="#myCarousel"></li>
        <li data-slide-to="1" data-target="#myCarousel"></li>
        <li data-slide-to="2" data-target="#myCarousel"></li>
        <li data-slide-to="3" data-target="#myCarousel"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active">
            <img alt="First slide" src="${path}/images/banner-1.jpg">
        </div>
        <div class="item">
            <img alt="Second slide" src="${path}/images/banner-2.jpg">
        </div>
        <div class="item">
            <img alt="Third slide" src="${path}/images/banner-3.jpg">
        </div>
        <div class="item">
            <img alt="Third slide" src="${path}/images/banner-4.jpg">
        </div>
        <a data-slide="prev" href="#myCarousel" class="carousel-control left">
            <i class="icon-left"><img src="${path}/images/54354.png"></i>
        </a>
        <a data-slide="next" href="#myCarousel" class="carousel-control right">
            <i class="icon-right"><img src="${path}/images/4525424.png"></i>
        </a>
    </div>
</div>


<div class="main container">
    <!--第一部分开始-->
    <div class="main-a row">
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <div class="row text-center">
                <ul class="list-unstyled">
                    <li class="col-xs-12 up-1">
                        <img alt="" src="${path}/images/45354312.png">
                    </li>
                    <li class="up-2 col-xs-12">高效</li>
                    <li class="up-3 col-xs-12">将三到七年的成长时间,缩短到一年到两年</li>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <div class="row text-center">
                <ul class="list-unstyled">
                    <li class="col-xs-12 up-1">
                        <img alt="" src="${path}/images/879789.png">
                    </li>
                    <li class="up-2 col-xs-12">规范</li>
                    <li class="up-3 col-xs-12">标准到实战教程,不会走弯路</li>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <div class="row text-center">
                <ul class="list-unstyled">
                    <li class="col-xs-12 up-1">
                        <img alt="" src="${path}/images/786453654365.png">
                    </li>
                    <li class="up-2 col-xs-12">人脉</li>
                    <li class="up-3 col-xs-12">同班好友,同院学长,技术大师,入学就混职脉圈,为以后铺平道路</li>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 text-center">
            <p>
                <img src="${path}/images/453254312.png">12400<br>
                <span class="up-3">累计在线学习人数</span>
            </p>
            <p>
                <img src="${path}/images/453254312.png">12400<br>
                <span class="up-3">学员已经找到满意工作</span>
            </p>
        </div>
    </div>

    <!--第二部分开始-->
    <div class="main-b row">
        <h3 class="text-center main-tab">如何学习</h3>
        <ul class="list-unstyled text-center">
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">1</span>
                <p class="up-2">匹配你现在的个人情况寻找适合自己的岗位</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">2</span>
                <p class="up-2">了解职业前景薪金待遇，竞争压力等</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">3</span>
                <p class="up-2">掌握行业内顶级技能</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">4</span>
                <p class="up-2">查看职业目标任务</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">5</span>
                <p class="up-2">参考学习资料，掌握技能点，逐个完成任务</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">6</span>
                <p class="up-2">加入班级，和小伙伴们互帮互动，一块学习</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">7</span>
                <p class="up-2">选择导师，一路引导，加速自己成长</p>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <span class="up-1 text-center">8</span>
                <p class="up-2">完成职业 技能，升级业界大牛</p>
                <span class="up-3 invisible"></span>
            </li>
        </ul>
    </div>

    <!--第三部分开始-->
    <div class="main-c row">
        <h3 class="text-center main-tab">优秀学员展示</h3>
        <ul class="list-unstyled text-center">
            <c:forEach var="excelStu" items="${excelStu}" begin="0" end="3">
                <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                    <div>
                        <img src="${path}/${excelStu.profilePic}">
                        <span>${excelStu.title}:${excelStu.name}</span>
                        <p class="text-left">
                                <%--限制输入的介绍字数--%>
                            <c:if test="${fn:length(excelStu.description)>45}">
                                ${fn:substring(excelStu.description,0 ,45 )}
                            </c:if>
                            <c:if test="${fn:length(excelStu.description)<=45}">
                                ${excelStu.description}
                            </c:if>
                        </p>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>

    <!--第四部分开始-->
    <div class="row main-bottom">
        <h3 class="text-center">战略合作企业</h3>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <ul class="logo">
                <li>
                    <a href=""><img src="${path}/images/123132.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${path}/images/1549865.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${path}/images/785345.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${path}/images/1471.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${path}/images/7861.png"></a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="main-e">
    <h3 class="text-center main-tab ">友情链接</h3>
    <div class="container">
        <ul class="text-justify">
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">找工作</a></li>
        </ul>
    </div>
</div>
