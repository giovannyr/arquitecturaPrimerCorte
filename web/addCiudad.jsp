<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear ciudad</title>
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
                        <a class="active" href="addCiudad.jsp">Crear Ciudad</a>
                    </li>
                    <li>
                        <a href="addHotel.jsp">Crear Hotel</a>
                    </li>
                    <li>
                        <a href="addCategoria.jsp">Crear Categoría</a>
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
                            <h1>Crear Ciudad</h1>
                            <form action="CiudadServlet" method="post">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="nombre">Nombre Ciudad</label>
                                        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required="true" autocomplete="off" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <label for="pais">País</label>
                                        <input type="text" list="paises" class="form-control" id="pais" name="pais" placeholder="País" required="true" autocomplete="off">
                                        <datalist id="paises">
                                            <option value="Colombia">
                                            <option value="Ecuador">
                                            <option value="Peru">
                                            <option value="Argentina">
                                            <option value="Brazil">
                                        </datalist>
                                    </div>
                                    <div class="form-group">
                                        <label for="continente">Continente</label>
                                        <select class="form-control" id="continente" name="continente" required="true" autocomplete="off">
                                            <option value="America">America</option>
                                            <option value="Europa">Europa</option>
                                            <option value="Africa">Africa</option>
                                            <option value="Asia">Asia</option>
                                            <option value="Oceania">Oceania</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success center-block">Crear Ciudad</button>
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
