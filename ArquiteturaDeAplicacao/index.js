// importando o express
const express = require('express');
const app = express();

// definindo a porta onde o serviodor sera executado
const port = 3000;

//  definindo a portal principal
app.get('/', (req, res) => {
    res.send('Realizei de forma completa a atividade solicitada, [João Paulo]!');
});

// iniciando o servidor
app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});