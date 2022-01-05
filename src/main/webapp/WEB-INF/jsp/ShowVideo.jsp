<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chen.ssm.po.Movie" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>Video-CyberMachine</title>
    <link rel="stylesheet" href="css/video.css">
    <link rel="shortcut icon" href="source/images/favicon.ico"/>
</head>
<body>
<div id="totop"><a href="#top"><span class="iconfont">&#xe844;</span></a></div>
<div class="header">
    <span class="iconfont">&#x35b4;</span>
    <div id="cyber">赛博机械</div>
    <a href="https://baike.baidu.com/item/%E8%B5%9B%E5%8D%9A%E6%9C%8B%E5%85%8B/4096935">概念</a>
    <a href="video.jsp">视频</a>
    <a href="picture.jsp">图片</a>
    <a href="music.jsp">音乐</a>
    <a href="https://github.com/C-176"><span class="iconfont">&#xe65e;</span></a>
    <a href=""><span class="iconfont">&#xe65f;</span></a>
    <a href="https://www.zhihu.com/people/chen-le-2-28"><span class="iconfont">&#xe851;</span></a>
    <a href="loginAndRegister.html">Hello,${user}</a>
</div>

<div class="whole">
    <div class="introduction" id="top">
        <div>
            <div class="pink">只要你属于高科技社会的底层，抗拒主流文化，那么你在精神上就是"赛博朋克"。</div>
            <br>
            <div class="white">待人如待鼠，所有对鼠的措施都可以同等地施加给人,闭上眼拒绝思考并不能使这个惨不忍睹的画面消失。这就是赛博朋克。<br>
                经典的赛博朋克角色是边缘且性格疏远的独行者。他们生活在社会群体的边缘，一个弥漫反乌托邦氛围的未来：日常生活受到急剧改变的科技影响，普及的计算机化信息笼罩全球，以及侵入性的人体改造。
            </div>
            <form action="searchMovie">
                <label>

                    <input type="text" placeholder="<%=session.getAttribute("searchInfo")%>" name="searchInfo">
                </label>
                <button><span class="iconfont">&#xe7a9;</span></button>
            </form>
        </div>
    </div>

    <%
        ArrayList movieList = (ArrayList) session.getAttribute("movieList");

        if (movieList.size() != 0) {
            for (int i = 0; i < movieList.size(); i++) {
                Movie movie = (Movie) movieList.get(i);
    %>
    <div class="movie" id="video">
        <div class="left">
            <div class="pink"><%=movie.getMovieName() %>
            </div>
            <div class="white"><%=movie.getMovieDetail()%>
            </div>
            <div class="pink"><%=movie.getMovieMainActress()%>
            </div>
        </div>
        <div class="right">
            <a href=<%=movie.getMovieUrl() %>><img src="<%=movie.getMoviePicture() %>" alt=""></a>
        </div>
    </div>
    <%
        }
    } else {
        System.out.println("deadhead");%>
    <div class="result" style="margin: 0 auto;
    height: 150px;
    width: 1450px;
    font-size: 40px;
    color: #ffffff;background-color: #0e0f25;line-height: 150px">
        <%--        <div>--%>
        <div class="white">没有搜索到相关视频</div>
        <%--        </div>--%>
    </div>
    <%--</div>--%>
    <% }
    %>
</div>
<div class="foot">
    <a href=""><span class="iconfont">&#xe78d;</span></a>
    <a href=""><span class="iconfont">&#xe78e;</span></a>
    <a href=""><span class="iconfont">&#xe89e;</span></a>
    <a href=""><span class="iconfont">&#xe89f;</span></a>
    <span>--Leo Chen</span>
</div>
</body>
</html>