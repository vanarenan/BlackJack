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
</html>