<%@page import="edu.uniminuto.arqsw.proyecto.Hibernate.Ciudad"%>
<%@page import="edu.uniminuto.arqsw.proyecto.DAO.CiudadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario Crear Evento</title>
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
                        <a class="active" href="addEvento.jsp">Crear Evento</a>
                    </li>
                    <li>
                        <a href="listEvents.jsp">Listar eventos</a>
                    </li>
                    <li>
                        <a href="#"></a>
                    </li>
                    <li>
                        <a href="#"></a>
                    </li>
                    <li>
                        <a href="#"></a>
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
                            <h1>Crear evento</h1>
                            <form action="EventoServlet" method="post">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="nombre">Nombre Evento</label>
                                        <input value="" type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required="true" autocomplete="off" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <label for="tipo">Tipo Evento</label>
                                        <input value="" type="text" class="form-control" id="tipo" name="tipo" placeholder="Tipo" required="true" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="ciudad">Ciudad</label>
                                        <select class="form-control" id="ciudad" name="ciudad" required="true" autocomplete="off">
                                            <%
                                                CiudadDAO cd = new CiudadDAO();
                                                for (Ciudad c : cd.getAllCities()) {
                                            %>        
                                            <option value="<%= c.getId()%>"><%= c.getNombre()%></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="fecha_inicio">Fecha de inicio</label>
                                        <input type="date" class="form-control" id="fecha_inicio" name="fecha_inicio" placeholder="Fecha inicio" required="true" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <label for="fecha_fin">Fecha de finalizacion</label>
                                        <input type="date" class="form-control" id="fecha_fin" name="fecha_fin" placeholder="Fecha fin" required="true" autocomplete="off">
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success center-block">Crear Evento</button>
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
