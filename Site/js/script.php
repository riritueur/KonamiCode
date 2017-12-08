<script type="text/javascript">
  var keyy = [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1];
  var next = false;
  var konami = false;
  var keyy2 = [-1, -1, -1, -1];

  if (!konami) {
    window.onkeydown = function(e) {
      if (!konami) {
        var j = 0;
        for (var i = 0; i < keyy.length; i++)
          if (keyy[i] != -1)
            j++;


        if (j == 10) {
          for (var i = 0; i < keyy.length - 1; i++)
            keyy[i] = keyy[i + 1];
          keyy[keyy.length - 1] = e.keyCode;
        }

        if (keyy[0] == -1) {
          keyy[0] = e.keyCode;
        } else if (keyy[1] == -1) {
          keyy[1] = e.keyCode;
        } else if (keyy[2] == -1) {
          keyy[2] = e.keyCode;
        } else if (keyy[3] == -1) {
          keyy[3] = e.keyCode;
        } else if (keyy[4] == -1) {
          keyy[4] = e.keyCode;
        } else if (keyy[5] == -1) {
          keyy[5] = e.keyCode;
        } else if (keyy[6] == -1) {
          keyy[6] = e.keyCode;
        } else if (keyy[7] == -1) {
          keyy[7] = e.keyCode;
        } else if (keyy[8] == -1) {
          keyy[8] = e.keyCode;
        } else if (keyy[9] == -1) {
          keyy[9] = e.keyCode;
        }

        $(function() {
          autoStart: false,
          $('.textB').textillate({ in: {
              effect: 'fadeInLeftBig',
              delay: 5
            }
          });
        });

        $(function() {
          autoStart: false,
          $('.textB2').textillate({ in: {
              effect: 'fadeInLeftBig',
              delay: 5
            }
          });
        });

        $(function() {
          autoStart: false,
          $('.textB3').textillate({ in: {
              effect: 'fadeInLeftBig',
              delay: 5
            }
          });
        });
      }
      if (keyy[0] == 38 && keyy[1] == 38 && keyy[2] == 40 && keyy[3] == 40 && keyy[4] == 37 && keyy[5] == 39 && keyy[6] == 37 && keyy[7] == 39 && keyy[8] == 66 && keyy[9] == 65 && !konami) {
        konami = true;
        var fullscrn = document.getElementById("body");
        fullscrn.rques
        req = fullscrn.requestFullScreen || fullscrn.webkitRequestFullScreen || fullscrn.mozRequestFullScreen;
        req.call(fullscrn);
        var millisecondsToWait = 700;
        document.getElementById("body").className = "blackB";
        setTimeout(function() {
          document.getElementById("body").className = "black";
        }, millisecondsToWait);

        setTimeout(function() {
          document.getElementById("body").innerHTML = "<img src=\"Logo.png\" alt=\"Team Cookies\" width=\"300\" height=\"300\" class=\"imageCenter\"/><p class=\"textB\"> Initialisation Error :<br/><br/>Starting new instance of the webpage.<br/><br/></p>";
          $('.textB').textillate('start');

          $('.textB').on('end.tlt', function() {
            setTimeout(function() {
              document.getElementById("body").innerHTML = '<img src=\"Logo.png\" alt=\"Team Cookies\" width=\"300" height=\"300" class=\"imageCenter"/><p class=\"textB2\">There is no way back. <br/><br/></p>';
              $('.textB2').textillate('start');
              $('.textB2').on('end.tlt', function() {
                setTimeout(function() {
                  document.getElementById("body").innerHTML = '<img src=\"Logo.png" alt=\"Team Cookies" width=\"300" height=\"300" class=\"imageCenter"/><p class=\"textB22\">There is no way back. <br/><br/></p><p class=\"textB3\">Or maybe ?</p>';
                  $('.textB3').textillate('start');
                  next = true;
                  $('.textB3').on('end.tlt', function() {
                    setTimeout(function() {
                      var file_path = './BetterLowerTheVolume.jar';
                      var a = document.createElement('A');
                      a.href = file_path;
                      a.download = file_path.substr(file_path.lastIndexOf('/') + 1);
                      document.body.appendChild(a);
                      a.click();
                      document.body.removeChild(a);
                    }, 500);
                  });
                }, 1500);
              });
            }, 500);
          });
        }, millisecondsToWait + 100);
      }

      if (next) {
        var j = 0;
        for (var i = 0; i < keyy2.length; i++)
          if (keyy2[i] != -1)
            j++;


        if (j == 4) {
          for (var i = 0; i < keyy2.length - 1; i++)
            keyy2[i] = keyy2[i + 1];
          keyy2[keyy2.length - 1] = e.keyCode;
        }

        if (keyy2[0] == -1) {
          keyy2[0] = e.keyCode;
        } else if (keyy2[1] == -1) {
          keyy2[1] = e.keyCode;
        } else if (keyy2[2] == -1) {
          keyy2[2] = e.keyCode;
        } else if (keyy2[3] == -1) {
          keyy2[3] = e.keyCode;
        }

        if (keyy2[0] == 76 && keyy2[1] == 85 && keyy2[2] == 76 && keyy2[3] == 90) {
          document.getElementById("body").innerHTML = '<img src=\"Logo.png" alt=\"Team Cookies" width=\"300" height=\"300" class=\"imageCenter"/><p class=\"textB3\">Oh, I guess you\'re not like the others. You seem to have something special. I will keep an eye on you for the future. Keep building the future but don\'t forget the past.</p>';
          $('.textB3').textillate('start');
          $('.textB3').on('end.tlt', function() {
            setTimeout(function() {
              document.location.href = "https://www.konami.com/games/eu/fr/";
            }, 500);
          });
        }
      };
    }

</script>
