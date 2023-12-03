function login() {
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;


    fetch('/api/usuarios/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            email: email,
            senha: senha,
        }),
    })
    .then(response => {
        if (response.ok) {
            return response.text();
        } else {
            throw new Error('Falha na autenticação');
        }
    })
    .then(token => {
        console.log('Token de acesso:', token);
    })
    .catch(error => {
        console.error('Erro:', error.message);
    }); 
}

function cadastrar() {
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senhaCadastro').value;

    // Fazer uma requisição AJAX para o endpoint de cadastro no backend
    fetch('/api/usuarios/cadastro', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            nome: nome,
            email: email,
            senha: senha,
        }),
    })
    .then(response => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error('Falha no cadastro');
        }
    })
    .then(usuario => {
        console.log('Cadastro realizado com sucesso:', usuario);
    })
    .catch(error => {
        console.error('Erro:', error.message);
    });
}   