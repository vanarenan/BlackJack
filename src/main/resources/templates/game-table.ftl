<#--
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GAME</title>
    </head>
    <body style="background: #0F1E0B;">
        <div class="wrap" style="margin: 0 auto; padding: 50px; width: 1000px; height: 900px; background: green;">
    
          <h1>Computer cards:</h1>
          <ul style="display: flex; flex-wrap: wrap;">
              <li style="display: inline-block; margin: 30px;">
                  <img src="/img/fulldeck/back.png" alt="">
              </li>
              <li style="display: inline-block; margin: 30px;">
                  <img src="/img/fulldeck/back.png" alt="">
              </li>
              <li style="display: inline-block; margin: 30px;">
                  <img src="/img/fulldeck/back.png" alt="">
              </li>
          </ul>
          
          <h1>Player cards:</h1>
          <ul style="display: flex; flex-wrap: wrap;">
                <#list cards as card>
                    <li style="display: inline-block; margin: 30px;">
                        <img src="${card.img}" alt="">
                    </li>
                </#list>
            </ul>
        </div>
    </body>
</html>-->
<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/static/css/style.css" type="text/css">
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <title>Document</title>
</head>
<body>
<div class="table">
    <div class="backSideCard">
        <a id="bSideCard" href="/web/cards/pick">
            <img src="/img/img_1.png" alt="lol">
        </a>
    </div>
</div>
</div>
</body>
</html>
