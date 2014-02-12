<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <meta name="msapplication-TileColor" content="#5bc0de" />
    <meta name="msapplication-TileImage" content="${resource(dir: 'assets/img/', file: 'metis-tile.png')}" />
    <link rel="stylesheet"  href="${resource(dir: 'assets/lib/bootstrap/css/', file: 'bootstrap.min.css')}">
    <link rel="stylesheet"  href="${resource(dir: 'assets/css/', file: 'main.css')}"/>
    <link rel="stylesheet"  href="${resource(dir: 'assets/lib/magic/', file: 'magic.css')}" >
    <script>
      (function(i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function() {
          (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
        m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
      })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');
      ga('create', 'UA-1669764-16', 'onokumus.com');
      ga('send', 'pageview');
    </script>
  </head>
  <body class="login">
    <div class="container">
      <div class="text-center" style="font-weight:bold; color:#999; font-size:22px">
       LF-Tech Git Mgmt
      </div>
      <div class="tab-content">
        <div id="login" class="tab-pane active">
        
        <div class="errors">
    <ul><li>${flash.error}</li></ul>
</div>
        
        
        
        
          <form action="${resource('file': 'j_spring_security_check')}" method="POST" class="form-signin">
            <p class="text-muted text-center">
              Enter your username and password
            </p>
            
              <g:textField placeholder="Username" class="form-control" name="j_username"/>
          
             <g:passwordField placeholder="Password" class="form-control" name="j_password"/>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
        </div>
        
       
      </div>
      <div class="text-center">
        <ul class="list-inline">
          <li> <a class="text-muted" href="#login" data-toggle="tab">Login</a>  </li>
         
        </ul>
      </div>
    </div><!-- /container -->
    <script  src="${resource(dir: 'assets/lib/', file: 'jquery.min.js')}"></script>
    <script  src="${resource(dir: 'assets/lib/bootstrap/js/', file: 'bootstrap.js')}"></script>
    <script>
      $('.list-inline li > a').click(function() {
        var activeForm = $(this).attr('href') + ' > form';
        //console.log(activeForm);
        $(activeForm).addClass('magictime swap');
        //set timer to 1 seconds, after that, unload the magic animation
        setTimeout(function() {
          $(activeForm).removeClass('magictime swap');
        }, 1000);
      });
    </script>
  </body>
</html>