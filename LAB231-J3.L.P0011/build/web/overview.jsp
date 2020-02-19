<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title> Overview </title>
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
            <div class="row">
                <div class="col-sm-8">
                    <div class="heading">
                        <h1 class="page-title">Overview - My Blog</h1>
                    </div>
                    <div class="content">
                        <table>

                            <tr>
                                <th>Title</th>
                                <th class="date">Date</th>
                            </tr>
                            <c:forEach items="${list}" var="post">
                                <tr>
                                    <td><a href="">${post.pTitle}</a></td>
                                    <td class="date">${post.date}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="card" style="width: 18rem;">
                        <div class="card-body">
                            <h5 class="card-title">Share this page</h5>
                            <div class="p-1">
                                <ul>
                                    <li><a id="share-facebook" href="https://www.facebook.com/blackBEO.99"><i class="fab fa-facebook-square"></i><span>Share on
                                                Facebook</span></a></li>
                                    <li><a id="share-twitter" href="https://www.facebook.com/blackBEO.99"><i class="fab fa-twitter-square"></i><span>Share
                                                on
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
    </body>

</html>