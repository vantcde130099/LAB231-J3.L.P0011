<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title> Blog </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="vendor/bootstrap.css">
        <link rel="stylesheet" href="vendor/font-awesome.css">
        <link rel="stylesheet" href="1.css">
        <script src="https://kit.fontawesome.com/eee6e774ce.js" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="container" id="big">
            <div class="container-fluid header-wrapper">
                <div class="title-wrapper-inner">
                    <div class="container">
                        <div class="title pt-3">
                            <h2>Blogging About My Life</h2>
                        </div>
                        <div class="subtitle">Welcome to my blog</div>
                    </div>
                </div>
                <nav class="navbar navbar-expand navbar-light bg-light pt-2">
                    <div class="nav navbar-nav">
                        <a class="nav-item nav-link active" href="#">My Blog <span class="sr-only">(current)</span></a>
                        <a class="nav-item nav-link" href="aboutme.html">About Me</a>
                    </div>
                </nav>
            </div>

            <div class="container">
                <div class="row content-inner">
                    <div class="col-sm-8">
                        <div class="heading">
                            <h1 class="page-title">My Blog</h1>
                        </div>
                        <div class="content">
                            <div class="avatar">
                                <i class="fas fa-pencil-alt"></i>
                            </div>
                            <div class="section">
                                <div class="item">
                                    <table>
                                        <c:forEach items="${list}" var="post">
                                            <tr>
                                            <div class="controls">
                                                <span class="date-text">${post.date}</span>
                                            </div>
                                            </tr>
                                            <tr>
                                            <div class="heading">
                                                <h4><a href="">${post.pTitle}</a></h4>
                                            </div>
                                            </tr>
                                            <tr>
                                            <div class="content">
                                                <div class="img-simple span6 pull-left">
                                                    <img class="img-fluid rounded mx-auto d-block" src="${post.pPic}" alt="">
                                                </div>
                                                <p>${post.pContent}</p>
                                            </div>
                                            </tr>
                                            <hr width="100%" align="center" />
                                        </c:forEach>
                                    </table>
                                </div>                                
                            </div>
                            <div class="overview">
                                <a href="">Overview</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm 4">
                        <div class="card" style="width: 18rem;">
                            <div class="card-body">
                                <h5 class="card-title">Share this page</h5>
                                <div class="p-1">
                                    <ul>
                                        <li><a id="share-facebook" href="https://www.facebook.com/blackBEO.99"><i
                                                    class="fab fa-facebook-square"></i></i><span>Share on
                                                    Facebook</span></a></li>
                                        <li><a id="share-twitter" href="https://www.facebook.com/blackBEO.99"><i
                                                    class="fab fa-twitter-square"></i></i><span>Share on
                                                    Twitter</span></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <hr width="100%" align="center" />
                <div class="container">
                    <div class="footer">
                        <span>This website was created with team3</span>
                        <span class="counter">123</span>
                    </div>
                </div>
            </div>

            <script type="text/javascript" src="1.js"></script>
    </body>

</html>