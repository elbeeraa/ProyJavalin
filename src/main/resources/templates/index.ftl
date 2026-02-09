<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
    <h1>LISTADO DE PUJAS</h1>
    <#list itemPujasList as itempujas>
        <h2>[${itempujas.getItem().getId()}] ${itempujas.getItem().getNombre()}</h2>
        <p>Precio inicial: ${itempujas.getItem().getPrecio()} €</p>
        <table>
                <tr>
                    <th>ID</th>
                    <th>Usuario</th>
                    <th>Puja</th>
                </tr>
            <#list itempujas.getPujas() as puja>
                <tr>
                    <td>${puja.idUsuario}</td>
                    <td>${puja.nombreUsuario}</td>
                    <td>${puja.precioPujado} €</td>
                </tr>
             </#list>
        </table>
    </#list>
</body>
</html>