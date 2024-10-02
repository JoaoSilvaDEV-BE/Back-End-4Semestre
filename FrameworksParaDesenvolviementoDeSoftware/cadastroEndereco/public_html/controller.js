function buscarEndereco() {
    let cep = document.getElementById("cep").value;

    // Remover caracteres não numéricos
    cep = cep.replace(/\D/g, '');

    if (cep.length !== 8) {
        alert("CEP inválido! O CEP deve conter 8 números.");
        return;
    }

    const url = `https://viacep.com.br/ws/${cep}/json/`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            if (data.erro) {
                alert("CEP não encontrado!");
                return;
            }

            document.getElementById("rua").value = data.logradouro;
            document.getElementById("bairro").value = data.bairro;
            document.getElementById("cidade").value = data.localidade;
            document.getElementById("estado").value = data.uf;
        })
        .catch(error => {
            alert("Erro ao buscar o endereço. Tente novamente.");
            console.error(error);
        });
}
