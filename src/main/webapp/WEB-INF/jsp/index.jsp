<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="keywords" content="赛博朋克，机械，赛博机械，朋克，义体">
    <title>CyberMachine--About Cyberpunk</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="shortcut icon" href="source/images/favicon.ico"/>
    <%--    http://localhost:8080/ssm/    --%>
</head>

<script type="text/javascript">
    myVid = document.getElementById("audio");
    myVid.volume = 0.2;

</script>

<body onload="var versionNo = '1.1.1'; if(!window.localStorage.getItem('update-version') || window.localStorage.getItem('update-version') !=versionNo){
        window.localStorage.setItem('update-version',versionNo)
        alert('请把浏览器缩放至75%，谢谢配合。')
    }">
<audio src="source/audios/stranger_think%20-%20C418.mp3" autoplay="autoplay" loop="loop" id="audio" preload="auto"
       controls="controls"></audio>

<!--<div class="banner" id="left_banner">血 <br>肉 <br>苦 <br>弱 </div>-->
<!--<div class="banner" id="right_banner">机 <br>械 <br>飞 <br>升</div>-->

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
    <a href="loginAndRegister.html">Hello，${user}</a>


</div>
<div class="whole">
    <div class="nav">
        <img src="https://pic3.zhimg.com/v2-a31ab493692b90d88a36a63a90ceb9f2_r.jpg" alt="">
        <span class="iconfont pre">&#xe65a;</span>
        <span class="iconfont next">&#xe65c;</span>
    </div>
    <div class="introduction">
        <div>
            <div class="pink">只要你属于高科技社会的底层，抗拒主流文化，那么你在精神上就是"赛博朋克"。</div>
            <br>
            <div class="white">待人如待鼠，所有对鼠的措施都可以同等地施加给人,闭上眼拒绝思考并不能使这个惨不忍睹的画面消失。这就是赛博朋克。
                <br>
                经典的赛博朋克角色是边缘且性格疏远的独行者。他们生活在社会群体的边缘，一个弥漫反乌托邦氛围的未来：日常生活受到急剧改变的科技影响，普及的计算机化信息笼罩全球，以及侵入性的人体改造。
            </div>
        </div>

    </div>
    <div class="movie" id="video">
        <div class="left">
            <div class="pink">攻壳机动队</div>
            <div class="white">
                《攻壳机动队》是根据日本漫画家士郎正宗创作的同名漫画改编，随着通信网络技术和人体电子机械化技术的突飞猛进，电脑犯罪越来越猖獗和复杂，针对这一局面，政府成立了特殊部队公安九课打击犯罪活动的故事。
            </div>
            <div class="pink">斯嘉丽·约翰逊</div>
        </div>
        <div class="middle ">
            <div><a href="https://baike.baidu.com/item/%E6%94%BB%E5%A3%B3%E6%9C%BA%E5%8A%A8%E9%98%9F/15900854">intro</a>
            </div>
            <div><a href="https://17kyun.com/jx.php?url=https://www.bilibili.com/bangumi/play/ss34311">video</a></div>
            <div><a href="">music</a></div>
        </div>
        <div class="right">
            <img src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwmoov.com%2Fassets%2Fmovie%2Fphoto%2F201703%2FFB_IMG_1489514821839_1489643958.jpg&refer=http%3A%2F%2Fwmoov.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1638456394&t=3b4bc49bd5775b59cb114a8966505d5d"
                 alt="">
        </div>
    </div>
    <div class="movie">
        <div class="left">
            <div class="pink">英雄联盟：双城之战</div>
            <div class="white">
                在充满蒸汽朋克气息的乌托邦-皮尔特沃夫和由化学品驱动的地下城-祖安中，蔚和金克丝两姐妹，她们由于全新的半魔法半科学的海克斯科技，导致她们在一场激烈的碰撞后发现两个人站在了彼此的对立面。她们从此分开，走上不同的道路，朝着不同的命运终
                点走去，但心中的羁绊又无时不刻地让姐妹二人想要破镜重圆，心怀正义的 姐姐蔚也拼尽全力，誓要战胜地下城中的一切邪恶。
            </div>
            <div class="pink">英雄联盟</div>
        </div>
        <div class="middle ">
            <div><a href="http://lol.qq.com/arcane/index.html">intro</a></div>
            <div><a href="doubleCity.html">video</a></div>
            <div><a href="http://lol.qq.com/arcane/index.html#mod4">music</a></div>
        </div>
        <div class="right">
            <img src="source/images/double_city.jpg" alt="">
        </div>
    </div>
    <div class="movie">
        <div class="left">
            <div class="pink">阿基拉</div>
            <div class="white">《阿基拉》是由东宝株式会社出品，于1988年7月16日在日本上映。该作品根据大友克洋的原作漫画改编，讲述未来的日本东京，军方一直在秘密进行的“阿基拉”项目导致巨大灾难的故事。
            </div>
            <div class="pink">大友克洋</div>
        </div>
        <div class="middle ">
            <div><a href="https://baike.baidu.com/item/%E9%98%BF%E5%9F%BA%E6%8B%89/74016">intro</a></div>
            <div><a href="https://www.acfun.cn/bangumi/aa6002683">video</a></div>
            <div><a href="">music</a></div>
        </div>
        <div class="right">
            <img src="https://image11.m1905.cn/uploadfile/2019/0314/20190314023816166415.jpg" alt="">
        </div>
    </div>
    <div class="music" id="music">
        <div class="title pink">
            Synthwave 合成器浪潮音乐
        </div>
        <div class="content">
            <div>
                <div class="up">The Midnight</div>
                <div class="middle">
                    <img src="data:image/jpeg;base64,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"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=12023492" class="down"><span class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up">FM-84</div>
                <div class="middle">
                    <img src="https://ts4.cn.mm.bing.net/th/id/OIP-C.mKMbaGFWKHc3Dz1Vl5i_MwHaHa?w=166&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.7"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=12046467" class="down"><span class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up">Timecop1983</div>
                <div class="middle">
                    <img src="https://ts1.cn.mm.bing.net/th?id=OIP-C.8l5STPNqMadd5Zd7MuZjzQD6D6&w=170&h=170&c=8&rs=1&qlt=90&o=6&dpr=1.25&pid=3.1&rm=2"
                         alt="">
                </div>

                <a href="https://music.163.com/#/artist?id=954496" class="down"><span
                        class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up">LeBrock</div>
                <div class="middle">
                    <img src="data:image/jpeg;base64,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"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=13970913" class="down"><span class="iconfont">&#xe80f;</span></a>
            </div>

            <div>
                <div class="up">Lost Years</div>
                <div class="middle">
                    <img src="https://ts1.cn.mm.bing.net/th?id=OIP-C.6m-E06hpwAnqQCyAp0IAwwHaHa&w=158&h=170&c=8&rs=1&qlt=90&o=6&dpr=1.25&pid=3.1&rm=2"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=844854" class="down"><span
                        class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up">Nina</div>
                <div class="middle">
                    <img src="http://www.down512.com/data/attachment/forum/202109/02/204400wcb0goklb88kkz22.jpg" alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=149874" class="down"><span
                        class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up"> Neon Nox</div>
                <div class="middle">
                    <img src="https://ts1.cn.mm.bing.net/th?id=OIP-C.EPr23757RdQzxoH13_VpRQHaFj&w=206&h=170&c=8&rs=1&qlt=90&o=6&dpr=1.25&pid=3.1&rm=2"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=29813033" class="down"><span class="iconfont">&#xe80f;</span></a>
            </div>
            <div>
                <div class="up"> DWTD</div>
                <div class="middle">
                    <img src="https://tse4-mm.cn.bing.net/th/id/OIP-C.5zOU59dqXWYqfkc3nO4R6gHaHa?pid=ImgDet&rs=1"
                         alt="">
                </div>
                <a href="https://music.163.com/#/artist?id=999192" class="down"><span
                        class="iconfont">&#xe80f;</span></a>
            </div>
        </div>
    </div>
    <div class="game">
        <!--            <img src="https://uploadfile.bizhizu.cn/up/fc/35/8c/fc358cdb228b7d08741510f613c6c17c.jpg" alt="">-->
        <!--            <span class="iconfont">&#xe80f;</span>-->
        <video src="source/videos/cyberpunk1-40.mp4" controls="controls" preload="auto"
               poster="https://uploadfile.bizhizu.cn/up/fc/35/8c/fc358cdb228b7d08741510f613c6c17c.jpg"></video>
    </div>
    <div class="introduction">
        <div>
            <div class="pink" style="font-size: 70px">Cyberpunk2077</div>
            <br>
            <div class="white">《赛博朋克2077》是开发商CD Projekt RED公布的一款角色扮演游戏，故事设定在黑暗的、科技极度发达的腐败未来夜之城。
                <br>
                这是一座五光十色的大都会，权力更迭和身体改造是不变的主题。您扮演一名野心勃勃的雇佣兵：V，正在追寻一种独一无二的植入体。只要得到它，就能掌握获得永生的关键。您可以自定义角色的义体、技能和玩法，探索包罗万象的城市。您做出的选择也将会对剧情和周遭的世界产生影响。
            </div>
        </div>
    </div>
    <div class="picture" id="picture">
        <div>
            <img src="source/images/cyber/Cyberpunk%20(1).png" alt="">
        </div>
        <div>
            <div><img src="https://pic1.zhimg.com/80/v2-801c5b7a6d03d640018bda3ce7f89554_720w.jpg" alt=""></div>
            <div><img src="https://pic3.zhimg.com/80/v2-99f37bf20e534723faaac0d269ffbe5e_720w.jpg" alt=""></div>
        </div>
        <div>
            <img src="source/images/cyber/Cyberpunk%20(2).png" alt="">
        </div>
        <div>
            <img src="source/images/cyber/Cyberpunk%20(4).jpg" alt="">
        </div>

    </div>
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