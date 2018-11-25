<%@page import="freeVue.*,java.util.List"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Free Vue</title>
  </head>
  <body>
  <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Date</th>
      <th scope="col">Venue</th>
      <th scope="col">Film</th>
      <th scope="col">Tickets</th>
    </tr>
  </thead>
  <tbody>

<%
  Database db = new Database();
  List<Screening> screenings = db.getScreenings();
  
  for(Screening s: screenings){
     out.print( s.htmlTr() ); 
  }

%>
  </tbody>
  </table>
  </body>
</html>