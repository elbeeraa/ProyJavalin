<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
    <table>
        <tr>
            <th>Item</th>
            <th>Usuario</th>
            <th>Puja</th>
        </tr>
    <#list pujas as puja>    
        <tr>
            <td>${puja.nombreItem}</td>
            <td>${puja.nombreUsuario}</td>
            <td>${puja.precioPujado}</td>
        </tr>
     </#list>
    </table>
</body>
</html>