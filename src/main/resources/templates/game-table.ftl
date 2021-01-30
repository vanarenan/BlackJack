<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GAME</title>
</head>
<body style="background: grey;">
    <div class="wrap" style="margin: 0 auto; width: 300%; height: 90%; background: green">
       <#--${card.suit}
        ${card.nominal}
        <img src="${card.img}" style="height: 120px;width: 70px" alt="залупа какая-то в коде получается">-->
        <ul style="display: block; justify-content: center; width: 100%;">
            <#list deck as card>
                <li style="display: inline-block; margin: 10px;">
                    <img src="${card.img}" height="125" width="83" alt="какая-то лажа в коде, братан">
                </li>
            </#list>
        </ul>
    </div>>
</body>
</html>