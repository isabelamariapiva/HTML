<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/style.css" rel="stylesheet" />
    <title>CEPlocation</title>
</head>

<body>
    <form method="get" action=".">
        <label> Cep:
            <input type="text" name="cep" id="cep" size="10" maxlength="9" onblur="pesquisacep(this.value);">
        </label>
        <label> Rua:
            <input name="rua" id="rua" type="text" size="60" />
        </label>
        <label> Bairro:
            <input name="bairro" id="bairro" type="text" size="40" />
        </label>
        <label> Cidade:
            <input name="cidade" id="cidade" type="text" size="60" />
        </label>
        <label> Estado:
            <input name="estado" id="estado" type="text" size="60" />
        </label>
        <label> UF:
            <input name="uf" id="uf" type="text" size="60" />
        </label>
        <label> Região:
            <input name="regiao" id="regiao" type="text" size="40" />
        </label>
        <label> IBGE:
            <input name="ibge" id="ibge" type="text" size="60" />
        </label>
        <label> DDD:
            <input name="ddd" id="ddd" type="text" size="60" />
        </label>
    </form>
  <script src="js/script.js"></script>
</body>

</html>









css

body {
    font-family: Arial, sans-serif;
    background-color: #f3f3f3;
    padding: 40px;
     box-sizing: border-box;
    margin: 0;
    padding: 0;
}

h1 {
    text-align: center;
    margin-bottom: 30px;
    color: #333;
}

form {
    max-width: 600px;
    margin: 0 auto;
    background-color: #fff;
    padding: 25px 30px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
}

label {
    display: block;
    margin-bottom: 15px;
    font-weight: bold;
    color: #444;
}

input[type="text"] {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border: 1px solid #ccc;
    border-radius: 4px;
    font-size: 14px;
}

input[type="text"]:focus {
    border-color: #007bff;
    outline: none;
}

@media (max-width: 600px) {
    form {
        padding: 20px;
    }
}



js
function pesquisacep(valor) {
    var cep = valor.replace(/\D/g, '');

    if (cep !== "") {
        var validacep = /^[0-9]{8}$/;

        if (validacep.test(cep)) {
            document.getElementById('rua').value = "...";
            document.getElementById('bairro').value = "...";
            document.getElementById('cidade').value = "...";
            document.getElementById('estado').value = "...";
            document.getElementById('uf').value = "...";
            document.getElementById('regiao').value = "...";
            document.getElementById('ibge').value = "...";
            document.getElementById('ddd').value = "...";

            fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => {
                    if (!response.ok) {
                        throw new Error('Erro na requisição');
                    }
                    return response.json();
                })
                .then(data => {
                    if (data.erro) {
                        alert('CEP não encontrado');
                        return;
                    }

                    document.getElementById('rua').value = data.logradouro || "";
                    document.getElementById('bairro').value = data.bairro || "";
                    document.getElementById('cidade').value = data.localidade || "";
                    document.getElementById('estado').value = data.estado || "";
                    document.getElementById('uf').value = data.uf || "";
                    document.getElementById('regiao').value = data.regiao || "";
                    document.getElementById('ibge').value = data.ibge || "";
                    document.getElementById('ddd').value = data.ddd || "";
                })
                .catch(error => {
                    alert('Erro ao buscar CEP: ' + error.message);
                });
        } else {
            alert('Formato de CEP inválido.');
        }
    }
}
