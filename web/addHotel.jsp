<%@page import="edu.uniminuto.arqsw.proyecto.Hibernate.Ciudad"%>
<%@page import="edu.uniminuto.arqsw.proyecto.DAO.CiudadDAO"%>
<%@page import="edu.uniminuto.arqsw.proyecto.Hibernate.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="edu.uniminuto.arqsw.proyecto.DAO.CategoriaDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel</title>
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
                        <a href="#">Foro</a>
                    </li>
                    <li>
                        <a href="addCiudad.jsp">Crear Ciudad</a>
                    </li>
                    <li>
                        <a class="active" href="addHotel.jsp">Crear Hotel</a>
                    </li>
                    <li>
                        <a href="addCategoria.jsp">Crear Categoría</a>
                    </li>                    
                    <li>
                        <a href="#">Opcional</a>
                    </li>
                </ul>
            </div>

            <!-- contenido -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>Crear Hotel</h1>
                            <form action="HotelServlet" method="post">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input class="form-control" id="nombre" name="nombre" required="true" autocomplete="off" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <label for="categoria">Categoria</label>
                                        <select class="form-control" id="categoria" name="categoria" required="true">
                                            <%
                                                CategoriaDAO cd = new CategoriaDAO();
                                                for (Categoria c : cd.getAllCategorias()) {
                                            %>
                                                <option value="<%= c.getId() %>"><%= c.getCategoria() %></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="ciudad">Ciudad</label>
                                        <select class="form-control" name="ciudad" id="ciudad" required>
                                            <%
                                                CiudadDAO cityd = new CiudadDAO();
                                                for (Ciudad city : cityd.getAllCities()) {
                                            %>
                                                <option value="<%= city.getId() %>"><%= city.getNombre() %></option>
                                            <%
                                                }
                                            %>
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
