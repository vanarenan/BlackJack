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
</html>