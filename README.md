index.html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Makeup studio</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="light-theme">
 <h1>Makeup studio</h1>
 <p id="msg">Produtos de maquiagem favoritos:</p>

 <table>
    <tr>
        <th>Produto</th>
        <th>Marca</th>
        <th>Preço</th>
    </tr>
    <tr>
        <td>Base</td>
        <td>Fenty beauty</td>
        <td>R$200,00</td>
        </tr>
        <tr>
            <td>Batom</td>
            <td>Mac</td>
            <td>R$79,00</td>
        </tr>
        <tr>
            <td>Blush</td>
            <td>Nars</td>
            <td>R$270,00</td>
        </tr>
    </table>

            <br />

            <img
            src="https://www.estadao.com.br/recomenda/wp-content/uploads/2024/06/AdobeStock_273553300_Preview.jpeg.webp"
            alt="Maquiagem"
            width="400"
            id="makeup-img"
            />

      <br />
      <a href="https://www.sephora.com.br/" target="_blank" rel="noopener noreferrer">
        Confira mais produtos na Sephora
    </a>

   <script src="app.js"></script>
   <noscript>voce precisa habilitar o java Script para ver o site completo .</noscript>
   </body>
   </html>


        
 system.csss
 body {
font-family: monospace;
background: var(--bg);
color: var(--fontColor);
margin: 20px;
}

ul {
font-family: helvetica;
}

li {
list-style: circle;
}

.list {
list-style: square;
}

:root {
--green: #f7beeb;
--white: #ffffff;
--black: #000000;
}

.light-theme {
--bg: var(--green);
--fontColor: var(--black);
--btnBg: var(--black);
--btnFontColor: var(--white);
}

* {
color: var(--fontColor);
font-family: helvetica;
}
table {
margin: 20px auto;
border-collapse: collapse;
width: 70%;
box-shadow: 0 0 10px var(--btnBg);
}

th,
td {
border: 1px solid var(--btnFontColor);
padding: 12px;
}

th {
background-color: var(--btnBg);
color: var(--btnFontColor);
}

td {
background-color: var(--bg);
}

a {
display: block;
text-align: center;
margin: 20px;
color: var(--btnBg);
font-weight: bold;
text-decoration: none;
}

a:hover {
text-decoration: underline;
}

img#makeup-img {
display: block;
margin: 20px auto;
border-radius: 10px;
cursor: pointer;
transition: transform 0.3s ease;
}

img#makeup-img:hover {
transform: scale(1.05);
}


.btn:focus {
outline-style: none;
}learning html.....
