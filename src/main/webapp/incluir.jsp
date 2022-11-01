<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Incluir Produtos</title>
</head>
<body>
    <center>
        <table border="1">
            <form action="ServletProduto" method="post">
            <input type = "hidden" name ="cmd" value="incluir"> <br />
            <tbody>
                <tr>
                    <th colspan="2"><h2>Incluir Produto</h2></th>
                </tr>
                <tr>
                    <td>Código do Produto</td>
                    <td>
                        <input type="text" name="txtCod" size="50" maxlenght="10" required/>
                    </td>
                     </tr>
                <tr>
                    <td>Nome do Produto</td>
                    <td>
                        <input type="text" name="txtNome" size="50" maxlenght="20" required/>
                    </td>
                     </tr>
                <tr>
                    <td>Descrição do Produto</td>
                    <td>
                        <input type="text" name="txtDesc" size="50" maxlenght="50" required/>
                    </td>
                     </tr>
                <tr>
                    <td>Quantidade do Produto</td>
                    <td>
                        <input type="number" name="txtQuant" size="50" maxlenght="10" required/>
                    </td>
                </tr>

                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Enviar"></td>
                </tr>

            </tbody>
           </form>
        </table>
    </center>

</body>
</html>