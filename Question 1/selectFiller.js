var months = ["January", "February", "March", "April", "May", "June",
                  "July", "August", "September", "October", "November", "December"];
    var sports = ["Athletics", "Basketball", "Cricket", "Football", "Hockey", "Swimming", "Tennis"];
    var currMonth = "January";
    var minYear = 1950;
    var maxYear = 2017;
    var daySel = document.getElementById('day');
    var monSel = document.getElementById('month');
    var yeaSel = document.getElementById('year');
    var spoSel = document.getElementById('sport');
    
    for (var i = 0; i < months.length; i++)
    {
      var opt = document.createElement('option');
      opt.innerHTML = months[i];
      opt.value = months[i];
      monSel.appendChild(opt);
    }
    
    for (var i = minYear; i <= maxYear; i++)
    {
      var opt = document.createElement('option');
      opt.innerHTML = i;
      opt.value = i;
      yeaSel.appendChild(opt);
    }
    
    for (var d = 1; d <= 31; d++)
    {
      var opt = document.createElement('option');
      opt.innerHTML = d;
      opt.value = d;
      daySel.appendChild(opt);
    }
    
    for (var s = 0; s < sports.length; s++)
    {
      var opt = document.createElement('option');
      opt.innerHTML = sports[s];
      opt.value = sports[s];
      spoSel.appendChild(opt);
    }
    
    function changeMonth(sel)
    {
      while (daySel.firstChild)
      {
        daySel.removeChild(daySel.firstChild);
      }
      
      currMonth = sel;
      
      if ((currMonth == 0) || (currMonth == 2) || (currMonth == 4) || (currMonth == 6) ||
          (currMonth == 7) || (currMonth == 9) || (currMonth == 11))
      {
        for (var d = 1; d <= 31; d++)
        {
          var opt = document.createElement('option');
          opt.innerHTML = d;
          opt.value = d;
          daySel.appendChild(opt);
        }
      }else if ((currMonth == 3) || (currMonth == 5) || (currMonth == 8) || (currMonth == 10))
      {
        for (var d = 1; d <= 30; d++)
        {
          var opt = document.createElement('option');
          opt.innerHTML = d;
          opt.value = d;
          daySel.appendChild(opt);
        }
      }else if ((currMonth == 1))
      {
        for (var d = 1; d <=29; d++)
        {
          var opt = document.createElement('option');
          opt.innerHTML = d;
          opt.value = d;
          daySel.appendChild(opt);
        }
      }
    }