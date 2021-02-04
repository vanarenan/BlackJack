<#--
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GAME</title>
    </head>
    <body style="background: grey;">
        <div class="wrap" style="margin: 0 auto; width: 1000px; height: 90%; min-height: 500px; background: green;">
            <ul style="display: flex; flex-wrap: wrap;">
                <#list deck as card>
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
    <title>Black Jack</title>
</head>
<body>
<div class="container">
    <a class="btnStop" href="/web/cards/stop">
        <button>Stop</button>
    </a>
    <div class="table">
        <div class="backSideCard">
            <h1>Round ${round}</h1>

            <a id="bSideCard" href="/web/cards/pick">
                <h1 style="position: absolute; margin-left: 25px ; color: aliceblue;border: solid black;background: black">${sizeDeck}</h1>
                <img src="/img/back.png" alt="lol">
            </a>
        </div>
        <div class="cardPlayer">
            <h3 class="sumCard">${sum}</h3>
            <ul>
                <#list delivery as card>

                    <li>

                        <img src="${card.img}" alt="card">
                    </li>

                </#list>
            </ul>
        </div>
    </div>
</div>
</body>
</html>