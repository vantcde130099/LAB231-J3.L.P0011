<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="d" uri="/WEB-INF/tlds/display"%>
<jsp:useBean id="counter" class="Controller.CountFilter" scope="application"></jsp:useBean>
    <!DOCTYPE html>
    <html lang="en-US" class="">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>My Blog</title>

            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <link rel="stylesheet" type="text/css" href="./home_files/9767673.design.v27169.css">


            <script src="https://kit.fontawesome.com/eee6e774ce.js" crossorigin="anonymous"></script>
            <script async="" src="./home_files/gtm.js.download"></script>            

            <style type="text/css">
                .fancybox-margin {
                    margin-right: 17px;
                }
            </style>
        </head>

        <body data-pid="422328564" data-iid="">
            <div class="container-fluid site-wrapper">            
                <div class="container-fluid header-wrapper " id="header">                
                    <div class="container">
                        <div class="title-wrapper">
                            <div class="title-wrapper-inner">
                                <a rel="nofollow" class="logo " href="">
                                </a>
                                <div class="title ">
                                    Blogging About My Life
                                </div>
                                <div class="subtitle">
                                    Welcome to my blog
                                </div>
                            </div>
                        </div>
                        <div class="navbar navbar-compact">
                            <div class="navbar-inner">
                                <div class="container">                          
                                    <a rel="nofollow" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"
                                       title="Toggle menu">
                                        <span class="menu-name">Menu</span>
                                        <span class="menu-bars">
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </span>
                                    </a>                                
                                    <div class="nav-collapse collapse">
                                        <ul class="nav" id="topMenu" data-submenu="horizontal">
                                            <li class=" active " style="">
                                                <a rel="nofollow" href="${homeurl}">My
                                                    Blog</a>
                                            </li>
                                            <li class="  " style="">
                                                <a rel="nofollow" href="${aboutmeurl}">About
                                                    Me</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>                    
                    </div>
                </div> 
                <div class="container-fluid content-wrapper" id="content">                
                    <div class="container">
                        <div class="row-fluid content-inner">
                            <div id="left" class="span9">                            
                                <div class="wrapper blog">
                                    <div class="heading">
                                        <h1 class="page-title">My Blog</h1>
                                    </div>
                                    <div class="content">
                                    <c:forEach items="${first}" var="post">
                                        <table>
                                            <div class="section">
                                                <div class="item">
                                                    <div class="content">
                                                        <div class="avatar">
                                                            <i class="fas fa-pencil-alt icon-4x"></i>
                                                        </div>
                                                        <div class="controls">
                                                            <span class="date-text">${post.date}</span>
                                                        </div>
                                                        <div class="heading">
                                                            <h4><a rel="nofollow"
                                                                   href="">${post.pTitle}</a></h4>
                                                        </div>
                                                        </tr>
                                                        <div class="content">
                                                            <div class="img-simple span6 pull-left">
                                                                <div class="image">
                                                                    <a rel="nofollow" data-ss="imagemodal"
                                                                       data-href=""><img
                                                                            src="${post.pPic}"></a>
                                                                </div>
                                                            </div>
                                                            <p>${post.pContent}</p>                                                            
                                                        </div>
                                                    </div>                                                     
                                                </div>
                                            </div>
                                        </table>
                                    </c:forEach>
                                    <c:forEach items="${second}" var="post">
                                        <table>
                                            <div class="section">                                            
                                                <div class="content">
                                                    <div class="avatar">
                                                        <i class="fas fa-quote-left icon-4x"></i>
                                                    </div>
                                                    <div class="item">
                                                        <div class="controls">
                                                            <span class="date-text">${post.date}</span>
                                                        </div>
                                                        <div class="heading">
                                                            <h4><a rel="nofollow"
                                                                   href="">${post.pTitle}</a></h4>
                                                        </div>
                                                        <div class="content">
                                                            <blockquote class="pull-right">
                                                                <p>${post.pContent}</p>                                                        
                                                            </blockquote>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </table>
                                    </c:forEach>
                                    <c:forEach items="${third}" var="post"><table>
                                            <div class="section">
                                                <div class="content">
                                                    <div class="avatar">
                                                        <i class="fas fa-camera-retro icon-4x"></i>
                                                    </div>
                                                    <div class="item">
                                                        <div class="controls">
                                                            <span class="date-text">${post.date}</span>
                                                        </div>
                                                        <div class="heading">
                                                            <h4><a rel="nofollow"
                                                                   href="">${post.pTitle}</a>
                                                            </h4>
                                                        </div>
                                                        <div class="content">
                                                            <div class="img-simple  ">
                                                                <div class="image">
                                                                    <a rel="nofollow" data-ss="imagemodal"
                                                                       data-href=""><img
                                                                            src="${post.pPic}"></a>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </table>            </c:forEach>
                                        <ul class="pager">
                                            <li><a rel=""
                                                   href="${url}">Overview</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div id="right" class="span3">
                            <div class="sidebar">
                                <div class="wrapper share-box">
                                    <style>
                                        .wordwrapfix {
                                            word-wrap: break-word;
                                        }
                                    </style>
                                    <div class="heading wordwrapfix">
                                        <h4>Share this page</h4>
                                    </div>

                                    <div class="content"><span>
                                            <ul>
                                                <li><a id="share-facebook"
                                                       href=""><i class="fab fa-facebook-square"></i><span>Share on
                                                            Facebook</span></a></li>
                                                <li><a id="share-twitter"
                                                       href=""><i class="fab fa-twitter-square"></i><span>Share on Twitter</span></a>
                                                </li>
                                            </ul>
                                        </span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid footer-wrapper" id="footer">                
                <div class="container">
                    <div class="footer-info">
                        <div class="footer-info-text">
                            This website was created with team 3
                        </div>
                    </div>
                    <div class="footer-page-counter" style="display: block;">
                        <span>${hit}</span>
                    </div>
                    <div id="css_simplesite_com_fallback" class="hide"></div>
                </div>
            </div> 

            <div style="display: none; visibility: hidden;">            
                <noscript></noscript>
            </div>
        </div>
    </body>

</html>    