<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categoria</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css" />
        <link rel="stylesheet" href="recursos/css/simple-sidebar.css" />
        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div id="wrapper">

            <!-- sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <li class="sidebar-brand">
                        <a href="index.jsp">
                            Viajes Unimonito
                        </a>
                    </li>
                    <li>
                        <a href="addEvento.jsp">Crear Evento</a>
                    </li>
                    <li>
                        <a href="listEvents.jsp">Listar Eventos</a>
                    </li>
                    <li>
                        <a href="#">Foro</a>
                    </li>
                    <li>
                        <a href="addCiudad.jsp">Crear Ciudad</a>
                    </li>
                    <li>
                        <a href="addHotel.jsp">Crear Hotel</a>
                    </li>
                    <li>
                        <a class="active" href="addCategoria.jsp">Crear Categoría</a>
                    </li>                    
                    <li>
                        <a href="#"></a>
                    </li>
                </ul>
            </div>

            <!-- contenido -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>Crear Categoria</h1>
                            <form action="CategoriaServlet" method="post">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="categoria">Categoria</label>
                                        <input class="form-control" id="categoria" name="categoria" required="true" autocomplete="off" autofocus>
                                            <!--<option value="1 estrella">1 Estrella</option>
                                            <option value="2 estrellas">2 Estrellas</option>
                                            <option value="3 estrellas">3 Estrellas</option>
                                            <option value="4 estrellas">4 Estrellas</option>
                                            <option value="5 estrellas">5 Estrellas</option>
                                        </select>-->
                                    </div>
                                    <div class="form-group">
                                        <label for="puntuacion">Puntuacion</label>
                                        <select class="form-control" id="puntuacion" name="puntuacion" required="true">
                                            <option value="1">Por debajo del promedio</option>
                                            <option value="2">Aceptable</option>
                                            <option value="3">Bueno</option>
                                            <option value="4">Muy bueno</option>
                                            <option value="5">Excelente</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success center-block">Crear Categoria</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
