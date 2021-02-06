<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="/static/style.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="<@spring.url '/style.css'/>"/>
        <title>Black Jack</title>
    </head>
    <body>
        <div class="table">
            <div style="text-align: center;">
                <h2>Player ${score} PC</h2>
                <a href="/newgame"><button>New Game</button></a>
                <a href="/stop"><button>Stop</button></a>
                <div style="text-align: center; margin-top: 20px;">
                    <a href="/pick"><img src="/img/fulldeck/back.png"></a>
                </div>
                <div class="message">
                    <a class="message">${message}</a>
                </div>
                <ul class="allCard">
                    <#list delivery as card>
                        <li><img src="${card.img}" alt="card"></li>
                    </#list>
                </ul>
<#--
                <ul class="allCard">
                    <#list pcdelivery as card>
                        <li>
                            <img src="${card.img}" alt="pcCard">
                        </li>
                    </#list>
                </ul>
-->
            </div>
        </div>
    </body>
</html>