<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="edu.uniminuto.arqsw.proyecto.Hibernate.Evento"%>
<%@page import="edu.uniminuto.arqsw.proyecto.DAO.EventoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar eventos</title>
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
                        <a class="active" href="listEvents.jsp">Listar Eventos</a>
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
                        <a href="#">Crear Categoría</a>
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
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Nombre</th>
                                        <th>Inicio</th>
                                        <th>Fin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <%
                                EventoDAO edao = new EventoDAO();
                                
                                List<Evento> list = edao.getAll();
                                
                                for(Evento evnt : list){
                                %>    
                                  <tr>
                                      <td><%= evnt.getNombre() %></td>
                                      <td><%= evnt.getFechaInicio() %></td>
                                      <td><%= evnt.getFechaFin() %></td>
                                  </tr>  
                                <%    
                                }
                                %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
