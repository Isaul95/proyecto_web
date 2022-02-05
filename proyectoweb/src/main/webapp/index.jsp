<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
<div class="container">
<div class="row justify-content-md-center"></div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
  
  <h1>Login</h1>
  
  <form name="form" action="<c:url value='/login'/>"
                    method="POST">
                    
  <div class="mb-3">
    <label for="exampleInputText1" class="form-label">usuario</label>
    <input type="text" class="form-control" id="exampleInputText1">
    </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Contraseña</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Comprobar</label>
  </div>
  <button type="submit" class="btn btn-primary">Ingresar</button>
</form>
  </div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>


<!--  
<form name="form" action="<c:url value='/login'/>"
                    method="POST">
                     
<form action ="consultadatos">
</form>

<input class="controls" type="text" name="usuario"  value="" placeholder="usuario">
<input class="controls" type="password" name="contraseña" value="" placeholder="contraseña">
<input class="buttons" type="submit" name="" value="ingresar">
</form>
<p><a href="#">¿Olvidaste tu contraseña?</a></p>
</section>-->
</body>
</html>